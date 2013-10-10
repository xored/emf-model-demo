package com.xored.estore_demo;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.xored.estore_demo.cache.ModelEntryCache;
import com.xored.estore_demo.impl.Estore_demoFactoryImpl;
import com.xored.estore_demo.persistence.PersistedAttribute;
import com.xored.estore_demo.persistence.PersistedObject;
import com.xored.estore_demo.persistence.PersistenceChunk;
import com.xored.estore_demo.persistence.PersistenceFactory;

public class ResourceBasedEStoreModel implements InternalEObject.EStore {
	private static final int MAX_OBJECTS = 500;
	private ModelEntry rootEntry;

	// Readonly objects cache
	private ModelEntryCache entriesCache = new ModelEntryCache(25);

	private IFolder objectsRoot;

	public ResourceBasedEStoreModel(IFile indexFile, IFolder objectsRoot) {
		rootEntry = new ModelEntry(indexFile);
		rootEntry.save(true);
		this.objectsRoot = objectsRoot;
	}

	private synchronized ModelEntry getEntry(InternalEObject object) {
		return getModelEntry(object.eProxyURI().opaquePart());
	}

	private ModelEntry getModelEntry(String fileName) {
		ModelEntry modelEntry = (ModelEntry) entriesCache.get(fileName);
		if (modelEntry != null) {
			return modelEntry;
		}

		IFile file = this.objectsRoot.getFile(fileName);
		ModelEntry e = new ModelEntry(file);
		entriesCache.put(fileName, e);
		return e;
	}

	@Override
	public Object get(InternalEObject object, EStructuralFeature feature,
			int index) {

		ModelEntry entry = getEntry(object);
		PersistedObject obj = entry.getObject(object.eProxyURI().toString());
		PersistedAttribute attribute = getAttribute(feature, obj, false);
		if (attribute == null) {
			return null;
		}
		if (feature instanceof EAttribute) {
			if (attribute.getValue().size() > 0) {
				return EcoreUtil.createFromString(((EAttribute) feature)
						.getEAttributeType(), attribute.getValue().get(0));
			}
			return null;
		} else if (feature instanceof EReference) {
			return getObjectWithID((EReference) feature, attribute.getValue()
					.get(index));
		}
		return null;
	}

	private Object getObjectWithID(EReference ref, String id) {
		EObject obj = internalCreate(ref.getEReferenceType());
		((InternalEObject) obj).eSetProxyURI(URI.createURI(id));
		return obj;
	}

	@Override
	public Object set(InternalEObject object, EStructuralFeature feature,
			int index, Object value) {

		ModelEntry entry = getEntry(object);
		PersistedObject obj = entry.getObject(object.eProxyURI().toString());
		PersistedAttribute attribute = getAttribute(feature, obj, true);
		if (feature instanceof EAttribute) {
			attribute.getValue().clear();
			attribute.getValue().clear();
			attribute.getValue().add(
					EcoreUtil.convertToString(
							((EAttribute) feature).getEAttributeType(), value));

		} else if (feature instanceof EReference && value instanceof EObject) {
			attribute.getValue().set(index,
					((InternalEObject) value).eProxyURI().toString());
		}
		entry.modified();
		return null;
	}

	@Override
	public boolean isSet(InternalEObject object, EStructuralFeature feature) {
		ModelEntry entry = getEntry(object);
		PersistedObject obj = entry.getObject(object.eProxyURI().toString());
		PersistedAttribute attribute = getAttribute(feature, obj, false);
		return attribute != null;
	}

	@Override
	public void unset(InternalEObject object, EStructuralFeature feature) {
		ModelEntry entry = getEntry(object);
		PersistedObject obj = entry.getObject(object.eProxyURI().toString());
		PersistedAttribute attribute = getAttribute(feature, obj, false);
		if (attribute != null) {
			obj.getAttributes().remove(attribute);
			entry.modified();
		}
	}

	@Override
	public boolean isEmpty(InternalEObject object, EStructuralFeature feature) {
		ModelEntry entry = getEntry(object);
		PersistedObject obj = entry.getObject(object.eProxyURI().toString());
		PersistedAttribute attribute = getAttribute(feature, obj, false);
		return attribute == null || attribute.getValue().isEmpty();
	}

	@Override
	public int size(InternalEObject object, EStructuralFeature feature) {
		ModelEntry entry = getEntry(object);
		PersistedObject obj = entry.getObject(object.eProxyURI().toString());
		PersistedAttribute attribute = getAttribute(feature, obj, false);
		if (attribute != null) {
			return attribute.getValue().size();
		}
		return 0;
	}

	@Override
	public boolean contains(InternalEObject object, EStructuralFeature feature,
			Object value) {
		ModelEntry entry = getEntry(object);
		PersistedObject obj = entry.getObject(object.eProxyURI().toString());
		PersistedAttribute attribute = getAttribute(feature, obj, false);
		if (attribute != null && value instanceof EObject) {
			return attribute.getValue().contains(
					((InternalEObject) value).eProxyURI().toString());
		}
		return false;
	}

	@Override
	public int indexOf(InternalEObject object, EStructuralFeature feature,
			Object value) {
		ModelEntry entry = getEntry(object);
		PersistedObject obj = entry.getObject(object.eProxyURI().toString());
		PersistedAttribute attribute = getAttribute(feature, obj, false);
		if (attribute != null && value instanceof EObject) {
			return attribute.getValue().indexOf(
					((InternalEObject) value).eProxyURI().toString());
		}
		return -1;
	}

	@Override
	public int lastIndexOf(InternalEObject object, EStructuralFeature feature,
			Object value) {
		ModelEntry entry = getEntry(object);
		PersistedObject obj = entry.getObject(object.eProxyURI().toString());
		PersistedAttribute attribute = getAttribute(feature, obj, false);
		if (attribute != null && value instanceof EObject) {
			return attribute.getValue().lastIndexOf(
					((InternalEObject) value).eProxyURI().toString());
		}
		return -1;
	}

	@Override
	public void add(InternalEObject object, EStructuralFeature feature,
			int index, Object value) {
		ModelEntry entry = getEntry(object);
		URI uri = ((InternalEObject) object).eProxyURI();
		PersistedObject obj = entry.getObject(uri.toString());
		if (feature instanceof EReference) {
			PersistedAttribute attribute = getAttribute(feature, obj, true);
			if (value instanceof EObject) {
				URI proxy = ((InternalEObject) value).eProxyURI();
				if (proxy != null) {
					attribute.getValue().add(proxy.toString());
				}
			}
		}
		entry.modified();
	}

	private PersistedAttribute getAttribute(EStructuralFeature feature,
			PersistedObject obj, boolean create) {
		EList<PersistedAttribute> attributes = obj.getAttributes();
		for (PersistedAttribute attr : attributes) {
			if (attr.getName().equals(feature.getName())) {
				return attr;
			}
		}
		if (create) {
			PersistedAttribute attr = PersistenceFactory.eINSTANCE
					.createPersistedAttribute();
			attr.setName(feature.getName());
			obj.getAttributes().add(attr);
			return attr;
		}
		return null;
	}

	@Override
	public Object remove(InternalEObject object, EStructuralFeature feature,
			int index) {
		ModelEntry entry = getEntry(object);
		URI uri = ((InternalEObject) object).eProxyURI();
		PersistedObject obj = entry.getObject(uri.toString());
		Object result = null;
		if (feature instanceof EReference) {
			PersistedAttribute attribute = getAttribute(feature, obj, true);
			result = getObjectWithID((EReference) feature, attribute.getValue()
					.remove(index));
		}
		entry.modified();
		return result;
	}

	@Override
	public Object move(InternalEObject object, EStructuralFeature feature,
			int targetIndex, int sourceIndex) {
		ModelEntry entry = getEntry(object);
		PersistedObject obj = entry.getObject(object.eProxyURI().toString());
		PersistedAttribute attribute = getAttribute(feature, obj, false);
		if (attribute != null) {
			return attribute.getValue().move(targetIndex, sourceIndex);
		}
		entry.modified();
		return null;
	}

	@Override
	public void clear(InternalEObject object, EStructuralFeature feature) {
		ModelEntry entry = getEntry(object);
		URI uri = ((InternalEObject) object).eProxyURI();
		PersistedObject obj = entry.getObject(uri.toString());
		if (feature instanceof EReference) {
			PersistedAttribute attribute = getAttribute(feature, obj, false);
			if (attribute != null) {
				obj.getAttributes().remove(attribute);
			}

		}
		entry.modified();
	}

	@Override
	public Object[] toArray(InternalEObject object, EStructuralFeature feature) {
		ModelEntry entry = getEntry(object);
		PersistedObject obj = entry.getObject(object.eProxyURI().toString());
		PersistedAttribute attribute = getAttribute(feature, obj, false);
		if (attribute != null && feature instanceof EReference) {
			List<Object> values = new ArrayList<Object>();
			for (String id : attribute.getValue()) {
				values.add(getObjectWithID((EReference) feature, id));
			}
			return values.toArray();
		}
		return new Object[0];
	}

	@Override
	public <T> T[] toArray(InternalEObject object, EStructuralFeature feature,
			T[] array) {
		ModelEntry entry = getEntry(object);
		PersistedObject obj = entry.getObject(object.eProxyURI().toString());
		PersistedAttribute attribute = getAttribute(feature, obj, false);
		if (attribute != null && feature instanceof EReference) {
			List<Object> values = new ArrayList<Object>();
			for (String id : attribute.getValue()) {
				values.add(getObjectWithID((EReference) feature, id));
			}
			return values.toArray(array);
		}
		return new ArrayList<T>().toArray(array);
	}

	@Override
	public int hashCode(InternalEObject object, EStructuralFeature feature) {
		return (((InternalEObject) object).eProxyURI().devicePath() + feature
				.getName()).hashCode();
	}

	@Override
	public InternalEObject getContainer(InternalEObject object) {
		return null;
	}

	@Override
	public EStructuralFeature getContainingFeature(InternalEObject object) {
		return null;
	}

	@Override
	public EObject create(EClass eClass) {
		InternalEObject eobj = internalCreate(eClass);

		synchronized (this) {
			EList<EObject> contents = rootEntry.getContents();
			URI uri = null;
			PersistenceChunk chunk = null;
			for (EObject c : contents) {
				PersistenceChunk ch = (PersistenceChunk) c;
				if (ch.getObjectsCount() < MAX_OBJECTS) {
					chunk = ch;
					uri = getObjectURI(chunk, eobj);
					break;
				}
			}
			if (uri == null) {
				// Enumeration elements = entriesCache.elements();
				// while (elements.hasMoreElements()) {
				// ModelEntry nextElement = (ModelEntry) elements.nextElement();
				// nextElement.save(false);
				// }
				rootEntry.save(true);
				// Create new chunk
				chunk = PersistenceFactory.eINSTANCE.createPersistenceChunk();
				chunk.setFileName("chunk_" + System.currentTimeMillis());
				chunk.setObjectsCount(0);
				chunk.setObjectsIndex(0);
				contents.add(chunk);
				uri = getObjectURI(chunk, eobj);
			}

			eobj.eSetProxyURI(uri);
			ModelEntry entry = getModelEntry(chunk.getFileName());
			PersistedObject obj = PersistenceFactory.eINSTANCE
					.createPersistedObject();
			obj.setId(uri.toString());
			entry.putObject(obj);
			entry.modified();

			rootEntry.save(true);
		}
		return eobj;
	}

	private URI getObjectURI(PersistenceChunk chunk, InternalEObject eobj) {
		int index = chunk.getObjectsIndex();
		chunk.setObjectsIndex(index + 1);
		chunk.setObjectsCount(chunk.getObjectsCount() + 1);
		return org.eclipse.emf.common.util.URI.createGenericURI("estore",
				chunk.getFileName(), Integer.toString(index));
	}

	private InternalEObject internalCreate(EClass eClass) {
		InternalEObject eobj = (InternalEObject) Estore_demoFactoryImpl.eINSTANCE
				.create(eClass);
		eobj.eSetStore(this);
		return eobj;
	}

	public void save() {
		// Save all unsaved objects
		Enumeration elements = entriesCache.elements();
		while (elements.hasMoreElements()) {
			ModelEntry nextElement = (ModelEntry) elements.nextElement();
			nextElement.save(true);
		}
		rootEntry.save(true);
	}

	public EObject findObject(String uri, EClass cl) {
		InternalEObject obj = internalCreate(cl);
		obj.eSetProxyURI(URI.createURI(uri));
		return obj;
	}
}

package com.xored.estore_demo;

import java.io.IOException;
import java.io.OutputStream;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.resources.IFolder;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.Path;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.InternalEObject.EStore;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import com.xored.estore_demo.persistence.PersistenceFactory;
import com.xored.estore_demo.persistence.RootObject;

public class EStoreResourceImpl extends XMIResourceImpl {
	private IFile rootFile;
	private IFolder objectsRoot;
	private ResourceBasedEStoreModel store = null;

	public EStoreResourceImpl(IFile rootFile) {
		super(URI.createPlatformResourceURI(rootFile.getFullPath().toString(),
				true));
		this.rootFile = rootFile;
		objectsRoot = this.rootFile.getParent().getFolder(
				new Path("data_" + rootFile.getName()));
		if (!objectsRoot.exists()) {
			try {
				objectsRoot.create(true, true, new NullProgressMonitor());
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		store = new ResourceBasedEStoreModel(objectsRoot.getFile("index.demo"),
				objectsRoot);
		if (!this.rootFile.exists()) {
			try {
				save(null);
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	@Override
	public void attached(EObject eObject) {
		URI eProxyURI = ((InternalEObject) eObject).eProxyURI();
		if (eProxyURI != null) {
			RootObject obj = PersistenceFactory.eINSTANCE.createRootObject();
			obj.setUri(eProxyURI.toString());
			getContents().remove(eObject);
			getContents().add(obj);
		}
	}

	@Override
	public void detached(EObject eObject) {
		URI eProxyURI = ((InternalEObject) eObject).eProxyURI();
		if (eProxyURI != null) {
			RootObject obj = PersistenceFactory.eINSTANCE.createRootObject();
			obj.setUri(eProxyURI.toString());
			super.detached(obj);
		}
	}

	public EObject getEObject(EObject obj, EClass cl) {
		if( obj instanceof RootObject) {
			return store.findObject(((RootObject) obj).getUri(), cl);
		}
		
		return null;
	}
	
	@Override
	public EList<EObject> getContents() {
		return super.getContents();
	}

	public EStore getStore() {
		return store;
	}

	@Override
	public void doSave(OutputStream outputStream, Map<?, ?> options)
			throws IOException {
		store.save();
		super.doSave(outputStream, options);
	}

	public EObject getRoot(int index, EClass cl) {
		return getEObject(getContents().get(index), cl);
	}
}

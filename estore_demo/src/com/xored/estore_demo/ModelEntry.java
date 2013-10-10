package com.xored.estore_demo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceImpl;

import com.xored.estore_demo.persistence.PersistedObject;

public class ModelEntry {

	private IFile file;
	private Resource resource = new XMIResourceImpl();
	private int changes = 0;

	public ModelEntry(IFile indexFile) {
		this.file = indexFile;
		load();
	}

	public void load() {
		try {
			if (file.exists()) {
				Map<String, Object> options = new HashMap<String, Object>();
				resource.load(file.getContents(), options);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void save(boolean force) {
		if (changes == 0 && !force) {
			return;
		}
		changes = 0;
		try {
			ByteArrayOutputStream bout = new ByteArrayOutputStream();
			resource.save(bout, null);
			ByteArrayInputStream bytes = new ByteArrayInputStream(
					bout.toByteArray());
			if (file.exists()) {
				file.setContents(bytes, true, false, new NullProgressMonitor());
			} else {
				file.create(bytes, true, new NullProgressMonitor());
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public PersistedObject getObject(String uri) {
		EList<EObject> contents = resource.getContents();
		for (EObject eObject : contents) {
			PersistedObject o = (PersistedObject) eObject;
			if (o.getId().equals(uri)) {
				return o;
			}
		}
		return null;
	}

	public void putObject(PersistedObject obj) {
		this.resource.getContents().add(obj);
	}

	public EList<EObject> getContents() {
		return resource.getContents();
	}

	public Resource getResource() {
		return resource;
	}

	public void modified() {
		changes++;
	}
}

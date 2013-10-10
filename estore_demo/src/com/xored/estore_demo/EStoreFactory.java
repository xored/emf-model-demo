package com.xored.estore_demo;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import com.xored.estore_demo.impl.Estore_demoFactoryImpl;

public class EStoreFactory extends Estore_demoFactoryImpl {
	private EStore model;

	public EStoreFactory(EStoreResourceImpl resource) {
		this.model = resource.getStore();
	}

	@Override
	public EObject create(EClass eClass) {
		return this.model.create(eClass);
	}

	@Override
	public DemoRoot createDemoRoot() {
		return (DemoRoot) create(Estore_demoPackage.eINSTANCE.getDemoRoot());
	}

	@Override
	public Organization createOrganization() {
		return (Organization) create(Estore_demoPackage.eINSTANCE
				.getOrganization());
	}

	@Override
	public Person createPerson() {
		return (Person) create(Estore_demoPackage.eINSTANCE.getPerson());
	}

	@Override
	public Task createTask() {
		return (Task) create(Estore_demoPackage.eINSTANCE.getTask());
	}
}

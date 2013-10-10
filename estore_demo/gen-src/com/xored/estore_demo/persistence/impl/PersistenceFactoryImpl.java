/**
 */
package com.xored.estore_demo.persistence.impl;

import com.xored.estore_demo.persistence.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class PersistenceFactoryImpl extends EFactoryImpl implements PersistenceFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PersistenceFactory init() {
		try {
			PersistenceFactory thePersistenceFactory = (PersistenceFactory)EPackage.Registry.INSTANCE.getEFactory(PersistencePackage.eNS_URI);
			if (thePersistenceFactory != null) {
				return thePersistenceFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new PersistenceFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case PersistencePackage.PERSISTENCE_CHUNK: return createPersistenceChunk();
			case PersistencePackage.ROOT_OBJECT: return createRootObject();
			case PersistencePackage.PERSISTED_OBJECT: return createPersistedObject();
			case PersistencePackage.PERSISTED_ATTRIBUTE: return createPersistedAttribute();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistenceChunk createPersistenceChunk() {
		PersistenceChunkImpl persistenceChunk = new PersistenceChunkImpl();
		return persistenceChunk;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RootObject createRootObject() {
		RootObjectImpl rootObject = new RootObjectImpl();
		return rootObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistedObject createPersistedObject() {
		PersistedObjectImpl persistedObject = new PersistedObjectImpl();
		return persistedObject;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistedAttribute createPersistedAttribute() {
		PersistedAttributeImpl persistedAttribute = new PersistedAttributeImpl();
		return persistedAttribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PersistencePackage getPersistencePackage() {
		return (PersistencePackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static PersistencePackage getPackage() {
		return PersistencePackage.eINSTANCE;
	}

} //PersistenceFactoryImpl

/**
 */
package com.xored.estore_demo.persistence;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.xored.estore_demo.persistence.PersistencePackage
 * @generated
 */
public interface PersistenceFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistenceFactory eINSTANCE = com.xored.estore_demo.persistence.impl.PersistenceFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Chunk</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Chunk</em>'.
	 * @generated
	 */
	PersistenceChunk createPersistenceChunk();

	/**
	 * Returns a new object of class '<em>Root Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Root Object</em>'.
	 * @generated
	 */
	RootObject createRootObject();

	/**
	 * Returns a new object of class '<em>Persisted Object</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persisted Object</em>'.
	 * @generated
	 */
	PersistedObject createPersistedObject();

	/**
	 * Returns a new object of class '<em>Persisted Attribute</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Persisted Attribute</em>'.
	 * @generated
	 */
	PersistedAttribute createPersistedAttribute();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	PersistencePackage getPersistencePackage();

} //PersistenceFactory

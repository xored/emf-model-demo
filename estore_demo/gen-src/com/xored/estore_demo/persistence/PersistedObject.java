/**
 */
package com.xored.estore_demo.persistence;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Persisted Object</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.xored.estore_demo.persistence.PersistedObject#getId <em>Id</em>}</li>
 *   <li>{@link com.xored.estore_demo.persistence.PersistedObject#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.xored.estore_demo.persistence.PersistencePackage#getPersistedObject()
 * @model
 * @generated
 */
public interface PersistedObject extends EObject {
	/**
	 * Returns the value of the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Id</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Id</em>' attribute.
	 * @see #setId(String)
	 * @see com.xored.estore_demo.persistence.PersistencePackage#getPersistedObject_Id()
	 * @model
	 * @generated
	 */
	String getId();

	/**
	 * Sets the value of the '{@link com.xored.estore_demo.persistence.PersistedObject#getId <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Id</em>' attribute.
	 * @see #getId()
	 * @generated
	 */
	void setId(String value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link com.xored.estore_demo.persistence.PersistedAttribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see com.xored.estore_demo.persistence.PersistencePackage#getPersistedObject_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<PersistedAttribute> getAttributes();

} // PersistedObject

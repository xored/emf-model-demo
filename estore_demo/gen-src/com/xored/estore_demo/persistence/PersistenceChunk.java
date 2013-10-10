/**
 */
package com.xored.estore_demo.persistence;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Chunk</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.xored.estore_demo.persistence.PersistenceChunk#getFileName <em>File Name</em>}</li>
 *   <li>{@link com.xored.estore_demo.persistence.PersistenceChunk#getObjectsCount <em>Objects Count</em>}</li>
 *   <li>{@link com.xored.estore_demo.persistence.PersistenceChunk#getObjectsIndex <em>Objects Index</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.xored.estore_demo.persistence.PersistencePackage#getPersistenceChunk()
 * @model
 * @generated
 */
public interface PersistenceChunk extends EObject {
	/**
	 * Returns the value of the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>File Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>File Name</em>' attribute.
	 * @see #setFileName(String)
	 * @see com.xored.estore_demo.persistence.PersistencePackage#getPersistenceChunk_FileName()
	 * @model
	 * @generated
	 */
	String getFileName();

	/**
	 * Sets the value of the '{@link com.xored.estore_demo.persistence.PersistenceChunk#getFileName <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>File Name</em>' attribute.
	 * @see #getFileName()
	 * @generated
	 */
	void setFileName(String value);

	/**
	 * Returns the value of the '<em><b>Objects Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects Count</em>' attribute.
	 * @see #setObjectsCount(int)
	 * @see com.xored.estore_demo.persistence.PersistencePackage#getPersistenceChunk_ObjectsCount()
	 * @model
	 * @generated
	 */
	int getObjectsCount();

	/**
	 * Sets the value of the '{@link com.xored.estore_demo.persistence.PersistenceChunk#getObjectsCount <em>Objects Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objects Count</em>' attribute.
	 * @see #getObjectsCount()
	 * @generated
	 */
	void setObjectsCount(int value);

	/**
	 * Returns the value of the '<em><b>Objects Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Objects Index</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Objects Index</em>' attribute.
	 * @see #setObjectsIndex(int)
	 * @see com.xored.estore_demo.persistence.PersistencePackage#getPersistenceChunk_ObjectsIndex()
	 * @model
	 * @generated
	 */
	int getObjectsIndex();

	/**
	 * Sets the value of the '{@link com.xored.estore_demo.persistence.PersistenceChunk#getObjectsIndex <em>Objects Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Objects Index</em>' attribute.
	 * @see #getObjectsIndex()
	 * @generated
	 */
	void setObjectsIndex(int value);

} // PersistenceChunk

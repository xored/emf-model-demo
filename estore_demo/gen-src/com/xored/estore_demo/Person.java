/**
 */
package com.xored.estore_demo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.xored.estore_demo.Person#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.xored.estore_demo.Person#getSecondName <em>Second Name</em>}</li>
 *   <li>{@link com.xored.estore_demo.Person#getLikedToWork <em>Liked To Work</em>}</li>
 *   <li>{@link com.xored.estore_demo.Person#getSomeReallyBigData <em>Some Really Big Data</em>}</li>
 *   <li>{@link com.xored.estore_demo.Person#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.xored.estore_demo.Estore_demoPackage#getPerson()
 * @model
 * @generated
 */
public interface Person extends EObject {
	/**
	 * Returns the value of the '<em><b>First Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Name</em>' attribute.
	 * @see #setFirstName(String)
	 * @see com.xored.estore_demo.Estore_demoPackage#getPerson_FirstName()
	 * @model
	 * @generated
	 */
	String getFirstName();

	/**
	 * Sets the value of the '{@link com.xored.estore_demo.Person#getFirstName <em>First Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Name</em>' attribute.
	 * @see #getFirstName()
	 * @generated
	 */
	void setFirstName(String value);

	/**
	 * Returns the value of the '<em><b>Second Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Name</em>' attribute.
	 * @see #setSecondName(String)
	 * @see com.xored.estore_demo.Estore_demoPackage#getPerson_SecondName()
	 * @model
	 * @generated
	 */
	String getSecondName();

	/**
	 * Sets the value of the '{@link com.xored.estore_demo.Person#getSecondName <em>Second Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Name</em>' attribute.
	 * @see #getSecondName()
	 * @generated
	 */
	void setSecondName(String value);

	/**
	 * Returns the value of the '<em><b>Liked To Work</b></em>' reference list.
	 * The list contents are of type {@link com.xored.estore_demo.Organization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Liked To Work</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Liked To Work</em>' reference list.
	 * @see com.xored.estore_demo.Estore_demoPackage#getPerson_LikedToWork()
	 * @model
	 * @generated
	 */
	EList<Organization> getLikedToWork();

	/**
	 * Returns the value of the '<em><b>Some Really Big Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Some Really Big Data</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Some Really Big Data</em>' attribute.
	 * @see #setSomeReallyBigData(String)
	 * @see com.xored.estore_demo.Estore_demoPackage#getPerson_SomeReallyBigData()
	 * @model
	 * @generated
	 */
	String getSomeReallyBigData();

	/**
	 * Sets the value of the '{@link com.xored.estore_demo.Person#getSomeReallyBigData <em>Some Really Big Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Some Really Big Data</em>' attribute.
	 * @see #getSomeReallyBigData()
	 * @generated
	 */
	void setSomeReallyBigData(String value);

	/**
	 * Returns the value of the '<em><b>Tasks</b></em>' containment reference list.
	 * The list contents are of type {@link com.xored.estore_demo.Task}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tasks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tasks</em>' containment reference list.
	 * @see com.xored.estore_demo.Estore_demoPackage#getPerson_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

} // Person

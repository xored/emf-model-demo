/**
 */
package com.xored.estore_demo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Demo Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.xored.estore_demo.DemoRoot#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link com.xored.estore_demo.DemoRoot#getPeople <em>People</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.xored.estore_demo.Estore_demoPackage#getDemoRoot()
 * @model
 * @generated
 */
public interface DemoRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Organizations</b></em>' containment reference list.
	 * The list contents are of type {@link com.xored.estore_demo.Organization}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Organizations</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Organizations</em>' containment reference list.
	 * @see com.xored.estore_demo.Estore_demoPackage#getDemoRoot_Organizations()
	 * @model containment="true"
	 * @generated
	 */
	EList<Organization> getOrganizations();

	/**
	 * Returns the value of the '<em><b>People</b></em>' containment reference list.
	 * The list contents are of type {@link com.xored.estore_demo.Person}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>People</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>People</em>' containment reference list.
	 * @see com.xored.estore_demo.Estore_demoPackage#getDemoRoot_People()
	 * @model containment="true"
	 * @generated
	 */
	EList<Person> getPeople();

} // DemoRoot

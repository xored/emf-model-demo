/**
 */
package com.xored.estore_demo;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link com.xored.estore_demo.Task#getName <em>Name</em>}</li>
 *   <li>{@link com.xored.estore_demo.Task#getDescription <em>Description</em>}</li>
 *   <li>{@link com.xored.estore_demo.Task#getEstimation <em>Estimation</em>}</li>
 *   <li>{@link com.xored.estore_demo.Task#getComplete <em>Complete</em>}</li>
 *   <li>{@link com.xored.estore_demo.Task#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @see com.xored.estore_demo.Estore_demoPackage#getTask()
 * @model
 * @generated
 */
public interface Task extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.xored.estore_demo.Estore_demoPackage#getTask_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.xored.estore_demo.Task#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see com.xored.estore_demo.Estore_demoPackage#getTask_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.xored.estore_demo.Task#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Estimation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimation</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimation</em>' attribute.
	 * @see #setEstimation(int)
	 * @see com.xored.estore_demo.Estore_demoPackage#getTask_Estimation()
	 * @model
	 * @generated
	 */
	int getEstimation();

	/**
	 * Sets the value of the '{@link com.xored.estore_demo.Task#getEstimation <em>Estimation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Estimation</em>' attribute.
	 * @see #getEstimation()
	 * @generated
	 */
	void setEstimation(int value);

	/**
	 * Returns the value of the '<em><b>Complete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Complete</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Complete</em>' attribute.
	 * @see #setComplete(int)
	 * @see com.xored.estore_demo.Estore_demoPackage#getTask_Complete()
	 * @model
	 * @generated
	 */
	int getComplete();

	/**
	 * Sets the value of the '{@link com.xored.estore_demo.Task#getComplete <em>Complete</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Complete</em>' attribute.
	 * @see #getComplete()
	 * @generated
	 */
	void setComplete(int value);

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
	 * @see com.xored.estore_demo.Estore_demoPackage#getTask_Tasks()
	 * @model containment="true"
	 * @generated
	 */
	EList<Task> getTasks();

} // Task

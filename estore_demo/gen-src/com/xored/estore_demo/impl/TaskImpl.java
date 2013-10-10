/**
 */
package com.xored.estore_demo.impl;

import com.xored.estore_demo.Estore_demoPackage;
import com.xored.estore_demo.Task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EStoreEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Task</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.xored.estore_demo.impl.TaskImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.xored.estore_demo.impl.TaskImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.xored.estore_demo.impl.TaskImpl#getEstimation <em>Estimation</em>}</li>
 *   <li>{@link com.xored.estore_demo.impl.TaskImpl#getComplete <em>Complete</em>}</li>
 *   <li>{@link com.xored.estore_demo.impl.TaskImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TaskImpl extends EStoreEObjectImpl implements Task {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TaskImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Estore_demoPackage.Literals.TASK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected int eStaticFeatureCount() {
		return 0;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return (String)eGet(Estore_demoPackage.Literals.TASK__NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		eSet(Estore_demoPackage.Literals.TASK__NAME, newName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return (String)eGet(Estore_demoPackage.Literals.TASK__DESCRIPTION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		eSet(Estore_demoPackage.Literals.TASK__DESCRIPTION, newDescription);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getEstimation() {
		return (Integer)eGet(Estore_demoPackage.Literals.TASK__ESTIMATION, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEstimation(int newEstimation) {
		eSet(Estore_demoPackage.Literals.TASK__ESTIMATION, newEstimation);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getComplete() {
		return (Integer)eGet(Estore_demoPackage.Literals.TASK__COMPLETE, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setComplete(int newComplete) {
		eSet(Estore_demoPackage.Literals.TASK__COMPLETE, newComplete);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Task> getTasks() {
		return (EList<Task>)eGet(Estore_demoPackage.Literals.TASK__TASKS, true);
	}

} //TaskImpl

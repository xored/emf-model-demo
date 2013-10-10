/**
 */
package com.xored.estore_demo.impl;

import com.xored.estore_demo.Estore_demoPackage;
import com.xored.estore_demo.Organization;
import com.xored.estore_demo.Person;
import com.xored.estore_demo.Task;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EStoreEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Person</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.xored.estore_demo.impl.PersonImpl#getFirstName <em>First Name</em>}</li>
 *   <li>{@link com.xored.estore_demo.impl.PersonImpl#getSecondName <em>Second Name</em>}</li>
 *   <li>{@link com.xored.estore_demo.impl.PersonImpl#getLikedToWork <em>Liked To Work</em>}</li>
 *   <li>{@link com.xored.estore_demo.impl.PersonImpl#getSomeReallyBigData <em>Some Really Big Data</em>}</li>
 *   <li>{@link com.xored.estore_demo.impl.PersonImpl#getTasks <em>Tasks</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonImpl extends EStoreEObjectImpl implements Person {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersonImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Estore_demoPackage.Literals.PERSON;
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
	public String getFirstName() {
		return (String)eGet(Estore_demoPackage.Literals.PERSON__FIRST_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFirstName(String newFirstName) {
		eSet(Estore_demoPackage.Literals.PERSON__FIRST_NAME, newFirstName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSecondName() {
		return (String)eGet(Estore_demoPackage.Literals.PERSON__SECOND_NAME, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSecondName(String newSecondName) {
		eSet(Estore_demoPackage.Literals.PERSON__SECOND_NAME, newSecondName);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Organization> getLikedToWork() {
		return (EList<Organization>)eGet(Estore_demoPackage.Literals.PERSON__LIKED_TO_WORK, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSomeReallyBigData() {
		return (String)eGet(Estore_demoPackage.Literals.PERSON__SOME_REALLY_BIG_DATA, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSomeReallyBigData(String newSomeReallyBigData) {
		eSet(Estore_demoPackage.Literals.PERSON__SOME_REALLY_BIG_DATA, newSomeReallyBigData);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Task> getTasks() {
		return (EList<Task>)eGet(Estore_demoPackage.Literals.PERSON__TASKS, true);
	}

} //PersonImpl

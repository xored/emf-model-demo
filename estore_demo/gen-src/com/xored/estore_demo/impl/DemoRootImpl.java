/**
 */
package com.xored.estore_demo.impl;

import com.xored.estore_demo.DemoRoot;
import com.xored.estore_demo.Estore_demoPackage;
import com.xored.estore_demo.Organization;
import com.xored.estore_demo.Person;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.EStoreEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Demo Root</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.xored.estore_demo.impl.DemoRootImpl#getOrganizations <em>Organizations</em>}</li>
 *   <li>{@link com.xored.estore_demo.impl.DemoRootImpl#getPeople <em>People</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DemoRootImpl extends EStoreEObjectImpl implements DemoRoot {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DemoRootImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Estore_demoPackage.Literals.DEMO_ROOT;
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
	@SuppressWarnings("unchecked")
	public EList<Organization> getOrganizations() {
		return (EList<Organization>)eGet(Estore_demoPackage.Literals.DEMO_ROOT__ORGANIZATIONS, true);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	public EList<Person> getPeople() {
		return (EList<Person>)eGet(Estore_demoPackage.Literals.DEMO_ROOT__PEOPLE, true);
	}

} //DemoRootImpl

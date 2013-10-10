/**
 */
package com.xored.estore_demo.persistence.impl;

import com.xored.estore_demo.persistence.PersistenceChunk;
import com.xored.estore_demo.persistence.PersistencePackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Chunk</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link com.xored.estore_demo.persistence.impl.PersistenceChunkImpl#getFileName <em>File Name</em>}</li>
 *   <li>{@link com.xored.estore_demo.persistence.impl.PersistenceChunkImpl#getObjectsCount <em>Objects Count</em>}</li>
 *   <li>{@link com.xored.estore_demo.persistence.impl.PersistenceChunkImpl#getObjectsIndex <em>Objects Index</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersistenceChunkImpl extends MinimalEObjectImpl.Container implements PersistenceChunk {
	/**
	 * The default value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected static final String FILE_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFileName() <em>File Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFileName()
	 * @generated
	 * @ordered
	 */
	protected String fileName = FILE_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectsCount() <em>Objects Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectsCount()
	 * @generated
	 * @ordered
	 */
	protected static final int OBJECTS_COUNT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getObjectsCount() <em>Objects Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectsCount()
	 * @generated
	 * @ordered
	 */
	protected int objectsCount = OBJECTS_COUNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getObjectsIndex() <em>Objects Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectsIndex()
	 * @generated
	 * @ordered
	 */
	protected static final int OBJECTS_INDEX_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getObjectsIndex() <em>Objects Index</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getObjectsIndex()
	 * @generated
	 * @ordered
	 */
	protected int objectsIndex = OBJECTS_INDEX_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PersistenceChunkImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return PersistencePackage.Literals.PERSISTENCE_CHUNK;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFileName() {
		return fileName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFileName(String newFileName) {
		String oldFileName = fileName;
		fileName = newFileName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE_CHUNK__FILE_NAME, oldFileName, fileName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getObjectsCount() {
		return objectsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectsCount(int newObjectsCount) {
		int oldObjectsCount = objectsCount;
		objectsCount = newObjectsCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE_CHUNK__OBJECTS_COUNT, oldObjectsCount, objectsCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getObjectsIndex() {
		return objectsIndex;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setObjectsIndex(int newObjectsIndex) {
		int oldObjectsIndex = objectsIndex;
		objectsIndex = newObjectsIndex;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, PersistencePackage.PERSISTENCE_CHUNK__OBJECTS_INDEX, oldObjectsIndex, objectsIndex));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case PersistencePackage.PERSISTENCE_CHUNK__FILE_NAME:
				return getFileName();
			case PersistencePackage.PERSISTENCE_CHUNK__OBJECTS_COUNT:
				return getObjectsCount();
			case PersistencePackage.PERSISTENCE_CHUNK__OBJECTS_INDEX:
				return getObjectsIndex();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case PersistencePackage.PERSISTENCE_CHUNK__FILE_NAME:
				setFileName((String)newValue);
				return;
			case PersistencePackage.PERSISTENCE_CHUNK__OBJECTS_COUNT:
				setObjectsCount((Integer)newValue);
				return;
			case PersistencePackage.PERSISTENCE_CHUNK__OBJECTS_INDEX:
				setObjectsIndex((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case PersistencePackage.PERSISTENCE_CHUNK__FILE_NAME:
				setFileName(FILE_NAME_EDEFAULT);
				return;
			case PersistencePackage.PERSISTENCE_CHUNK__OBJECTS_COUNT:
				setObjectsCount(OBJECTS_COUNT_EDEFAULT);
				return;
			case PersistencePackage.PERSISTENCE_CHUNK__OBJECTS_INDEX:
				setObjectsIndex(OBJECTS_INDEX_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case PersistencePackage.PERSISTENCE_CHUNK__FILE_NAME:
				return FILE_NAME_EDEFAULT == null ? fileName != null : !FILE_NAME_EDEFAULT.equals(fileName);
			case PersistencePackage.PERSISTENCE_CHUNK__OBJECTS_COUNT:
				return objectsCount != OBJECTS_COUNT_EDEFAULT;
			case PersistencePackage.PERSISTENCE_CHUNK__OBJECTS_INDEX:
				return objectsIndex != OBJECTS_INDEX_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (fileName: ");
		result.append(fileName);
		result.append(", objectsCount: ");
		result.append(objectsCount);
		result.append(", objectsIndex: ");
		result.append(objectsIndex);
		result.append(')');
		return result.toString();
	}

} //PersistenceChunkImpl

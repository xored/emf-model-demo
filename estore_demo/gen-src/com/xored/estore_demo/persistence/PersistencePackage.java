/**
 */
package com.xored.estore_demo.persistence;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.xored.estore_demo.persistence.PersistenceFactory
 * @model kind="package"
 * @generated
 */
public interface PersistencePackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "persistence";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///com/xored/estore_demo/persistence.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "com.xored.estore_demo.persistence";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	PersistencePackage eINSTANCE = com.xored.estore_demo.persistence.impl.PersistencePackageImpl.init();

	/**
	 * The meta object id for the '{@link com.xored.estore_demo.persistence.impl.PersistenceChunkImpl <em>Chunk</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xored.estore_demo.persistence.impl.PersistenceChunkImpl
	 * @see com.xored.estore_demo.persistence.impl.PersistencePackageImpl#getPersistenceChunk()
	 * @generated
	 */
	int PERSISTENCE_CHUNK = 0;

	/**
	 * The feature id for the '<em><b>File Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CHUNK__FILE_NAME = 0;

	/**
	 * The feature id for the '<em><b>Objects Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CHUNK__OBJECTS_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Objects Index</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CHUNK__OBJECTS_INDEX = 2;

	/**
	 * The number of structural features of the '<em>Chunk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CHUNK_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Chunk</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTENCE_CHUNK_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link com.xored.estore_demo.persistence.impl.RootObjectImpl <em>Root Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xored.estore_demo.persistence.impl.RootObjectImpl
	 * @see com.xored.estore_demo.persistence.impl.PersistencePackageImpl#getRootObject()
	 * @generated
	 */
	int ROOT_OBJECT = 1;

	/**
	 * The feature id for the '<em><b>Uri</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OBJECT__URI = 0;

	/**
	 * The number of structural features of the '<em>Root Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OBJECT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Root Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROOT_OBJECT_OPERATION_COUNT = 0;


	/**
	 * The meta object id for the '{@link com.xored.estore_demo.persistence.impl.PersistedObjectImpl <em>Persisted Object</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xored.estore_demo.persistence.impl.PersistedObjectImpl
	 * @see com.xored.estore_demo.persistence.impl.PersistencePackageImpl#getPersistedObject()
	 * @generated
	 */
	int PERSISTED_OBJECT = 2;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTED_OBJECT__ID = 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTED_OBJECT__ATTRIBUTES = 1;

	/**
	 * The number of structural features of the '<em>Persisted Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTED_OBJECT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Persisted Object</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTED_OBJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.xored.estore_demo.persistence.impl.PersistedAttributeImpl <em>Persisted Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.xored.estore_demo.persistence.impl.PersistedAttributeImpl
	 * @see com.xored.estore_demo.persistence.impl.PersistencePackageImpl#getPersistedAttribute()
	 * @generated
	 */
	int PERSISTED_ATTRIBUTE = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTED_ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTED_ATTRIBUTE__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Persisted Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTED_ATTRIBUTE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Persisted Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PERSISTED_ATTRIBUTE_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link com.xored.estore_demo.persistence.PersistenceChunk <em>Chunk</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chunk</em>'.
	 * @see com.xored.estore_demo.persistence.PersistenceChunk
	 * @generated
	 */
	EClass getPersistenceChunk();

	/**
	 * Returns the meta object for the attribute '{@link com.xored.estore_demo.persistence.PersistenceChunk#getFileName <em>File Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File Name</em>'.
	 * @see com.xored.estore_demo.persistence.PersistenceChunk#getFileName()
	 * @see #getPersistenceChunk()
	 * @generated
	 */
	EAttribute getPersistenceChunk_FileName();

	/**
	 * Returns the meta object for the attribute '{@link com.xored.estore_demo.persistence.PersistenceChunk#getObjectsCount <em>Objects Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objects Count</em>'.
	 * @see com.xored.estore_demo.persistence.PersistenceChunk#getObjectsCount()
	 * @see #getPersistenceChunk()
	 * @generated
	 */
	EAttribute getPersistenceChunk_ObjectsCount();

	/**
	 * Returns the meta object for the attribute '{@link com.xored.estore_demo.persistence.PersistenceChunk#getObjectsIndex <em>Objects Index</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Objects Index</em>'.
	 * @see com.xored.estore_demo.persistence.PersistenceChunk#getObjectsIndex()
	 * @see #getPersistenceChunk()
	 * @generated
	 */
	EAttribute getPersistenceChunk_ObjectsIndex();

	/**
	 * Returns the meta object for class '{@link com.xored.estore_demo.persistence.RootObject <em>Root Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Root Object</em>'.
	 * @see com.xored.estore_demo.persistence.RootObject
	 * @generated
	 */
	EClass getRootObject();

	/**
	 * Returns the meta object for the attribute '{@link com.xored.estore_demo.persistence.RootObject#getUri <em>Uri</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Uri</em>'.
	 * @see com.xored.estore_demo.persistence.RootObject#getUri()
	 * @see #getRootObject()
	 * @generated
	 */
	EAttribute getRootObject_Uri();

	/**
	 * Returns the meta object for class '{@link com.xored.estore_demo.persistence.PersistedObject <em>Persisted Object</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persisted Object</em>'.
	 * @see com.xored.estore_demo.persistence.PersistedObject
	 * @generated
	 */
	EClass getPersistedObject();

	/**
	 * Returns the meta object for the attribute '{@link com.xored.estore_demo.persistence.PersistedObject#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.xored.estore_demo.persistence.PersistedObject#getId()
	 * @see #getPersistedObject()
	 * @generated
	 */
	EAttribute getPersistedObject_Id();

	/**
	 * Returns the meta object for the containment reference list '{@link com.xored.estore_demo.persistence.PersistedObject#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see com.xored.estore_demo.persistence.PersistedObject#getAttributes()
	 * @see #getPersistedObject()
	 * @generated
	 */
	EReference getPersistedObject_Attributes();

	/**
	 * Returns the meta object for class '{@link com.xored.estore_demo.persistence.PersistedAttribute <em>Persisted Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Persisted Attribute</em>'.
	 * @see com.xored.estore_demo.persistence.PersistedAttribute
	 * @generated
	 */
	EClass getPersistedAttribute();

	/**
	 * Returns the meta object for the attribute '{@link com.xored.estore_demo.persistence.PersistedAttribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.xored.estore_demo.persistence.PersistedAttribute#getName()
	 * @see #getPersistedAttribute()
	 * @generated
	 */
	EAttribute getPersistedAttribute_Name();

	/**
	 * Returns the meta object for the attribute list '{@link com.xored.estore_demo.persistence.PersistedAttribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Value</em>'.
	 * @see com.xored.estore_demo.persistence.PersistedAttribute#getValue()
	 * @see #getPersistedAttribute()
	 * @generated
	 */
	EAttribute getPersistedAttribute_Value();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	PersistenceFactory getPersistenceFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.xored.estore_demo.persistence.impl.PersistenceChunkImpl <em>Chunk</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xored.estore_demo.persistence.impl.PersistenceChunkImpl
		 * @see com.xored.estore_demo.persistence.impl.PersistencePackageImpl#getPersistenceChunk()
		 * @generated
		 */
		EClass PERSISTENCE_CHUNK = eINSTANCE.getPersistenceChunk();

		/**
		 * The meta object literal for the '<em><b>File Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_CHUNK__FILE_NAME = eINSTANCE.getPersistenceChunk_FileName();

		/**
		 * The meta object literal for the '<em><b>Objects Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_CHUNK__OBJECTS_COUNT = eINSTANCE.getPersistenceChunk_ObjectsCount();

		/**
		 * The meta object literal for the '<em><b>Objects Index</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTENCE_CHUNK__OBJECTS_INDEX = eINSTANCE.getPersistenceChunk_ObjectsIndex();

		/**
		 * The meta object literal for the '{@link com.xored.estore_demo.persistence.impl.RootObjectImpl <em>Root Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xored.estore_demo.persistence.impl.RootObjectImpl
		 * @see com.xored.estore_demo.persistence.impl.PersistencePackageImpl#getRootObject()
		 * @generated
		 */
		EClass ROOT_OBJECT = eINSTANCE.getRootObject();

		/**
		 * The meta object literal for the '<em><b>Uri</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ROOT_OBJECT__URI = eINSTANCE.getRootObject_Uri();

		/**
		 * The meta object literal for the '{@link com.xored.estore_demo.persistence.impl.PersistedObjectImpl <em>Persisted Object</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xored.estore_demo.persistence.impl.PersistedObjectImpl
		 * @see com.xored.estore_demo.persistence.impl.PersistencePackageImpl#getPersistedObject()
		 * @generated
		 */
		EClass PERSISTED_OBJECT = eINSTANCE.getPersistedObject();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTED_OBJECT__ID = eINSTANCE.getPersistedObject_Id();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PERSISTED_OBJECT__ATTRIBUTES = eINSTANCE.getPersistedObject_Attributes();

		/**
		 * The meta object literal for the '{@link com.xored.estore_demo.persistence.impl.PersistedAttributeImpl <em>Persisted Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.xored.estore_demo.persistence.impl.PersistedAttributeImpl
		 * @see com.xored.estore_demo.persistence.impl.PersistencePackageImpl#getPersistedAttribute()
		 * @generated
		 */
		EClass PERSISTED_ATTRIBUTE = eINSTANCE.getPersistedAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTED_ATTRIBUTE__NAME = eINSTANCE.getPersistedAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PERSISTED_ATTRIBUTE__VALUE = eINSTANCE.getPersistedAttribute_Value();

	}

} //PersistencePackage

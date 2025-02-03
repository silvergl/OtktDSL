/**
 */
package kiekerrecord;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
 * @see kiekerrecord.KiekerrecordFactory
 * @model kind="package"
 * @generated
 */
public interface KiekerrecordPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kiekerrecord";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://otel.kieker/translation/kiekerrecord";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kiekerrecord";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KiekerrecordPackage eINSTANCE = kiekerrecord.impl.KiekerrecordPackageImpl.init();

	/**
	 * The meta object id for the '{@link kiekerrecord.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kiekerrecord.impl.NamedElementImpl
	 * @see kiekerrecord.impl.KiekerrecordPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kiekerrecord.impl.KiekerRecordImpl <em>Kieker Record</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kiekerrecord.impl.KiekerRecordImpl
	 * @see kiekerrecord.impl.KiekerrecordPackageImpl#getKiekerRecord()
	 * @generated
	 */
	int KIEKER_RECORD = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIEKER_RECORD__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIEKER_RECORD__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fq Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIEKER_RECORD__FQ_CLASS_NAME = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Kieker Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIEKER_RECORD_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Kieker Record</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIEKER_RECORD_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kiekerrecord.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kiekerrecord.impl.AttributeImpl
	 * @see kiekerrecord.impl.KiekerrecordPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kiekerrecord.impl.KiekerRecordModelImpl <em>Kieker Record Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kiekerrecord.impl.KiekerRecordModelImpl
	 * @see kiekerrecord.impl.KiekerrecordPackageImpl#getKiekerRecordModel()
	 * @generated
	 */
	int KIEKER_RECORD_MODEL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIEKER_RECORD_MODEL__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Records</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIEKER_RECORD_MODEL__RECORDS = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Kieker Record Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIEKER_RECORD_MODEL_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Kieker Record Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int KIEKER_RECORD_MODEL_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kiekerrecord.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kiekerrecord.Type
	 * @see kiekerrecord.impl.KiekerrecordPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 4;


	/**
	 * Returns the meta object for class '{@link kiekerrecord.KiekerRecord <em>Kieker Record</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kieker Record</em>'.
	 * @see kiekerrecord.KiekerRecord
	 * @generated
	 */
	EClass getKiekerRecord();

	/**
	 * Returns the meta object for the containment reference list '{@link kiekerrecord.KiekerRecord#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see kiekerrecord.KiekerRecord#getAttributes()
	 * @see #getKiekerRecord()
	 * @generated
	 */
	EReference getKiekerRecord_Attributes();

	/**
	 * Returns the meta object for the attribute '{@link kiekerrecord.KiekerRecord#getFqClassName <em>Fq Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Fq Class Name</em>'.
	 * @see kiekerrecord.KiekerRecord#getFqClassName()
	 * @see #getKiekerRecord()
	 * @generated
	 */
	EAttribute getKiekerRecord_FqClassName();

	/**
	 * Returns the meta object for class '{@link kiekerrecord.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see kiekerrecord.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link kiekerrecord.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kiekerrecord.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for class '{@link kiekerrecord.KiekerRecordModel <em>Kieker Record Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Kieker Record Model</em>'.
	 * @see kiekerrecord.KiekerRecordModel
	 * @generated
	 */
	EClass getKiekerRecordModel();

	/**
	 * Returns the meta object for the containment reference list '{@link kiekerrecord.KiekerRecordModel#getRecords <em>Records</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Records</em>'.
	 * @see kiekerrecord.KiekerRecordModel#getRecords()
	 * @see #getKiekerRecordModel()
	 * @generated
	 */
	EReference getKiekerRecordModel_Records();

	/**
	 * Returns the meta object for class '{@link kiekerrecord.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see kiekerrecord.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link kiekerrecord.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kiekerrecord.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for enum '{@link kiekerrecord.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see kiekerrecord.Type
	 * @generated
	 */
	EEnum getType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KiekerrecordFactory getKiekerrecordFactory();

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
		 * The meta object literal for the '{@link kiekerrecord.impl.KiekerRecordImpl <em>Kieker Record</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kiekerrecord.impl.KiekerRecordImpl
		 * @see kiekerrecord.impl.KiekerrecordPackageImpl#getKiekerRecord()
		 * @generated
		 */
		EClass KIEKER_RECORD = eINSTANCE.getKiekerRecord();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KIEKER_RECORD__ATTRIBUTES = eINSTANCE.getKiekerRecord_Attributes();

		/**
		 * The meta object literal for the '<em><b>Fq Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute KIEKER_RECORD__FQ_CLASS_NAME = eINSTANCE.getKiekerRecord_FqClassName();

		/**
		 * The meta object literal for the '{@link kiekerrecord.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kiekerrecord.impl.AttributeImpl
		 * @see kiekerrecord.impl.KiekerrecordPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '{@link kiekerrecord.impl.KiekerRecordModelImpl <em>Kieker Record Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kiekerrecord.impl.KiekerRecordModelImpl
		 * @see kiekerrecord.impl.KiekerrecordPackageImpl#getKiekerRecordModel()
		 * @generated
		 */
		EClass KIEKER_RECORD_MODEL = eINSTANCE.getKiekerRecordModel();

		/**
		 * The meta object literal for the '<em><b>Records</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference KIEKER_RECORD_MODEL__RECORDS = eINSTANCE.getKiekerRecordModel_Records();

		/**
		 * The meta object literal for the '{@link kiekerrecord.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kiekerrecord.impl.NamedElementImpl
		 * @see kiekerrecord.impl.KiekerrecordPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link kiekerrecord.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kiekerrecord.Type
		 * @see kiekerrecord.impl.KiekerrecordPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //KiekerrecordPackage

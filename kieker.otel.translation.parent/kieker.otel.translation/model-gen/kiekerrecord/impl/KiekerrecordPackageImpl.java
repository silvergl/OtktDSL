/**
 */
package kiekerrecord.impl;

import kiekerrecord.Attribute;
import kiekerrecord.KiekerRecord;
import kiekerrecord.KiekerRecordModel;
import kiekerrecord.KiekerrecordFactory;
import kiekerrecord.KiekerrecordPackage;
import kiekerrecord.NamedElement;
import kiekerrecord.Type;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class KiekerrecordPackageImpl extends EPackageImpl implements KiekerrecordPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kiekerRecordEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass attributeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass kiekerRecordModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum typeEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see kiekerrecord.KiekerrecordPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private KiekerrecordPackageImpl() {
		super(eNS_URI, KiekerrecordFactory.eINSTANCE);
	}
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link KiekerrecordPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static KiekerrecordPackage init() {
		if (isInited) return (KiekerrecordPackage)EPackage.Registry.INSTANCE.getEPackage(KiekerrecordPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredKiekerrecordPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		KiekerrecordPackageImpl theKiekerrecordPackage = registeredKiekerrecordPackage instanceof KiekerrecordPackageImpl ? (KiekerrecordPackageImpl)registeredKiekerrecordPackage : new KiekerrecordPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theKiekerrecordPackage.createPackageContents();

		// Initialize created meta-data
		theKiekerrecordPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theKiekerrecordPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(KiekerrecordPackage.eNS_URI, theKiekerrecordPackage);
		return theKiekerrecordPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKiekerRecord() {
		return kiekerRecordEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKiekerRecord_Attributes() {
		return (EReference)kiekerRecordEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getKiekerRecord_FqClassName() {
		return (EAttribute)kiekerRecordEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAttribute() {
		return attributeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAttribute_Type() {
		return (EAttribute)attributeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getKiekerRecordModel() {
		return kiekerRecordModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getKiekerRecordModel_Records() {
		return (EReference)kiekerRecordModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getType() {
		return typeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public KiekerrecordFactory getKiekerrecordFactory() {
		return (KiekerrecordFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		kiekerRecordEClass = createEClass(KIEKER_RECORD);
		createEReference(kiekerRecordEClass, KIEKER_RECORD__ATTRIBUTES);
		createEAttribute(kiekerRecordEClass, KIEKER_RECORD__FQ_CLASS_NAME);

		attributeEClass = createEClass(ATTRIBUTE);
		createEAttribute(attributeEClass, ATTRIBUTE__TYPE);

		kiekerRecordModelEClass = createEClass(KIEKER_RECORD_MODEL);
		createEReference(kiekerRecordModelEClass, KIEKER_RECORD_MODEL__RECORDS);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		// Create enums
		typeEEnum = createEEnum(TYPE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		kiekerRecordEClass.getESuperTypes().add(this.getNamedElement());
		attributeEClass.getESuperTypes().add(this.getNamedElement());
		kiekerRecordModelEClass.getESuperTypes().add(this.getNamedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(kiekerRecordEClass, KiekerRecord.class, "KiekerRecord", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKiekerRecord_Attributes(), this.getAttribute(), null, "attributes", null, 1, -1, KiekerRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getKiekerRecord_FqClassName(), ecorePackage.getEString(), "fqClassName", null, 0, 1, KiekerRecord.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(attributeEClass, Attribute.class, "Attribute", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAttribute_Type(), ecorePackage.getEString(), "Type", null, 0, 1, Attribute.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(kiekerRecordModelEClass, KiekerRecordModel.class, "KiekerRecordModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getKiekerRecordModel_Records(), this.getKiekerRecord(), null, "records", null, 0, -1, KiekerRecordModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.STRING);
		addEEnumLiteral(typeEEnum, Type.INT);
		addEEnumLiteral(typeEEnum, Type.LONG);
		addEEnumLiteral(typeEEnum, Type.BOOLEAN);

		// Create resource
		createResource(eNS_URI);
	}

} //KiekerrecordPackageImpl

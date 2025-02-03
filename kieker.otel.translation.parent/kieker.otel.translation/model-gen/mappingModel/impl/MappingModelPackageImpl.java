/**
 */
package mappingModel.impl;

import mappingModel.Annotation;
import mappingModel.Dependency;
import mappingModel.Mapping;
import mappingModel.MappingModel;
import mappingModel.MappingModelFactory;
import mappingModel.MappingModelPackage;
import mappingModel.MappingRule;
import mappingModel.ParamType;
import mappingModel.SpanParam;
import mappingModel.Type;

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
public class MappingModelPackageImpl extends EPackageImpl implements MappingModelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingRuleEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spanParamEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mappingEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum paramTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dependencyEEnum = null;

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
	 * @see mappingModel.MappingModelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MappingModelPackageImpl() {
		super(eNS_URI, MappingModelFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link MappingModelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MappingModelPackage init() {
		if (isInited) return (MappingModelPackage)EPackage.Registry.INSTANCE.getEPackage(MappingModelPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMappingModelPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MappingModelPackageImpl theMappingModelPackage = registeredMappingModelPackage instanceof MappingModelPackageImpl ? (MappingModelPackageImpl)registeredMappingModelPackage : new MappingModelPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theMappingModelPackage.createPackageContents();

		// Initialize created meta-data
		theMappingModelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMappingModelPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MappingModelPackage.eNS_URI, theMappingModelPackage);
		return theMappingModelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMappingModel() {
		return mappingModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingModel_Mappings() {
		return (EReference)mappingModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMappingRule() {
		return mappingRuleEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMappingRule_From() {
		return (EReference)mappingRuleEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpanParam() {
		return spanParamEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpanParam_ParamType() {
		return (EAttribute)spanParamEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpanParam_ParamName() {
		return (EAttribute)spanParamEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSpanParam_Annotation() {
		return (EReference)spanParamEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpanParam_Type() {
		return (EAttribute)spanParamEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotation_Dependency() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotation_Value() {
		return (EAttribute)annotationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getMapping() {
		return mappingEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getMapping_MappingRules() {
		return (EReference)mappingEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getMapping_RecordFQClassName() {
		return (EAttribute)mappingEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getParamType() {
		return paramTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getDependency() {
		return dependencyEEnum;
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
	public MappingModelFactory getMappingModelFactory() {
		return (MappingModelFactory)getEFactoryInstance();
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
		mappingModelEClass = createEClass(MAPPING_MODEL);
		createEReference(mappingModelEClass, MAPPING_MODEL__MAPPINGS);

		mappingRuleEClass = createEClass(MAPPING_RULE);
		createEReference(mappingRuleEClass, MAPPING_RULE__FROM);

		spanParamEClass = createEClass(SPAN_PARAM);
		createEAttribute(spanParamEClass, SPAN_PARAM__PARAM_TYPE);
		createEAttribute(spanParamEClass, SPAN_PARAM__PARAM_NAME);
		createEReference(spanParamEClass, SPAN_PARAM__ANNOTATION);
		createEAttribute(spanParamEClass, SPAN_PARAM__TYPE);

		annotationEClass = createEClass(ANNOTATION);
		createEAttribute(annotationEClass, ANNOTATION__DEPENDENCY);
		createEAttribute(annotationEClass, ANNOTATION__VALUE);

		mappingEClass = createEClass(MAPPING);
		createEReference(mappingEClass, MAPPING__MAPPING_RULES);
		createEAttribute(mappingEClass, MAPPING__RECORD_FQ_CLASS_NAME);

		// Create enums
		paramTypeEEnum = createEEnum(PARAM_TYPE);
		dependencyEEnum = createEEnum(DEPENDENCY);
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

		// Initialize classes, features, and operations; add parameters
		initEClass(mappingModelEClass, MappingModel.class, "MappingModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingModel_Mappings(), this.getMapping(), null, "Mappings", null, 1, -1, MappingModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingRuleEClass, MappingRule.class, "MappingRule", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMappingRule_From(), this.getSpanParam(), null, "from", null, 0, 1, MappingRule.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spanParamEClass, SpanParam.class, "SpanParam", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpanParam_ParamType(), this.getParamType(), "paramType", null, 0, 1, SpanParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanParam_ParamName(), ecorePackage.getEString(), "paramName", null, 0, 1, SpanParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSpanParam_Annotation(), this.getAnnotation(), null, "annotation", null, 0, 1, SpanParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSpanParam_Type(), this.getType(), "Type", null, 0, 1, SpanParam.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotation_Dependency(), this.getDependency(), "dependency", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotation_Value(), ecorePackage.getEInt(), "value", null, 0, 1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(mappingEClass, Mapping.class, "Mapping", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMapping_MappingRules(), this.getMappingRule(), null, "mappingRules", null, 0, -1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMapping_RecordFQClassName(), ecorePackage.getEString(), "recordFQClassName", null, 0, 1, Mapping.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(paramTypeEEnum, ParamType.class, "ParamType");
		addEEnumLiteral(paramTypeEEnum, ParamType.DEFAULT);
		addEEnumLiteral(paramTypeEEnum, ParamType.STANDARD);
		addEEnumLiteral(paramTypeEEnum, ParamType.ATTRIBUTE);

		initEEnum(dependencyEEnum, Dependency.class, "Dependency");
		addEEnumLiteral(dependencyEEnum, Dependency.DEFAULT);
		addEEnumLiteral(dependencyEEnum, Dependency.GLOBAL);
		addEEnumLiteral(dependencyEEnum, Dependency.PARENT);

		initEEnum(typeEEnum, Type.class, "Type");
		addEEnumLiteral(typeEEnum, Type.INT);
		addEEnumLiteral(typeEEnum, Type.LONG);
		addEEnumLiteral(typeEEnum, Type.BOOL);
		addEEnumLiteral(typeEEnum, Type.STRING);
		addEEnumLiteral(typeEEnum, Type.DOUBLE);
		addEEnumLiteral(typeEEnum, Type.FLOAT);
		addEEnumLiteral(typeEEnum, Type.DEFAULT);

		// Create resource
		createResource(eNS_URI);
	}

} //MappingModelPackageImpl

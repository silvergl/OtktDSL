/**
 */
package mappingModel;

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
 * @see mappingModel.MappingModelFactory
 * @model kind="package"
 * @generated
 */
public interface MappingModelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "mappingModel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://otel.kieker/translation/mappingmodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "mappingModel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingModelPackage eINSTANCE = mappingModel.impl.MappingModelPackageImpl.init();

	/**
	 * The meta object id for the '{@link mappingModel.impl.MappingModelImpl <em>Mapping Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mappingModel.impl.MappingModelImpl
	 * @see mappingModel.impl.MappingModelPackageImpl#getMappingModel()
	 * @generated
	 */
	int MAPPING_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Mappings</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL__MAPPINGS = 0;

	/**
	 * The number of structural features of the '<em>Mapping Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mapping Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mappingModel.impl.MappingRuleImpl <em>Mapping Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mappingModel.impl.MappingRuleImpl
	 * @see mappingModel.impl.MappingModelPackageImpl#getMappingRule()
	 * @generated
	 */
	int MAPPING_RULE = 1;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE__FROM = 0;

	/**
	 * The number of structural features of the '<em>Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Mapping Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mappingModel.impl.SpanParamImpl <em>Span Param</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mappingModel.impl.SpanParamImpl
	 * @see mappingModel.impl.MappingModelPackageImpl#getSpanParam()
	 * @generated
	 */
	int SPAN_PARAM = 2;

	/**
	 * The feature id for the '<em><b>Param Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_PARAM__PARAM_TYPE = 0;

	/**
	 * The feature id for the '<em><b>Param Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_PARAM__PARAM_NAME = 1;

	/**
	 * The feature id for the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_PARAM__ANNOTATION = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_PARAM__TYPE = 3;

	/**
	 * The number of structural features of the '<em>Span Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_PARAM_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Span Param</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPAN_PARAM_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mappingModel.impl.AnnotationImpl <em>Annotation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mappingModel.impl.AnnotationImpl
	 * @see mappingModel.impl.MappingModelPackageImpl#getAnnotation()
	 * @generated
	 */
	int ANNOTATION = 3;

	/**
	 * The feature id for the '<em><b>Dependency</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__DEPENDENCY = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Annotation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ANNOTATION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mappingModel.impl.MappingImpl <em>Mapping</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mappingModel.impl.MappingImpl
	 * @see mappingModel.impl.MappingModelPackageImpl#getMapping()
	 * @generated
	 */
	int MAPPING = 4;

	/**
	 * The feature id for the '<em><b>Mapping Rules</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__MAPPING_RULES = 0;

	/**
	 * The feature id for the '<em><b>Record FQ Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING__RECORD_FQ_CLASS_NAME = 1;

	/**
	 * The number of structural features of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Mapping</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MAPPING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link mappingModel.ParamType <em>Param Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mappingModel.ParamType
	 * @see mappingModel.impl.MappingModelPackageImpl#getParamType()
	 * @generated
	 */
	int PARAM_TYPE = 5;

	/**
	 * The meta object id for the '{@link mappingModel.Dependency <em>Dependency</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mappingModel.Dependency
	 * @see mappingModel.impl.MappingModelPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 6;

	/**
	 * The meta object id for the '{@link mappingModel.Type <em>Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see mappingModel.Type
	 * @see mappingModel.impl.MappingModelPackageImpl#getType()
	 * @generated
	 */
	int TYPE = 7;


	/**
	 * Returns the meta object for class '{@link mappingModel.MappingModel <em>Mapping Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Model</em>'.
	 * @see mappingModel.MappingModel
	 * @generated
	 */
	EClass getMappingModel();

	/**
	 * Returns the meta object for the reference list '{@link mappingModel.MappingModel#getMappings <em>Mappings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mappings</em>'.
	 * @see mappingModel.MappingModel#getMappings()
	 * @see #getMappingModel()
	 * @generated
	 */
	EReference getMappingModel_Mappings();

	/**
	 * Returns the meta object for class '{@link mappingModel.MappingRule <em>Mapping Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping Rule</em>'.
	 * @see mappingModel.MappingRule
	 * @generated
	 */
	EClass getMappingRule();

	/**
	 * Returns the meta object for the reference '{@link mappingModel.MappingRule#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see mappingModel.MappingRule#getFrom()
	 * @see #getMappingRule()
	 * @generated
	 */
	EReference getMappingRule_From();

	/**
	 * Returns the meta object for class '{@link mappingModel.SpanParam <em>Span Param</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Span Param</em>'.
	 * @see mappingModel.SpanParam
	 * @generated
	 */
	EClass getSpanParam();

	/**
	 * Returns the meta object for the attribute '{@link mappingModel.SpanParam#getParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Type</em>'.
	 * @see mappingModel.SpanParam#getParamType()
	 * @see #getSpanParam()
	 * @generated
	 */
	EAttribute getSpanParam_ParamType();

	/**
	 * Returns the meta object for the attribute '{@link mappingModel.SpanParam#getParamName <em>Param Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Param Name</em>'.
	 * @see mappingModel.SpanParam#getParamName()
	 * @see #getSpanParam()
	 * @generated
	 */
	EAttribute getSpanParam_ParamName();

	/**
	 * Returns the meta object for the reference '{@link mappingModel.SpanParam#getAnnotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Annotation</em>'.
	 * @see mappingModel.SpanParam#getAnnotation()
	 * @see #getSpanParam()
	 * @generated
	 */
	EReference getSpanParam_Annotation();

	/**
	 * Returns the meta object for the attribute '{@link mappingModel.SpanParam#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see mappingModel.SpanParam#getType()
	 * @see #getSpanParam()
	 * @generated
	 */
	EAttribute getSpanParam_Type();

	/**
	 * Returns the meta object for class '{@link mappingModel.Annotation <em>Annotation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Annotation</em>'.
	 * @see mappingModel.Annotation
	 * @generated
	 */
	EClass getAnnotation();

	/**
	 * Returns the meta object for the attribute '{@link mappingModel.Annotation#getDependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Dependency</em>'.
	 * @see mappingModel.Annotation#getDependency()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Dependency();

	/**
	 * Returns the meta object for the attribute '{@link mappingModel.Annotation#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see mappingModel.Annotation#getValue()
	 * @see #getAnnotation()
	 * @generated
	 */
	EAttribute getAnnotation_Value();

	/**
	 * Returns the meta object for class '{@link mappingModel.Mapping <em>Mapping</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Mapping</em>'.
	 * @see mappingModel.Mapping
	 * @generated
	 */
	EClass getMapping();

	/**
	 * Returns the meta object for the reference list '{@link mappingModel.Mapping#getMappingRules <em>Mapping Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Mapping Rules</em>'.
	 * @see mappingModel.Mapping#getMappingRules()
	 * @see #getMapping()
	 * @generated
	 */
	EReference getMapping_MappingRules();

	/**
	 * Returns the meta object for the attribute '{@link mappingModel.Mapping#getRecordFQClassName <em>Record FQ Class Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Record FQ Class Name</em>'.
	 * @see mappingModel.Mapping#getRecordFQClassName()
	 * @see #getMapping()
	 * @generated
	 */
	EAttribute getMapping_RecordFQClassName();

	/**
	 * Returns the meta object for enum '{@link mappingModel.ParamType <em>Param Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Param Type</em>'.
	 * @see mappingModel.ParamType
	 * @generated
	 */
	EEnum getParamType();

	/**
	 * Returns the meta object for enum '{@link mappingModel.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Dependency</em>'.
	 * @see mappingModel.Dependency
	 * @generated
	 */
	EEnum getDependency();

	/**
	 * Returns the meta object for enum '{@link mappingModel.Type <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Type</em>'.
	 * @see mappingModel.Type
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
	MappingModelFactory getMappingModelFactory();

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
		 * The meta object literal for the '{@link mappingModel.impl.MappingModelImpl <em>Mapping Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mappingModel.impl.MappingModelImpl
		 * @see mappingModel.impl.MappingModelPackageImpl#getMappingModel()
		 * @generated
		 */
		EClass MAPPING_MODEL = eINSTANCE.getMappingModel();

		/**
		 * The meta object literal for the '<em><b>Mappings</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_MODEL__MAPPINGS = eINSTANCE.getMappingModel_Mappings();

		/**
		 * The meta object literal for the '{@link mappingModel.impl.MappingRuleImpl <em>Mapping Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mappingModel.impl.MappingRuleImpl
		 * @see mappingModel.impl.MappingModelPackageImpl#getMappingRule()
		 * @generated
		 */
		EClass MAPPING_RULE = eINSTANCE.getMappingRule();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING_RULE__FROM = eINSTANCE.getMappingRule_From();

		/**
		 * The meta object literal for the '{@link mappingModel.impl.SpanParamImpl <em>Span Param</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mappingModel.impl.SpanParamImpl
		 * @see mappingModel.impl.MappingModelPackageImpl#getSpanParam()
		 * @generated
		 */
		EClass SPAN_PARAM = eINSTANCE.getSpanParam();

		/**
		 * The meta object literal for the '<em><b>Param Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_PARAM__PARAM_TYPE = eINSTANCE.getSpanParam_ParamType();

		/**
		 * The meta object literal for the '<em><b>Param Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_PARAM__PARAM_NAME = eINSTANCE.getSpanParam_ParamName();

		/**
		 * The meta object literal for the '<em><b>Annotation</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SPAN_PARAM__ANNOTATION = eINSTANCE.getSpanParam_Annotation();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPAN_PARAM__TYPE = eINSTANCE.getSpanParam_Type();

		/**
		 * The meta object literal for the '{@link mappingModel.impl.AnnotationImpl <em>Annotation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mappingModel.impl.AnnotationImpl
		 * @see mappingModel.impl.MappingModelPackageImpl#getAnnotation()
		 * @generated
		 */
		EClass ANNOTATION = eINSTANCE.getAnnotation();

		/**
		 * The meta object literal for the '<em><b>Dependency</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__DEPENDENCY = eINSTANCE.getAnnotation_Dependency();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ANNOTATION__VALUE = eINSTANCE.getAnnotation_Value();

		/**
		 * The meta object literal for the '{@link mappingModel.impl.MappingImpl <em>Mapping</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mappingModel.impl.MappingImpl
		 * @see mappingModel.impl.MappingModelPackageImpl#getMapping()
		 * @generated
		 */
		EClass MAPPING = eINSTANCE.getMapping();

		/**
		 * The meta object literal for the '<em><b>Mapping Rules</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MAPPING__MAPPING_RULES = eINSTANCE.getMapping_MappingRules();

		/**
		 * The meta object literal for the '<em><b>Record FQ Class Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MAPPING__RECORD_FQ_CLASS_NAME = eINSTANCE.getMapping_RecordFQClassName();

		/**
		 * The meta object literal for the '{@link mappingModel.ParamType <em>Param Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mappingModel.ParamType
		 * @see mappingModel.impl.MappingModelPackageImpl#getParamType()
		 * @generated
		 */
		EEnum PARAM_TYPE = eINSTANCE.getParamType();

		/**
		 * The meta object literal for the '{@link mappingModel.Dependency <em>Dependency</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mappingModel.Dependency
		 * @see mappingModel.impl.MappingModelPackageImpl#getDependency()
		 * @generated
		 */
		EEnum DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '{@link mappingModel.Type <em>Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see mappingModel.Type
		 * @see mappingModel.impl.MappingModelPackageImpl#getType()
		 * @generated
		 */
		EEnum TYPE = eINSTANCE.getType();

	}

} //MappingModelPackage

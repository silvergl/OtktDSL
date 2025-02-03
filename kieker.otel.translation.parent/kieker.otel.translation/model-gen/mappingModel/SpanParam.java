/**
 */
package mappingModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Span Param</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mappingModel.SpanParam#getParamType <em>Param Type</em>}</li>
 *   <li>{@link mappingModel.SpanParam#getParamName <em>Param Name</em>}</li>
 *   <li>{@link mappingModel.SpanParam#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link mappingModel.SpanParam#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see mappingModel.MappingModelPackage#getSpanParam()
 * @model
 * @generated
 */
public interface SpanParam extends EObject {
	/**
	 * Returns the value of the '<em><b>Param Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mappingModel.ParamType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Type</em>' attribute.
	 * @see mappingModel.ParamType
	 * @see #setParamType(ParamType)
	 * @see mappingModel.MappingModelPackage#getSpanParam_ParamType()
	 * @model
	 * @generated
	 */
	ParamType getParamType();

	/**
	 * Sets the value of the '{@link mappingModel.SpanParam#getParamType <em>Param Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Type</em>' attribute.
	 * @see mappingModel.ParamType
	 * @see #getParamType()
	 * @generated
	 */
	void setParamType(ParamType value);

	/**
	 * Returns the value of the '<em><b>Param Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Param Name</em>' attribute.
	 * @see #setParamName(String)
	 * @see mappingModel.MappingModelPackage#getSpanParam_ParamName()
	 * @model id="true"
	 * @generated
	 */
	String getParamName();

	/**
	 * Sets the value of the '{@link mappingModel.SpanParam#getParamName <em>Param Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Param Name</em>' attribute.
	 * @see #getParamName()
	 * @generated
	 */
	void setParamName(String value);

	/**
	 * Returns the value of the '<em><b>Annotation</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Annotation</em>' reference.
	 * @see #setAnnotation(Annotation)
	 * @see mappingModel.MappingModelPackage#getSpanParam_Annotation()
	 * @model
	 * @generated
	 */
	Annotation getAnnotation();

	/**
	 * Sets the value of the '{@link mappingModel.SpanParam#getAnnotation <em>Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Annotation</em>' reference.
	 * @see #getAnnotation()
	 * @generated
	 */
	void setAnnotation(Annotation value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * The literals are from the enumeration {@link mappingModel.Type}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see mappingModel.Type
	 * @see #setType(Type)
	 * @see mappingModel.MappingModelPackage#getSpanParam_Type()
	 * @model
	 * @generated
	 */
	Type getType();

	/**
	 * Sets the value of the '{@link mappingModel.SpanParam#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see mappingModel.Type
	 * @see #getType()
	 * @generated
	 */
	void setType(Type value);

} // SpanParam

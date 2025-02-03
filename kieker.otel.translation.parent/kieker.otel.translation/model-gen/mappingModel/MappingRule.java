/**
 */
package mappingModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Rule</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mappingModel.MappingRule#getFrom <em>From</em>}</li>
 * </ul>
 *
 * @see mappingModel.MappingModelPackage#getMappingRule()
 * @model
 * @generated
 */
public interface MappingRule extends EObject {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(SpanParam)
	 * @see mappingModel.MappingModelPackage#getMappingRule_From()
	 * @model
	 * @generated
	 */
	SpanParam getFrom();

	/**
	 * Sets the value of the '{@link mappingModel.MappingRule#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(SpanParam value);

} // MappingRule

/**
 */
package mappingModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mappingModel.Mapping#getMappingRules <em>Mapping Rules</em>}</li>
 *   <li>{@link mappingModel.Mapping#getRecordFQClassName <em>Record FQ Class Name</em>}</li>
 * </ul>
 *
 * @see mappingModel.MappingModelPackage#getMapping()
 * @model
 * @generated
 */
public interface Mapping extends EObject {
	/**
	 * Returns the value of the '<em><b>Mapping Rules</b></em>' reference list.
	 * The list contents are of type {@link mappingModel.MappingRule}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mapping Rules</em>' reference list.
	 * @see mappingModel.MappingModelPackage#getMapping_MappingRules()
	 * @model
	 * @generated
	 */
	EList<MappingRule> getMappingRules();

	/**
	 * Returns the value of the '<em><b>Record FQ Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Record FQ Class Name</em>' attribute.
	 * @see #setRecordFQClassName(String)
	 * @see mappingModel.MappingModelPackage#getMapping_RecordFQClassName()
	 * @model
	 * @generated
	 */
	String getRecordFQClassName();

	/**
	 * Sets the value of the '{@link mappingModel.Mapping#getRecordFQClassName <em>Record FQ Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Record FQ Class Name</em>' attribute.
	 * @see #getRecordFQClassName()
	 * @generated
	 */
	void setRecordFQClassName(String value);

} // Mapping

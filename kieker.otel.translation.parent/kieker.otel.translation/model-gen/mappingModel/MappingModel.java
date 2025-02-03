/**
 */
package mappingModel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mappingModel.MappingModel#getMappings <em>Mappings</em>}</li>
 * </ul>
 *
 * @see mappingModel.MappingModelPackage#getMappingModel()
 * @model
 * @generated
 */
public interface MappingModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Mappings</b></em>' reference list.
	 * The list contents are of type {@link mappingModel.Mapping}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mappings</em>' reference list.
	 * @see mappingModel.MappingModelPackage#getMappingModel_Mappings()
	 * @model resolveProxies="false" required="true"
	 * @generated
	 */
	EList<Mapping> getMappings();

} // MappingModel

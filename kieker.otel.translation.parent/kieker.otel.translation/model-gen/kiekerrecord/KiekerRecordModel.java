/**
 */
package kiekerrecord;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kieker Record Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kiekerrecord.KiekerRecordModel#getRecords <em>Records</em>}</li>
 * </ul>
 *
 * @see kiekerrecord.KiekerrecordPackage#getKiekerRecordModel()
 * @model
 * @generated
 */
public interface KiekerRecordModel extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Records</b></em>' containment reference list.
	 * The list contents are of type {@link kiekerrecord.KiekerRecord}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Records</em>' containment reference list.
	 * @see kiekerrecord.KiekerrecordPackage#getKiekerRecordModel_Records()
	 * @model containment="true"
	 * @generated
	 */
	EList<KiekerRecord> getRecords();

} // KiekerRecordModel

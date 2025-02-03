/**
 */
package kiekerrecord;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Kieker Record</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link kiekerrecord.KiekerRecord#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link kiekerrecord.KiekerRecord#getFqClassName <em>Fq Class Name</em>}</li>
 * </ul>
 *
 * @see kiekerrecord.KiekerrecordPackage#getKiekerRecord()
 * @model
 * @generated
 */
public interface KiekerRecord extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link kiekerrecord.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see kiekerrecord.KiekerrecordPackage#getKiekerRecord_Attributes()
	 * @model containment="true" required="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

	/**
	 * Returns the value of the '<em><b>Fq Class Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fq Class Name</em>' attribute.
	 * @see #setFqClassName(String)
	 * @see kiekerrecord.KiekerrecordPackage#getKiekerRecord_FqClassName()
	 * @model
	 * @generated
	 */
	String getFqClassName();

	/**
	 * Sets the value of the '{@link kiekerrecord.KiekerRecord#getFqClassName <em>Fq Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fq Class Name</em>' attribute.
	 * @see #getFqClassName()
	 * @generated
	 */
	void setFqClassName(String value);

} // KiekerRecord

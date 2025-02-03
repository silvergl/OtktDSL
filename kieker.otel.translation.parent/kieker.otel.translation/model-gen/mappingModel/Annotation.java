/**
 */
package mappingModel;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link mappingModel.Annotation#getDependency <em>Dependency</em>}</li>
 *   <li>{@link mappingModel.Annotation#getValue <em>Value</em>}</li>
 * </ul>
 *
 * @see mappingModel.MappingModelPackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject {
	/**
	 * Returns the value of the '<em><b>Dependency</b></em>' attribute.
	 * The literals are from the enumeration {@link mappingModel.Dependency}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dependency</em>' attribute.
	 * @see mappingModel.Dependency
	 * @see #setDependency(Dependency)
	 * @see mappingModel.MappingModelPackage#getAnnotation_Dependency()
	 * @model
	 * @generated
	 */
	Dependency getDependency();

	/**
	 * Sets the value of the '{@link mappingModel.Annotation#getDependency <em>Dependency</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Dependency</em>' attribute.
	 * @see mappingModel.Dependency
	 * @see #getDependency()
	 * @generated
	 */
	void setDependency(Dependency value);

	/**
	 * Returns the value of the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Value</em>' attribute.
	 * @see #setValue(int)
	 * @see mappingModel.MappingModelPackage#getAnnotation_Value()
	 * @model
	 * @generated
	 */
	int getValue();

	/**
	 * Sets the value of the '{@link mappingModel.Annotation#getValue <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Value</em>' attribute.
	 * @see #getValue()
	 * @generated
	 */
	void setValue(int value);

} // Annotation

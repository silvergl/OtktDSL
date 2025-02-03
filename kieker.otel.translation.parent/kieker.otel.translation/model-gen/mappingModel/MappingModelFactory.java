/**
 */
package mappingModel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see mappingModel.MappingModelPackage
 * @generated
 */
public interface MappingModelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MappingModelFactory eINSTANCE = mappingModel.impl.MappingModelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Mapping Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Model</em>'.
	 * @generated
	 */
	MappingModel createMappingModel();

	/**
	 * Returns a new object of class '<em>Mapping Rule</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping Rule</em>'.
	 * @generated
	 */
	MappingRule createMappingRule();

	/**
	 * Returns a new object of class '<em>Span Param</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Span Param</em>'.
	 * @generated
	 */
	SpanParam createSpanParam();

	/**
	 * Returns a new object of class '<em>Annotation</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Annotation</em>'.
	 * @generated
	 */
	Annotation createAnnotation();

	/**
	 * Returns a new object of class '<em>Mapping</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Mapping</em>'.
	 * @generated
	 */
	Mapping createMapping();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MappingModelPackage getMappingModelPackage();

} //MappingModelFactory

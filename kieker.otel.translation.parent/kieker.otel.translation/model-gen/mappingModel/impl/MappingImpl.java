/**
 */
package mappingModel.impl;

import java.util.Collection;

import mappingModel.Mapping;
import mappingModel.MappingModelPackage;
import mappingModel.MappingRule;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Mapping</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mappingModel.impl.MappingImpl#getMappingRules <em>Mapping Rules</em>}</li>
 *   <li>{@link mappingModel.impl.MappingImpl#getRecordFQClassName <em>Record FQ Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MappingImpl extends MinimalEObjectImpl.Container implements Mapping {
	/**
	 * The cached value of the '{@link #getMappingRules() <em>Mapping Rules</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMappingRules()
	 * @generated
	 * @ordered
	 */
	protected EList<MappingRule> mappingRules;

	/**
	 * The default value of the '{@link #getRecordFQClassName() <em>Record FQ Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordFQClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String RECORD_FQ_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRecordFQClassName() <em>Record FQ Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecordFQClassName()
	 * @generated
	 * @ordered
	 */
	protected String recordFQClassName = RECORD_FQ_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MappingImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingModelPackage.Literals.MAPPING;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<MappingRule> getMappingRules() {
		if (mappingRules == null) {
			mappingRules = new EObjectResolvingEList<MappingRule>(MappingRule.class, this, MappingModelPackage.MAPPING__MAPPING_RULES);
		}
		return mappingRules;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRecordFQClassName() {
		return recordFQClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRecordFQClassName(String newRecordFQClassName) {
		String oldRecordFQClassName = recordFQClassName;
		recordFQClassName = newRecordFQClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingModelPackage.MAPPING__RECORD_FQ_CLASS_NAME, oldRecordFQClassName, recordFQClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingModelPackage.MAPPING__MAPPING_RULES:
				return getMappingRules();
			case MappingModelPackage.MAPPING__RECORD_FQ_CLASS_NAME:
				return getRecordFQClassName();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MappingModelPackage.MAPPING__MAPPING_RULES:
				getMappingRules().clear();
				getMappingRules().addAll((Collection<? extends MappingRule>)newValue);
				return;
			case MappingModelPackage.MAPPING__RECORD_FQ_CLASS_NAME:
				setRecordFQClassName((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case MappingModelPackage.MAPPING__MAPPING_RULES:
				getMappingRules().clear();
				return;
			case MappingModelPackage.MAPPING__RECORD_FQ_CLASS_NAME:
				setRecordFQClassName(RECORD_FQ_CLASS_NAME_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case MappingModelPackage.MAPPING__MAPPING_RULES:
				return mappingRules != null && !mappingRules.isEmpty();
			case MappingModelPackage.MAPPING__RECORD_FQ_CLASS_NAME:
				return RECORD_FQ_CLASS_NAME_EDEFAULT == null ? recordFQClassName != null : !RECORD_FQ_CLASS_NAME_EDEFAULT.equals(recordFQClassName);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (recordFQClassName: ");
		result.append(recordFQClassName);
		result.append(')');
		return result.toString();
	}

} //MappingImpl

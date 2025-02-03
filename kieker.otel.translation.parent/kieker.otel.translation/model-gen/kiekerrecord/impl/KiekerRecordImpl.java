/**
 */
package kiekerrecord.impl;

import java.util.Collection;

import kiekerrecord.Attribute;
import kiekerrecord.KiekerRecord;
import kiekerrecord.KiekerrecordPackage;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kieker Record</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kiekerrecord.impl.KiekerRecordImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link kiekerrecord.impl.KiekerRecordImpl#getFqClassName <em>Fq Class Name</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KiekerRecordImpl extends NamedElementImpl implements KiekerRecord {
	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The default value of the '{@link #getFqClassName() <em>Fq Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFqClassName()
	 * @generated
	 * @ordered
	 */
	protected static final String FQ_CLASS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFqClassName() <em>Fq Class Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFqClassName()
	 * @generated
	 * @ordered
	 */
	protected String fqClassName = FQ_CLASS_NAME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KiekerRecordImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KiekerrecordPackage.Literals.KIEKER_RECORD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this, KiekerrecordPackage.KIEKER_RECORD__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFqClassName() {
		return fqClassName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFqClassName(String newFqClassName) {
		String oldFqClassName = fqClassName;
		fqClassName = newFqClassName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KiekerrecordPackage.KIEKER_RECORD__FQ_CLASS_NAME, oldFqClassName, fqClassName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KiekerrecordPackage.KIEKER_RECORD__ATTRIBUTES:
				return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KiekerrecordPackage.KIEKER_RECORD__ATTRIBUTES:
				return getAttributes();
			case KiekerrecordPackage.KIEKER_RECORD__FQ_CLASS_NAME:
				return getFqClassName();
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
			case KiekerrecordPackage.KIEKER_RECORD__ATTRIBUTES:
				getAttributes().clear();
				getAttributes().addAll((Collection<? extends Attribute>)newValue);
				return;
			case KiekerrecordPackage.KIEKER_RECORD__FQ_CLASS_NAME:
				setFqClassName((String)newValue);
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
			case KiekerrecordPackage.KIEKER_RECORD__ATTRIBUTES:
				getAttributes().clear();
				return;
			case KiekerrecordPackage.KIEKER_RECORD__FQ_CLASS_NAME:
				setFqClassName(FQ_CLASS_NAME_EDEFAULT);
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
			case KiekerrecordPackage.KIEKER_RECORD__ATTRIBUTES:
				return attributes != null && !attributes.isEmpty();
			case KiekerrecordPackage.KIEKER_RECORD__FQ_CLASS_NAME:
				return FQ_CLASS_NAME_EDEFAULT == null ? fqClassName != null : !FQ_CLASS_NAME_EDEFAULT.equals(fqClassName);
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
		result.append(" (fqClassName: ");
		result.append(fqClassName);
		result.append(')');
		return result.toString();
	}

} //KiekerRecordImpl

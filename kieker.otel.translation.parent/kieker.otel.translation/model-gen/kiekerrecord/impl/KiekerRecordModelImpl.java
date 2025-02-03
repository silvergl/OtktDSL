/**
 */
package kiekerrecord.impl;

import java.util.Collection;

import kiekerrecord.KiekerRecord;
import kiekerrecord.KiekerRecordModel;
import kiekerrecord.KiekerrecordPackage;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Kieker Record Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link kiekerrecord.impl.KiekerRecordModelImpl#getRecords <em>Records</em>}</li>
 * </ul>
 *
 * @generated
 */
public class KiekerRecordModelImpl extends NamedElementImpl implements KiekerRecordModel {
	/**
	 * The cached value of the '{@link #getRecords() <em>Records</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRecords()
	 * @generated
	 * @ordered
	 */
	protected EList<KiekerRecord> records;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected KiekerRecordModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KiekerrecordPackage.Literals.KIEKER_RECORD_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<KiekerRecord> getRecords() {
		if (records == null) {
			records = new EObjectContainmentEList<KiekerRecord>(KiekerRecord.class, this, KiekerrecordPackage.KIEKER_RECORD_MODEL__RECORDS);
		}
		return records;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KiekerrecordPackage.KIEKER_RECORD_MODEL__RECORDS:
				return ((InternalEList<?>)getRecords()).basicRemove(otherEnd, msgs);
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
			case KiekerrecordPackage.KIEKER_RECORD_MODEL__RECORDS:
				return getRecords();
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
			case KiekerrecordPackage.KIEKER_RECORD_MODEL__RECORDS:
				getRecords().clear();
				getRecords().addAll((Collection<? extends KiekerRecord>)newValue);
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
			case KiekerrecordPackage.KIEKER_RECORD_MODEL__RECORDS:
				getRecords().clear();
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
			case KiekerrecordPackage.KIEKER_RECORD_MODEL__RECORDS:
				return records != null && !records.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //KiekerRecordModelImpl

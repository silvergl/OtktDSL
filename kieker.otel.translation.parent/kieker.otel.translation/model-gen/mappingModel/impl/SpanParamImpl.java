/**
 */
package mappingModel.impl;

import mappingModel.Annotation;
import mappingModel.MappingModelPackage;
import mappingModel.ParamType;
import mappingModel.SpanParam;
import mappingModel.Type;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Span Param</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mappingModel.impl.SpanParamImpl#getParamType <em>Param Type</em>}</li>
 *   <li>{@link mappingModel.impl.SpanParamImpl#getParamName <em>Param Name</em>}</li>
 *   <li>{@link mappingModel.impl.SpanParamImpl#getAnnotation <em>Annotation</em>}</li>
 *   <li>{@link mappingModel.impl.SpanParamImpl#getType <em>Type</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SpanParamImpl extends MinimalEObjectImpl.Container implements SpanParam {
	/**
	 * The default value of the '{@link #getParamType() <em>Param Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamType()
	 * @generated
	 * @ordered
	 */
	protected static final ParamType PARAM_TYPE_EDEFAULT = ParamType.DEFAULT;

	/**
	 * The cached value of the '{@link #getParamType() <em>Param Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamType()
	 * @generated
	 * @ordered
	 */
	protected ParamType paramType = PARAM_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getParamName() <em>Param Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamName()
	 * @generated
	 * @ordered
	 */
	protected static final String PARAM_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getParamName() <em>Param Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParamName()
	 * @generated
	 * @ordered
	 */
	protected String paramName = PARAM_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAnnotation() <em>Annotation</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotation()
	 * @generated
	 * @ordered
	 */
	protected Annotation annotation;

	/**
	 * The default value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected static final Type TYPE_EDEFAULT = Type.INT;

	/**
	 * The cached value of the '{@link #getType() <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getType()
	 * @generated
	 * @ordered
	 */
	protected Type type = TYPE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SpanParamImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MappingModelPackage.Literals.SPAN_PARAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ParamType getParamType() {
		return paramType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParamType(ParamType newParamType) {
		ParamType oldParamType = paramType;
		paramType = newParamType == null ? PARAM_TYPE_EDEFAULT : newParamType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingModelPackage.SPAN_PARAM__PARAM_TYPE, oldParamType, paramType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getParamName() {
		return paramName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setParamName(String newParamName) {
		String oldParamName = paramName;
		paramName = newParamName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingModelPackage.SPAN_PARAM__PARAM_NAME, oldParamName, paramName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Annotation getAnnotation() {
		if (annotation != null && annotation.eIsProxy()) {
			InternalEObject oldAnnotation = (InternalEObject)annotation;
			annotation = (Annotation)eResolveProxy(oldAnnotation);
			if (annotation != oldAnnotation) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MappingModelPackage.SPAN_PARAM__ANNOTATION, oldAnnotation, annotation));
			}
		}
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Annotation basicGetAnnotation() {
		return annotation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setAnnotation(Annotation newAnnotation) {
		Annotation oldAnnotation = annotation;
		annotation = newAnnotation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingModelPackage.SPAN_PARAM__ANNOTATION, oldAnnotation, annotation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Type getType() {
		return type;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setType(Type newType) {
		Type oldType = type;
		type = newType == null ? TYPE_EDEFAULT : newType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MappingModelPackage.SPAN_PARAM__TYPE, oldType, type));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case MappingModelPackage.SPAN_PARAM__PARAM_TYPE:
				return getParamType();
			case MappingModelPackage.SPAN_PARAM__PARAM_NAME:
				return getParamName();
			case MappingModelPackage.SPAN_PARAM__ANNOTATION:
				if (resolve) return getAnnotation();
				return basicGetAnnotation();
			case MappingModelPackage.SPAN_PARAM__TYPE:
				return getType();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case MappingModelPackage.SPAN_PARAM__PARAM_TYPE:
				setParamType((ParamType)newValue);
				return;
			case MappingModelPackage.SPAN_PARAM__PARAM_NAME:
				setParamName((String)newValue);
				return;
			case MappingModelPackage.SPAN_PARAM__ANNOTATION:
				setAnnotation((Annotation)newValue);
				return;
			case MappingModelPackage.SPAN_PARAM__TYPE:
				setType((Type)newValue);
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
			case MappingModelPackage.SPAN_PARAM__PARAM_TYPE:
				setParamType(PARAM_TYPE_EDEFAULT);
				return;
			case MappingModelPackage.SPAN_PARAM__PARAM_NAME:
				setParamName(PARAM_NAME_EDEFAULT);
				return;
			case MappingModelPackage.SPAN_PARAM__ANNOTATION:
				setAnnotation((Annotation)null);
				return;
			case MappingModelPackage.SPAN_PARAM__TYPE:
				setType(TYPE_EDEFAULT);
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
			case MappingModelPackage.SPAN_PARAM__PARAM_TYPE:
				return paramType != PARAM_TYPE_EDEFAULT;
			case MappingModelPackage.SPAN_PARAM__PARAM_NAME:
				return PARAM_NAME_EDEFAULT == null ? paramName != null : !PARAM_NAME_EDEFAULT.equals(paramName);
			case MappingModelPackage.SPAN_PARAM__ANNOTATION:
				return annotation != null;
			case MappingModelPackage.SPAN_PARAM__TYPE:
				return type != TYPE_EDEFAULT;
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
		result.append(" (paramType: ");
		result.append(paramType);
		result.append(", paramName: ");
		result.append(paramName);
		result.append(", Type: ");
		result.append(type);
		result.append(')');
		return result.toString();
	}

} //SpanParamImpl

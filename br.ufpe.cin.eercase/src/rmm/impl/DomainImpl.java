/**
 */
package rmm.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rmm.BaseType;
import rmm.Check;
import rmm.Domain;
import rmm.RmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rmm.impl.DomainImpl#getName <em>Name</em>}</li>
 *   <li>{@link rmm.impl.DomainImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rmm.impl.DomainImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link rmm.impl.DomainImpl#isIsNotNull <em>Is Not Null</em>}</li>
 *   <li>{@link rmm.impl.DomainImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link rmm.impl.DomainImpl#getConstraintCheckDomain <em>Constraint Check Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DomainImpl extends EObjectImpl implements Domain {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected static final String DEFAULT_VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefaultValue() <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefaultValue()
	 * @generated
	 * @ordered
	 */
	protected String defaultValue = DEFAULT_VALUE_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsNotNull() <em>Is Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNotNull()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_NOT_NULL_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsNotNull() <em>Is Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsNotNull()
	 * @generated
	 * @ordered
	 */
	protected boolean isNotNull = IS_NOT_NULL_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final BaseType DATA_TYPE_EDEFAULT = BaseType.STRING;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected BaseType dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConstraintCheckDomain() <em>Constraint Check Domain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConstraintCheckDomain()
	 * @generated
	 * @ordered
	 */
	protected EList<Check> constraintCheckDomain;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DomainImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmmPackage.Literals.DOMAIN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.DOMAIN__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.DOMAIN__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefaultValue() {
		return defaultValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefaultValue(String newDefaultValue) {
		String oldDefaultValue = defaultValue;
		defaultValue = newDefaultValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.DOMAIN__DEFAULT_VALUE, oldDefaultValue, defaultValue));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsNotNull() {
		return isNotNull;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsNotNull(boolean newIsNotNull) {
		boolean oldIsNotNull = isNotNull;
		isNotNull = newIsNotNull;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.DOMAIN__IS_NOT_NULL, oldIsNotNull, isNotNull));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseType getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(BaseType newDataType) {
		BaseType oldDataType = dataType;
		dataType = newDataType == null ? DATA_TYPE_EDEFAULT : newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.DOMAIN__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Check> getConstraintCheckDomain() {
		if (constraintCheckDomain == null) {
			constraintCheckDomain = new EObjectContainmentEList<Check>(Check.class, this, RmmPackage.DOMAIN__CONSTRAINT_CHECK_DOMAIN);
		}
		return constraintCheckDomain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case RmmPackage.DOMAIN__CONSTRAINT_CHECK_DOMAIN:
				return ((InternalEList<?>)getConstraintCheckDomain()).basicRemove(otherEnd, msgs);
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
			case RmmPackage.DOMAIN__NAME:
				return getName();
			case RmmPackage.DOMAIN__DESCRIPTION:
				return getDescription();
			case RmmPackage.DOMAIN__DEFAULT_VALUE:
				return getDefaultValue();
			case RmmPackage.DOMAIN__IS_NOT_NULL:
				return isIsNotNull();
			case RmmPackage.DOMAIN__DATA_TYPE:
				return getDataType();
			case RmmPackage.DOMAIN__CONSTRAINT_CHECK_DOMAIN:
				return getConstraintCheckDomain();
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
			case RmmPackage.DOMAIN__NAME:
				setName((String)newValue);
				return;
			case RmmPackage.DOMAIN__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RmmPackage.DOMAIN__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case RmmPackage.DOMAIN__IS_NOT_NULL:
				setIsNotNull((Boolean)newValue);
				return;
			case RmmPackage.DOMAIN__DATA_TYPE:
				setDataType((BaseType)newValue);
				return;
			case RmmPackage.DOMAIN__CONSTRAINT_CHECK_DOMAIN:
				getConstraintCheckDomain().clear();
				getConstraintCheckDomain().addAll((Collection<? extends Check>)newValue);
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
			case RmmPackage.DOMAIN__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RmmPackage.DOMAIN__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RmmPackage.DOMAIN__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case RmmPackage.DOMAIN__IS_NOT_NULL:
				setIsNotNull(IS_NOT_NULL_EDEFAULT);
				return;
			case RmmPackage.DOMAIN__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case RmmPackage.DOMAIN__CONSTRAINT_CHECK_DOMAIN:
				getConstraintCheckDomain().clear();
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
			case RmmPackage.DOMAIN__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RmmPackage.DOMAIN__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RmmPackage.DOMAIN__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case RmmPackage.DOMAIN__IS_NOT_NULL:
				return isNotNull != IS_NOT_NULL_EDEFAULT;
			case RmmPackage.DOMAIN__DATA_TYPE:
				return dataType != DATA_TYPE_EDEFAULT;
			case RmmPackage.DOMAIN__CONSTRAINT_CHECK_DOMAIN:
				return constraintCheckDomain != null && !constraintCheckDomain.isEmpty();
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

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", isNotNull: ");
		result.append(isNotNull);
		result.append(", dataType: ");
		result.append(dataType);
		result.append(')');
		return result.toString();
	}

} //DomainImpl

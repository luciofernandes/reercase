/**
 */
package rmm.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;

import rmm.Attribute;
import rmm.BaseType;
import rmm.Domain;
import rmm.RmmPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link rmm.impl.AttributeImpl#getName <em>Name</em>}</li>
 *   <li>{@link rmm.impl.AttributeImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link rmm.impl.AttributeImpl#getSize <em>Size</em>}</li>
 *   <li>{@link rmm.impl.AttributeImpl#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link rmm.impl.AttributeImpl#isIsNotNull <em>Is Not Null</em>}</li>
 *   <li>{@link rmm.impl.AttributeImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rmm.impl.AttributeImpl#getDomainType <em>Domain Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AttributeImpl extends EObjectImpl implements Attribute {
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
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected Integer size = SIZE_EDEFAULT;

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
	 * The cached value of the '{@link #getDomainType() <em>Domain Type</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainType()
	 * @generated
	 * @ordered
	 */
	protected Domain domainType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AttributeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return RmmPackage.Literals.ATTRIBUTE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.ATTRIBUTE__NAME, oldName, name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.ATTRIBUTE__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(Integer newSize) {
		Integer oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.ATTRIBUTE__SIZE, oldSize, size));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.ATTRIBUTE__DEFAULT_VALUE, oldDefaultValue, defaultValue));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.ATTRIBUTE__IS_NOT_NULL, oldIsNotNull, isNotNull));
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
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.ATTRIBUTE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain getDomainType() {
		if (domainType != null && domainType.eIsProxy()) {
			InternalEObject oldDomainType = (InternalEObject)domainType;
			domainType = (Domain)eResolveProxy(oldDomainType);
			if (domainType != oldDomainType) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, RmmPackage.ATTRIBUTE__DOMAIN_TYPE, oldDomainType, domainType));
			}
		}
		return domainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Domain basicGetDomainType() {
		return domainType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDomainType(Domain newDomainType) {
		Domain oldDomainType = domainType;
		domainType = newDomainType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, RmmPackage.ATTRIBUTE__DOMAIN_TYPE, oldDomainType, domainType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case RmmPackage.ATTRIBUTE__NAME:
				return getName();
			case RmmPackage.ATTRIBUTE__DATA_TYPE:
				return getDataType();
			case RmmPackage.ATTRIBUTE__SIZE:
				return getSize();
			case RmmPackage.ATTRIBUTE__DEFAULT_VALUE:
				return getDefaultValue();
			case RmmPackage.ATTRIBUTE__IS_NOT_NULL:
				return isIsNotNull();
			case RmmPackage.ATTRIBUTE__DESCRIPTION:
				return getDescription();
			case RmmPackage.ATTRIBUTE__DOMAIN_TYPE:
				if (resolve) return getDomainType();
				return basicGetDomainType();
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
			case RmmPackage.ATTRIBUTE__NAME:
				setName((String)newValue);
				return;
			case RmmPackage.ATTRIBUTE__DATA_TYPE:
				setDataType((BaseType)newValue);
				return;
			case RmmPackage.ATTRIBUTE__SIZE:
				setSize((Integer)newValue);
				return;
			case RmmPackage.ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue((String)newValue);
				return;
			case RmmPackage.ATTRIBUTE__IS_NOT_NULL:
				setIsNotNull((Boolean)newValue);
				return;
			case RmmPackage.ATTRIBUTE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case RmmPackage.ATTRIBUTE__DOMAIN_TYPE:
				setDomainType((Domain)newValue);
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
			case RmmPackage.ATTRIBUTE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case RmmPackage.ATTRIBUTE__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case RmmPackage.ATTRIBUTE__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
			case RmmPackage.ATTRIBUTE__DEFAULT_VALUE:
				setDefaultValue(DEFAULT_VALUE_EDEFAULT);
				return;
			case RmmPackage.ATTRIBUTE__IS_NOT_NULL:
				setIsNotNull(IS_NOT_NULL_EDEFAULT);
				return;
			case RmmPackage.ATTRIBUTE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case RmmPackage.ATTRIBUTE__DOMAIN_TYPE:
				setDomainType((Domain)null);
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
			case RmmPackage.ATTRIBUTE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case RmmPackage.ATTRIBUTE__DATA_TYPE:
				return dataType != DATA_TYPE_EDEFAULT;
			case RmmPackage.ATTRIBUTE__SIZE:
				return SIZE_EDEFAULT == null ? size != null : !SIZE_EDEFAULT.equals(size);
			case RmmPackage.ATTRIBUTE__DEFAULT_VALUE:
				return DEFAULT_VALUE_EDEFAULT == null ? defaultValue != null : !DEFAULT_VALUE_EDEFAULT.equals(defaultValue);
			case RmmPackage.ATTRIBUTE__IS_NOT_NULL:
				return isNotNull != IS_NOT_NULL_EDEFAULT;
			case RmmPackage.ATTRIBUTE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case RmmPackage.ATTRIBUTE__DOMAIN_TYPE:
				return domainType != null;
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
		result.append(", dataType: ");
		result.append(dataType);
		result.append(", size: ");
		result.append(size);
		result.append(", defaultValue: ");
		result.append(defaultValue);
		result.append(", isNotNull: ");
		result.append(isNotNull);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //AttributeImpl

/**
 */
package rmm;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Domain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rmm.Domain#getName <em>Name</em>}</li>
 *   <li>{@link rmm.Domain#getDescription <em>Description</em>}</li>
 *   <li>{@link rmm.Domain#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link rmm.Domain#isIsNotNull <em>Is Not Null</em>}</li>
 *   <li>{@link rmm.Domain#getDataType <em>Data Type</em>}</li>
 *   <li>{@link rmm.Domain#getConstraintCheckDomain <em>Constraint Check Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see rmm.RmmPackage#getDomain()
 * @model annotation="gmf.node label='name' figure='rectangle'"
 * @generated
 */
public interface Domain extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rmm.RmmPackage#getDomain_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rmm.Domain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see rmm.RmmPackage#getDomain_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link rmm.Domain#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Default Value</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Default Value</em>' attribute.
	 * @see #setDefaultValue(String)
	 * @see rmm.RmmPackage#getDomain_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link rmm.Domain#getDefaultValue <em>Default Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Default Value</em>' attribute.
	 * @see #getDefaultValue()
	 * @generated
	 */
	void setDefaultValue(String value);

	/**
	 * Returns the value of the '<em><b>Is Not Null</b></em>' attribute.
	 * The default value is <code>"false"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Not Null</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Not Null</em>' attribute.
	 * @see #setIsNotNull(boolean)
	 * @see rmm.RmmPackage#getDomain_IsNotNull()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsNotNull();

	/**
	 * Sets the value of the '{@link rmm.Domain#isIsNotNull <em>Is Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Not Null</em>' attribute.
	 * @see #isIsNotNull()
	 * @generated
	 */
	void setIsNotNull(boolean value);

	/**
	 * Returns the value of the '<em><b>Data Type</b></em>' attribute.
	 * The literals are from the enumeration {@link rmm.BaseType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data Type</em>' attribute.
	 * @see rmm.BaseType
	 * @see #setDataType(BaseType)
	 * @see rmm.RmmPackage#getDomain_DataType()
	 * @model
	 * @generated
	 */
	BaseType getDataType();

	/**
	 * Sets the value of the '{@link rmm.Domain#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see rmm.BaseType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(BaseType value);

	/**
	 * Returns the value of the '<em><b>Constraint Check Domain</b></em>' containment reference list.
	 * The list contents are of type {@link rmm.Check}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Constraint Check Domain</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Constraint Check Domain</em>' containment reference list.
	 * @see rmm.RmmPackage#getDomain_ConstraintCheckDomain()
	 * @model containment="true"
	 *        annotation="gmf.compartment layout='list' collapsible='false' width='1' incoming='false'"
	 * @generated
	 */
	EList<Check> getConstraintCheckDomain();

} // Domain

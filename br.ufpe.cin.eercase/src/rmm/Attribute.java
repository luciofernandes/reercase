/**
 */
package rmm;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rmm.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link rmm.Attribute#getDataType <em>Data Type</em>}</li>
 *   <li>{@link rmm.Attribute#getSize <em>Size</em>}</li>
 *   <li>{@link rmm.Attribute#getDefaultValue <em>Default Value</em>}</li>
 *   <li>{@link rmm.Attribute#isIsNotNull <em>Is Not Null</em>}</li>
 *   <li>{@link rmm.Attribute#getDescription <em>Description</em>}</li>
 *   <li>{@link rmm.Attribute#getDomain <em>Domain</em>}</li>
 * </ul>
 * </p>
 *
 * @see rmm.RmmPackage#getAttribute()
 * @model annotation="gmf.node label='name,dataType' figure='rectangle' label.icon='false' label.pattern='{0}:{1}'"
 * @generated
 */
public interface Attribute extends EObject {
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
	 * @see rmm.RmmPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rmm.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

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
	 * @see rmm.RmmPackage#getAttribute_DataType()
	 * @model
	 * @generated
	 */
	BaseType getDataType();

	/**
	 * Sets the value of the '{@link rmm.Attribute#getDataType <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Data Type</em>' attribute.
	 * @see rmm.BaseType
	 * @see #getDataType()
	 * @generated
	 */
	void setDataType(BaseType value);

	/**
	 * Returns the value of the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Size</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Size</em>' attribute.
	 * @see #setSize(Integer)
	 * @see rmm.RmmPackage#getAttribute_Size()
	 * @model
	 * @generated
	 */
	Integer getSize();

	/**
	 * Sets the value of the '{@link rmm.Attribute#getSize <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Size</em>' attribute.
	 * @see #getSize()
	 * @generated
	 */
	void setSize(Integer value);

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
	 * @see rmm.RmmPackage#getAttribute_DefaultValue()
	 * @model
	 * @generated
	 */
	String getDefaultValue();

	/**
	 * Sets the value of the '{@link rmm.Attribute#getDefaultValue <em>Default Value</em>}' attribute.
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
	 * @see rmm.RmmPackage#getAttribute_IsNotNull()
	 * @model default="false"
	 * @generated
	 */
	boolean isIsNotNull();

	/**
	 * Sets the value of the '{@link rmm.Attribute#isIsNotNull <em>Is Not Null</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Not Null</em>' attribute.
	 * @see #isIsNotNull()
	 * @generated
	 */
	void setIsNotNull(boolean value);

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
	 * @see rmm.RmmPackage#getAttribute_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link rmm.Attribute#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Domain</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain</em>' reference.
	 * @see #setDomain(Domain)
	 * @see rmm.RmmPackage#getAttribute_Domain()
	 * @model
	 * @generated
	 */
	Domain getDomain();

	/**
	 * Sets the value of the '{@link rmm.Attribute#getDomain <em>Domain</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain</em>' reference.
	 * @see #getDomain()
	 * @generated
	 */
	void setDomain(Domain value);

} // Attribute

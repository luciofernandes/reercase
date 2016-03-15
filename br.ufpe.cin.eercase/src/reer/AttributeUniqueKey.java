/**
 */
package reer;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Unique Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link reer.AttributeUniqueKey#getIdentity <em>Identity</em>}</li>
 *   <li>{@link reer.AttributeUniqueKey#getPosition <em>Position</em>}</li>
 * </ul>
 * </p>
 *
 * @see reer.ReerPackage#getAttributeUniqueKey()
 * @model annotation="gmf.node label='name,identity,position' figure='rectangle' label.icon='false' label.pattern='{0}({1}.{2})'"
 * @generated
 */
public interface AttributeUniqueKey extends Column {
	/**
	 * Returns the value of the '<em><b>Identity</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Identity</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Identity</em>' attribute.
	 * @see #setIdentity(String)
	 * @see reer.ReerPackage#getAttributeUniqueKey_Identity()
	 * @model default="1"
	 * @generated
	 */
	String getIdentity();

	/**
	 * Sets the value of the '{@link reer.AttributeUniqueKey#getIdentity <em>Identity</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Identity</em>' attribute.
	 * @see #getIdentity()
	 * @generated
	 */
	void setIdentity(String value);

	/**
	 * Returns the value of the '<em><b>Position</b></em>' attribute.
	 * The default value is <code>"1"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Position</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Position</em>' attribute.
	 * @see #setPosition(String)
	 * @see reer.ReerPackage#getAttributeUniqueKey_Position()
	 * @model default="1"
	 * @generated
	 */
	String getPosition();

	/**
	 * Sets the value of the '{@link reer.AttributeUniqueKey#getPosition <em>Position</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Position</em>' attribute.
	 * @see #getPosition()
	 * @generated
	 */
	void setPosition(String value);

} // AttributeUniqueKey

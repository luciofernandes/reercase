/**
 */
package rmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Primary Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rmm.PrimaryKey#getRelationship <em>Relationship</em>}</li>
 *   <li>{@link rmm.PrimaryKey#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see rmm.RmmPackage#getPrimaryKey()
 * @model
 * @generated
 */
public interface PrimaryKey extends Constraint {
	/**
	 * Returns the value of the '<em><b>Relationship</b></em>' containment reference list.
	 * The list contents are of type {@link rmm.Relationship}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Relationship</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Relationship</em>' containment reference list.
	 * @see rmm.RmmPackage#getPrimaryKey_Relationship()
	 * @model containment="true"
	 * @generated
	 */
	EList<Relationship> getRelationship();

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' reference list.
	 * The list contents are of type {@link rmm.Attribute}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' reference list.
	 * @see rmm.RmmPackage#getPrimaryKey_Attributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // PrimaryKey

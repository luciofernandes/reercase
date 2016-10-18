/**
 */
package rmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Foreign Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rmm.ForeignKey#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see rmm.RmmPackage#getForeignKey()
 * @model
 * @generated
 */
public interface ForeignKey extends Constraint {
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
	 * @see rmm.RmmPackage#getForeignKey_Attributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // ForeignKey

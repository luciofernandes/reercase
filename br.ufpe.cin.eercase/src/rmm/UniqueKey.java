/**
 */
package rmm;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unique Key</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link rmm.UniqueKey#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see rmm.RmmPackage#getUniqueKey()
 * @model
 * @generated
 */
public interface UniqueKey extends Constraint {
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
	 * @see rmm.RmmPackage#getUniqueKey_Attributes()
	 * @model
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // UniqueKey

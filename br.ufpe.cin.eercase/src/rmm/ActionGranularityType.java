/**
 */
package rmm;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Action Granularity Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see rmm.RmmPackage#getActionGranularityType()
 * @model
 * @generated
 */
public enum ActionGranularityType implements Enumerator {
	/**
	 * The '<em><b>STATEMENT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	STATEMENT(0, "STATEMENT", "STATEMENT"),

	/**
	 * The '<em><b>ROW</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ROW_VALUE
	 * @generated
	 * @ordered
	 */
	ROW(1, "ROW", "ROW");

	/**
	 * The '<em><b>STATEMENT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>STATEMENT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STATEMENT
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int STATEMENT_VALUE = 0;

	/**
	 * The '<em><b>ROW</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>ROW</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ROW
	 * @model
	 * @generated
	 * @ordered
	 */
	public static final int ROW_VALUE = 1;

	/**
	 * An array of all the '<em><b>Action Granularity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ActionGranularityType[] VALUES_ARRAY =
		new ActionGranularityType[] {
			STATEMENT,
			ROW,
		};

	/**
	 * A public read-only list of all the '<em><b>Action Granularity Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ActionGranularityType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Action Granularity Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionGranularityType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionGranularityType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Granularity Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionGranularityType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ActionGranularityType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Action Granularity Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ActionGranularityType get(int value) {
		switch (value) {
			case STATEMENT_VALUE: return STATEMENT;
			case ROW_VALUE: return ROW;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private ActionGranularityType(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
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
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //ActionGranularityType

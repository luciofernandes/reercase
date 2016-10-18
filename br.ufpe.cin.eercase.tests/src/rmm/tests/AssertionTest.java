/**
 */
package rmm.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import rmm.Assertion;
import rmm.RmmFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Assertion</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class AssertionTest extends TestCase {

	/**
	 * The fixture for this Assertion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Assertion fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(AssertionTest.class);
	}

	/**
	 * Constructs a new Assertion test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssertionTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Assertion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Assertion fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Assertion test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Assertion getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(RmmFactory.eINSTANCE.createAssertion());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //AssertionTest

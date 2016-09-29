/**
 */
package reer.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import reer.ReerFactory;
import reer.Teste;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Teste</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class TesteTest extends TestCase {

	/**
	 * The fixture for this Teste test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Teste fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(TesteTest.class);
	}

	/**
	 * Constructs a new Teste test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TesteTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Teste test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(Teste fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Teste test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Teste getFixture() {
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
		setFixture(ReerFactory.eINSTANCE.createTeste());
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

} //TesteTest

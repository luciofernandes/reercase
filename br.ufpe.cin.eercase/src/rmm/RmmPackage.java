/**
 */
package rmm;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see rmm.RmmFactory
 * @model kind="package"
 * @generated
 */
public interface RmmPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "rmm";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "rmm";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "rmm";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	RmmPackage eINSTANCE = rmm.impl.RmmPackageImpl.init();

	/**
	 * The meta object id for the '{@link rmm.impl.SchemaImpl <em>Schema</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rmm.impl.SchemaImpl
	 * @see rmm.impl.RmmPackageImpl#getSchema()
	 * @generated
	 */
	int SCHEMA = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__NAME = 0;

	/**
	 * The feature id for the '<em><b>Table</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__TABLE = 1;

	/**
	 * The feature id for the '<em><b>Assertion</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__ASSERTION = 2;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__DOMAIN = 3;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA__RELATIONSHIP = 4;

	/**
	 * The number of structural features of the '<em>Schema</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SCHEMA_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link rmm.impl.TableImpl <em>Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rmm.impl.TableImpl
	 * @see rmm.impl.RmmPackageImpl#getTable()
	 * @generated
	 */
	int TABLE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__ATTRIBUTES = 2;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE__CONSTRAINTS = 3;

	/**
	 * The number of structural features of the '<em>Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TABLE_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link rmm.impl.AssertionImpl <em>Assertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rmm.impl.AssertionImpl
	 * @see rmm.impl.RmmPackageImpl#getAssertion()
	 * @generated
	 */
	int ASSERTION = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION__CONDITION = 2;

	/**
	 * The number of structural features of the '<em>Assertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSERTION_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link rmm.impl.DomainImpl <em>Domain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rmm.impl.DomainImpl
	 * @see rmm.impl.RmmPackageImpl#getDomain()
	 * @generated
	 */
	int DOMAIN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DEFAULT_VALUE = 2;

	/**
	 * The feature id for the '<em><b>Is Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__IS_NOT_NULL = 3;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__DATA_TYPE = 4;

	/**
	 * The feature id for the '<em><b>Constraint Check Domain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN__CONSTRAINT_CHECK_DOMAIN = 5;

	/**
	 * The number of structural features of the '<em>Domain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOMAIN_FEATURE_COUNT = 6;

	/**
	 * The meta object id for the '{@link rmm.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rmm.impl.AttributeImpl
	 * @see rmm.impl.RmmPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DATA_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__SIZE = 2;

	/**
	 * The feature id for the '<em><b>Default Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DEFAULT_VALUE = 3;

	/**
	 * The feature id for the '<em><b>Is Not Null</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_NOT_NULL = 4;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DESCRIPTION = 5;

	/**
	 * The feature id for the '<em><b>Domain</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__DOMAIN = 6;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link rmm.impl.RelationshipImpl <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rmm.impl.RelationshipImpl
	 * @see rmm.impl.RmmPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = 0;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__UPDATE = 1;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__DELETE = 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = 4;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link rmm.impl.ConstraintImpl <em>Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rmm.impl.ConstraintImpl
	 * @see rmm.impl.RmmPackageImpl#getConstraint()
	 * @generated
	 */
	int CONSTRAINT = 6;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__ID = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__NAME = 1;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT__DESCRIPTION = 2;

	/**
	 * The number of structural features of the '<em>Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONSTRAINT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link rmm.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rmm.impl.PrimaryKeyImpl
	 * @see rmm.impl.RmmPackageImpl#getPrimaryKey()
	 * @generated
	 */
	int PRIMARY_KEY = 7;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__ID = CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__DESCRIPTION = CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__RELATIONSHIP = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY__ATTRIBUTES = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Primary Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIMARY_KEY_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The meta object id for the '{@link rmm.impl.AlternateKeyImpl <em>Alternate Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rmm.impl.AlternateKeyImpl
	 * @see rmm.impl.RmmPackageImpl#getAlternateKey()
	 * @generated
	 */
	int ALTERNATE_KEY = 8;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_KEY__ID = CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_KEY__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_KEY__DESCRIPTION = CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_KEY__ATTRIBUTES = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Alternate Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ALTERNATE_KEY_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rmm.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rmm.impl.ForeignKeyImpl
	 * @see rmm.impl.RmmPackageImpl#getForeignKey()
	 * @generated
	 */
	int FOREIGN_KEY = 9;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__ID = CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__DESCRIPTION = CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY__ATTRIBUTES = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Foreign Key</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FOREIGN_KEY_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rmm.impl.CheckImpl <em>Check</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rmm.impl.CheckImpl
	 * @see rmm.impl.RmmPackageImpl#getCheck()
	 * @generated
	 */
	int CHECK = 10;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__ID = CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__DESCRIPTION = CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK__CONDITION = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Check</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHECK_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The meta object id for the '{@link rmm.impl.TriggerImpl <em>Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rmm.impl.TriggerImpl
	 * @see rmm.impl.RmmPackageImpl#getTrigger()
	 * @generated
	 */
	int TRIGGER = 11;

	/**
	 * The feature id for the '<em><b>ID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__ID = CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NAME = CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__DESCRIPTION = CONSTRAINT__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Insert</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__INSERT = CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Update</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__UPDATE = CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Delete</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__DELETE = CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Action Time</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__ACTION_TIME = CONSTRAINT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__CONDITION = CONSTRAINT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Statement SQL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__STATEMENT_SQL = CONSTRAINT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Action Granularity</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__ACTION_GRANULARITY = CONSTRAINT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Old Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__OLD_ROW = CONSTRAINT_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>New Row</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NEW_ROW = CONSTRAINT_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Old Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__OLD_TABLE = CONSTRAINT_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>New Table</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__NEW_TABLE = CONSTRAINT_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER__ATTRIBUTES = CONSTRAINT_FEATURE_COUNT + 11;

	/**
	 * The number of structural features of the '<em>Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRIGGER_FEATURE_COUNT = CONSTRAINT_FEATURE_COUNT + 12;

	/**
	 * The meta object id for the '{@link rmm.ActionTimeType <em>Action Time Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rmm.ActionTimeType
	 * @see rmm.impl.RmmPackageImpl#getActionTimeType()
	 * @generated
	 */
	int ACTION_TIME_TYPE = 12;

	/**
	 * The meta object id for the '{@link rmm.ActionGranularityType <em>Action Granularity Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rmm.ActionGranularityType
	 * @see rmm.impl.RmmPackageImpl#getActionGranularityType()
	 * @generated
	 */
	int ACTION_GRANULARITY_TYPE = 13;

	/**
	 * The meta object id for the '{@link rmm.BaseType <em>Base Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rmm.BaseType
	 * @see rmm.impl.RmmPackageImpl#getBaseType()
	 * @generated
	 */
	int BASE_TYPE = 14;

	/**
	 * The meta object id for the '{@link rmm.OperationRestrictionIntegrity <em>Operation Restriction Integrity</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see rmm.OperationRestrictionIntegrity
	 * @see rmm.impl.RmmPackageImpl#getOperationRestrictionIntegrity()
	 * @generated
	 */
	int OPERATION_RESTRICTION_INTEGRITY = 15;


	/**
	 * Returns the meta object for class '{@link rmm.Schema <em>Schema</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Schema</em>'.
	 * @see rmm.Schema
	 * @generated
	 */
	EClass getSchema();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Schema#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rmm.Schema#getName()
	 * @see #getSchema()
	 * @generated
	 */
	EAttribute getSchema_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link rmm.Schema#getTable <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Table</em>'.
	 * @see rmm.Schema#getTable()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Table();

	/**
	 * Returns the meta object for the containment reference list '{@link rmm.Schema#getAssertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Assertion</em>'.
	 * @see rmm.Schema#getAssertion()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Assertion();

	/**
	 * Returns the meta object for the containment reference list '{@link rmm.Schema#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domain</em>'.
	 * @see rmm.Schema#getDomain()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Domain();

	/**
	 * Returns the meta object for the containment reference list '{@link rmm.Schema#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see rmm.Schema#getRelationship()
	 * @see #getSchema()
	 * @generated
	 */
	EReference getSchema_Relationship();

	/**
	 * Returns the meta object for class '{@link rmm.Table <em>Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Table</em>'.
	 * @see rmm.Table
	 * @generated
	 */
	EClass getTable();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Table#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rmm.Table#getName()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Name();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Table#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rmm.Table#getDescription()
	 * @see #getTable()
	 * @generated
	 */
	EAttribute getTable_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link rmm.Table#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see rmm.Table#getAttributes()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Attributes();

	/**
	 * Returns the meta object for the containment reference list '{@link rmm.Table#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see rmm.Table#getConstraints()
	 * @see #getTable()
	 * @generated
	 */
	EReference getTable_Constraints();

	/**
	 * Returns the meta object for class '{@link rmm.Assertion <em>Assertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Assertion</em>'.
	 * @see rmm.Assertion
	 * @generated
	 */
	EClass getAssertion();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Assertion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rmm.Assertion#getName()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_Name();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Assertion#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rmm.Assertion#getDescription()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_Description();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Assertion#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see rmm.Assertion#getCondition()
	 * @see #getAssertion()
	 * @generated
	 */
	EAttribute getAssertion_Condition();

	/**
	 * Returns the meta object for class '{@link rmm.Domain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Domain</em>'.
	 * @see rmm.Domain
	 * @generated
	 */
	EClass getDomain();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Domain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rmm.Domain#getName()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Name();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Domain#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rmm.Domain#getDescription()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_Description();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Domain#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see rmm.Domain#getDefaultValue()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Domain#isIsNotNull <em>Is Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Not Null</em>'.
	 * @see rmm.Domain#isIsNotNull()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_IsNotNull();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Domain#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see rmm.Domain#getDataType()
	 * @see #getDomain()
	 * @generated
	 */
	EAttribute getDomain_DataType();

	/**
	 * Returns the meta object for the containment reference list '{@link rmm.Domain#getConstraintCheckDomain <em>Constraint Check Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraint Check Domain</em>'.
	 * @see rmm.Domain#getConstraintCheckDomain()
	 * @see #getDomain()
	 * @generated
	 */
	EReference getDomain_ConstraintCheckDomain();

	/**
	 * Returns the meta object for class '{@link rmm.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see rmm.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rmm.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Attribute#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see rmm.Attribute#getDataType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DataType();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Attribute#getSize <em>Size</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Size</em>'.
	 * @see rmm.Attribute#getSize()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Size();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Attribute#getDefaultValue <em>Default Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Default Value</em>'.
	 * @see rmm.Attribute#getDefaultValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_DefaultValue();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Attribute#isIsNotNull <em>Is Not Null</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Not Null</em>'.
	 * @see rmm.Attribute#isIsNotNull()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsNotNull();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Attribute#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rmm.Attribute#getDescription()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Description();

	/**
	 * Returns the meta object for the reference '{@link rmm.Attribute#getDomain <em>Domain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Domain</em>'.
	 * @see rmm.Attribute#getDomain()
	 * @see #getAttribute()
	 * @generated
	 */
	EReference getAttribute_Domain();

	/**
	 * Returns the meta object for class '{@link rmm.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see rmm.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Relationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rmm.Relationship#getName()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Name();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Relationship#getUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see rmm.Relationship#getUpdate()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Update();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Relationship#getDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete</em>'.
	 * @see rmm.Relationship#getDelete()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Delete();

	/**
	 * Returns the meta object for the reference '{@link rmm.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see rmm.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the reference '{@link rmm.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see rmm.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for class '{@link rmm.Constraint <em>Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Constraint</em>'.
	 * @see rmm.Constraint
	 * @generated
	 */
	EClass getConstraint();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Constraint#getID <em>ID</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>ID</em>'.
	 * @see rmm.Constraint#getID()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_ID();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Constraint#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see rmm.Constraint#getName()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Name();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Constraint#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see rmm.Constraint#getDescription()
	 * @see #getConstraint()
	 * @generated
	 */
	EAttribute getConstraint_Description();

	/**
	 * Returns the meta object for class '{@link rmm.PrimaryKey <em>Primary Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Primary Key</em>'.
	 * @see rmm.PrimaryKey
	 * @generated
	 */
	EClass getPrimaryKey();

	/**
	 * Returns the meta object for the containment reference list '{@link rmm.PrimaryKey#getRelationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Relationship</em>'.
	 * @see rmm.PrimaryKey#getRelationship()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_Relationship();

	/**
	 * Returns the meta object for the reference list '{@link rmm.PrimaryKey#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see rmm.PrimaryKey#getAttributes()
	 * @see #getPrimaryKey()
	 * @generated
	 */
	EReference getPrimaryKey_Attributes();

	/**
	 * Returns the meta object for class '{@link rmm.AlternateKey <em>Alternate Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Alternate Key</em>'.
	 * @see rmm.AlternateKey
	 * @generated
	 */
	EClass getAlternateKey();

	/**
	 * Returns the meta object for the reference list '{@link rmm.AlternateKey#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see rmm.AlternateKey#getAttributes()
	 * @see #getAlternateKey()
	 * @generated
	 */
	EReference getAlternateKey_Attributes();

	/**
	 * Returns the meta object for class '{@link rmm.ForeignKey <em>Foreign Key</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Foreign Key</em>'.
	 * @see rmm.ForeignKey
	 * @generated
	 */
	EClass getForeignKey();

	/**
	 * Returns the meta object for the reference list '{@link rmm.ForeignKey#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see rmm.ForeignKey#getAttributes()
	 * @see #getForeignKey()
	 * @generated
	 */
	EReference getForeignKey_Attributes();

	/**
	 * Returns the meta object for class '{@link rmm.Check <em>Check</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Check</em>'.
	 * @see rmm.Check
	 * @generated
	 */
	EClass getCheck();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Check#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see rmm.Check#getCondition()
	 * @see #getCheck()
	 * @generated
	 */
	EAttribute getCheck_Condition();

	/**
	 * Returns the meta object for class '{@link rmm.Trigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Trigger</em>'.
	 * @see rmm.Trigger
	 * @generated
	 */
	EClass getTrigger();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Trigger#getActionGranularity <em>Action Granularity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Granularity</em>'.
	 * @see rmm.Trigger#getActionGranularity()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_ActionGranularity();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Trigger#getOldRow <em>Old Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Row</em>'.
	 * @see rmm.Trigger#getOldRow()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_OldRow();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Trigger#getNewRow <em>New Row</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Row</em>'.
	 * @see rmm.Trigger#getNewRow()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_NewRow();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Trigger#getOldTable <em>Old Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Old Table</em>'.
	 * @see rmm.Trigger#getOldTable()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_OldTable();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Trigger#getNewTable <em>New Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>New Table</em>'.
	 * @see rmm.Trigger#getNewTable()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_NewTable();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Trigger#isInsert <em>Insert</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Insert</em>'.
	 * @see rmm.Trigger#isInsert()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Insert();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Trigger#isUpdate <em>Update</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Update</em>'.
	 * @see rmm.Trigger#isUpdate()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Update();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Trigger#isDelete <em>Delete</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Delete</em>'.
	 * @see rmm.Trigger#isDelete()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Delete();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Trigger#getActionTime <em>Action Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Time</em>'.
	 * @see rmm.Trigger#getActionTime()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_ActionTime();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Trigger#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition</em>'.
	 * @see rmm.Trigger#getCondition()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_Condition();

	/**
	 * Returns the meta object for the attribute '{@link rmm.Trigger#getStatementSQL <em>Statement SQL</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement SQL</em>'.
	 * @see rmm.Trigger#getStatementSQL()
	 * @see #getTrigger()
	 * @generated
	 */
	EAttribute getTrigger_StatementSQL();

	/**
	 * Returns the meta object for the reference list '{@link rmm.Trigger#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Attributes</em>'.
	 * @see rmm.Trigger#getAttributes()
	 * @see #getTrigger()
	 * @generated
	 */
	EReference getTrigger_Attributes();

	/**
	 * Returns the meta object for enum '{@link rmm.ActionTimeType <em>Action Time Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Time Type</em>'.
	 * @see rmm.ActionTimeType
	 * @generated
	 */
	EEnum getActionTimeType();

	/**
	 * Returns the meta object for enum '{@link rmm.ActionGranularityType <em>Action Granularity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Action Granularity Type</em>'.
	 * @see rmm.ActionGranularityType
	 * @generated
	 */
	EEnum getActionGranularityType();

	/**
	 * Returns the meta object for enum '{@link rmm.BaseType <em>Base Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Base Type</em>'.
	 * @see rmm.BaseType
	 * @generated
	 */
	EEnum getBaseType();

	/**
	 * Returns the meta object for enum '{@link rmm.OperationRestrictionIntegrity <em>Operation Restriction Integrity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Operation Restriction Integrity</em>'.
	 * @see rmm.OperationRestrictionIntegrity
	 * @generated
	 */
	EEnum getOperationRestrictionIntegrity();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	RmmFactory getRmmFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link rmm.impl.SchemaImpl <em>Schema</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rmm.impl.SchemaImpl
		 * @see rmm.impl.RmmPackageImpl#getSchema()
		 * @generated
		 */
		EClass SCHEMA = eINSTANCE.getSchema();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SCHEMA__NAME = eINSTANCE.getSchema_Name();

		/**
		 * The meta object literal for the '<em><b>Table</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__TABLE = eINSTANCE.getSchema_Table();

		/**
		 * The meta object literal for the '<em><b>Assertion</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__ASSERTION = eINSTANCE.getSchema_Assertion();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__DOMAIN = eINSTANCE.getSchema_Domain();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SCHEMA__RELATIONSHIP = eINSTANCE.getSchema_Relationship();

		/**
		 * The meta object literal for the '{@link rmm.impl.TableImpl <em>Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rmm.impl.TableImpl
		 * @see rmm.impl.RmmPackageImpl#getTable()
		 * @generated
		 */
		EClass TABLE = eINSTANCE.getTable();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__NAME = eINSTANCE.getTable_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TABLE__DESCRIPTION = eINSTANCE.getTable_Description();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__ATTRIBUTES = eINSTANCE.getTable_Attributes();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TABLE__CONSTRAINTS = eINSTANCE.getTable_Constraints();

		/**
		 * The meta object literal for the '{@link rmm.impl.AssertionImpl <em>Assertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rmm.impl.AssertionImpl
		 * @see rmm.impl.RmmPackageImpl#getAssertion()
		 * @generated
		 */
		EClass ASSERTION = eINSTANCE.getAssertion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__NAME = eINSTANCE.getAssertion_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__DESCRIPTION = eINSTANCE.getAssertion_Description();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSERTION__CONDITION = eINSTANCE.getAssertion_Condition();

		/**
		 * The meta object literal for the '{@link rmm.impl.DomainImpl <em>Domain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rmm.impl.DomainImpl
		 * @see rmm.impl.RmmPackageImpl#getDomain()
		 * @generated
		 */
		EClass DOMAIN = eINSTANCE.getDomain();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__NAME = eINSTANCE.getDomain_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__DESCRIPTION = eINSTANCE.getDomain_Description();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__DEFAULT_VALUE = eINSTANCE.getDomain_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Is Not Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__IS_NOT_NULL = eINSTANCE.getDomain_IsNotNull();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOMAIN__DATA_TYPE = eINSTANCE.getDomain_DataType();

		/**
		 * The meta object literal for the '<em><b>Constraint Check Domain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOMAIN__CONSTRAINT_CHECK_DOMAIN = eINSTANCE.getDomain_ConstraintCheckDomain();

		/**
		 * The meta object literal for the '{@link rmm.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rmm.impl.AttributeImpl
		 * @see rmm.impl.RmmPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__NAME = eINSTANCE.getAttribute_Name();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DATA_TYPE = eINSTANCE.getAttribute_DataType();

		/**
		 * The meta object literal for the '<em><b>Size</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__SIZE = eINSTANCE.getAttribute_Size();

		/**
		 * The meta object literal for the '<em><b>Default Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DEFAULT_VALUE = eINSTANCE.getAttribute_DefaultValue();

		/**
		 * The meta object literal for the '<em><b>Is Not Null</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_NOT_NULL = eINSTANCE.getAttribute_IsNotNull();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__DESCRIPTION = eINSTANCE.getAttribute_Description();

		/**
		 * The meta object literal for the '<em><b>Domain</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ATTRIBUTE__DOMAIN = eINSTANCE.getAttribute_Domain();

		/**
		 * The meta object literal for the '{@link rmm.impl.RelationshipImpl <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rmm.impl.RelationshipImpl
		 * @see rmm.impl.RmmPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__NAME = eINSTANCE.getRelationship_Name();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__UPDATE = eINSTANCE.getRelationship_Update();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__DELETE = eINSTANCE.getRelationship_Delete();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '{@link rmm.impl.ConstraintImpl <em>Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rmm.impl.ConstraintImpl
		 * @see rmm.impl.RmmPackageImpl#getConstraint()
		 * @generated
		 */
		EClass CONSTRAINT = eINSTANCE.getConstraint();

		/**
		 * The meta object literal for the '<em><b>ID</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__ID = eINSTANCE.getConstraint_ID();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__NAME = eINSTANCE.getConstraint_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONSTRAINT__DESCRIPTION = eINSTANCE.getConstraint_Description();

		/**
		 * The meta object literal for the '{@link rmm.impl.PrimaryKeyImpl <em>Primary Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rmm.impl.PrimaryKeyImpl
		 * @see rmm.impl.RmmPackageImpl#getPrimaryKey()
		 * @generated
		 */
		EClass PRIMARY_KEY = eINSTANCE.getPrimaryKey();

		/**
		 * The meta object literal for the '<em><b>Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__RELATIONSHIP = eINSTANCE.getPrimaryKey_Relationship();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIMARY_KEY__ATTRIBUTES = eINSTANCE.getPrimaryKey_Attributes();

		/**
		 * The meta object literal for the '{@link rmm.impl.AlternateKeyImpl <em>Alternate Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rmm.impl.AlternateKeyImpl
		 * @see rmm.impl.RmmPackageImpl#getAlternateKey()
		 * @generated
		 */
		EClass ALTERNATE_KEY = eINSTANCE.getAlternateKey();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ALTERNATE_KEY__ATTRIBUTES = eINSTANCE.getAlternateKey_Attributes();

		/**
		 * The meta object literal for the '{@link rmm.impl.ForeignKeyImpl <em>Foreign Key</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rmm.impl.ForeignKeyImpl
		 * @see rmm.impl.RmmPackageImpl#getForeignKey()
		 * @generated
		 */
		EClass FOREIGN_KEY = eINSTANCE.getForeignKey();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FOREIGN_KEY__ATTRIBUTES = eINSTANCE.getForeignKey_Attributes();

		/**
		 * The meta object literal for the '{@link rmm.impl.CheckImpl <em>Check</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rmm.impl.CheckImpl
		 * @see rmm.impl.RmmPackageImpl#getCheck()
		 * @generated
		 */
		EClass CHECK = eINSTANCE.getCheck();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHECK__CONDITION = eINSTANCE.getCheck_Condition();

		/**
		 * The meta object literal for the '{@link rmm.impl.TriggerImpl <em>Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rmm.impl.TriggerImpl
		 * @see rmm.impl.RmmPackageImpl#getTrigger()
		 * @generated
		 */
		EClass TRIGGER = eINSTANCE.getTrigger();

		/**
		 * The meta object literal for the '<em><b>Action Granularity</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__ACTION_GRANULARITY = eINSTANCE.getTrigger_ActionGranularity();

		/**
		 * The meta object literal for the '<em><b>Old Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__OLD_ROW = eINSTANCE.getTrigger_OldRow();

		/**
		 * The meta object literal for the '<em><b>New Row</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__NEW_ROW = eINSTANCE.getTrigger_NewRow();

		/**
		 * The meta object literal for the '<em><b>Old Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__OLD_TABLE = eINSTANCE.getTrigger_OldTable();

		/**
		 * The meta object literal for the '<em><b>New Table</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__NEW_TABLE = eINSTANCE.getTrigger_NewTable();

		/**
		 * The meta object literal for the '<em><b>Insert</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__INSERT = eINSTANCE.getTrigger_Insert();

		/**
		 * The meta object literal for the '<em><b>Update</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__UPDATE = eINSTANCE.getTrigger_Update();

		/**
		 * The meta object literal for the '<em><b>Delete</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__DELETE = eINSTANCE.getTrigger_Delete();

		/**
		 * The meta object literal for the '<em><b>Action Time</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__ACTION_TIME = eINSTANCE.getTrigger_ActionTime();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__CONDITION = eINSTANCE.getTrigger_Condition();

		/**
		 * The meta object literal for the '<em><b>Statement SQL</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRIGGER__STATEMENT_SQL = eINSTANCE.getTrigger_StatementSQL();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRIGGER__ATTRIBUTES = eINSTANCE.getTrigger_Attributes();

		/**
		 * The meta object literal for the '{@link rmm.ActionTimeType <em>Action Time Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rmm.ActionTimeType
		 * @see rmm.impl.RmmPackageImpl#getActionTimeType()
		 * @generated
		 */
		EEnum ACTION_TIME_TYPE = eINSTANCE.getActionTimeType();

		/**
		 * The meta object literal for the '{@link rmm.ActionGranularityType <em>Action Granularity Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rmm.ActionGranularityType
		 * @see rmm.impl.RmmPackageImpl#getActionGranularityType()
		 * @generated
		 */
		EEnum ACTION_GRANULARITY_TYPE = eINSTANCE.getActionGranularityType();

		/**
		 * The meta object literal for the '{@link rmm.BaseType <em>Base Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rmm.BaseType
		 * @see rmm.impl.RmmPackageImpl#getBaseType()
		 * @generated
		 */
		EEnum BASE_TYPE = eINSTANCE.getBaseType();

		/**
		 * The meta object literal for the '{@link rmm.OperationRestrictionIntegrity <em>Operation Restriction Integrity</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see rmm.OperationRestrictionIntegrity
		 * @see rmm.impl.RmmPackageImpl#getOperationRestrictionIntegrity()
		 * @generated
		 */
		EEnum OPERATION_RESTRICTION_INTEGRITY = eINSTANCE.getOperationRestrictionIntegrity();

	}

} //RmmPackage

/**
 */
package kragstein;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see kragstein.KragsteinFactory
 * @model kind="package"
 * @generated
 */
public interface KragsteinPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "kragstein";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http:///kragstein.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "kragstein";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	KragsteinPackage eINSTANCE = kragstein.impl.KragsteinPackageImpl.init();

	/**
	 * The meta object id for the '{@link kragstein.impl.ProjectImpl <em>Project</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.ProjectImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getProject()
	 * @generated
	 */
	int PROJECT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Lang</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__LANG = 1;

	/**
	 * The feature id for the '<em><b>Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT__PACKAGE = 2;

	/**
	 * The number of structural features of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Project</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.PackageImpl <em>Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.PackageImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getPackage()
	 * @generated
	 */
	int PACKAGE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Class</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__CLASS = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE__PATH = 2;

	/**
	 * The number of structural features of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.Relationship <em>Relationship</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.Relationship
	 * @see kragstein.impl.KragsteinPackageImpl#getRelationship()
	 * @generated
	 */
	int RELATIONSHIP = 2;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__NAME = 2;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__LOWER_BOUND = 3;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__UPPER_BOUND = 4;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP__TARGET_CLASS = 5;

	/**
	 * The number of structural features of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Relationship</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RELATIONSHIP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.GeneralizationImpl <em>Generalization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.GeneralizationImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getGeneralization()
	 * @generated
	 */
	int GENERALIZATION = 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__LOWER_BOUND = RELATIONSHIP__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__UPPER_BOUND = RELATIONSHIP__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION__TARGET_CLASS = RELATIONSHIP__TARGET_CLASS;

	/**
	 * The number of structural features of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Generalization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GENERALIZATION_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.RealizationImpl <em>Realization</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.RealizationImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getRealization()
	 * @generated
	 */
	int REALIZATION = 4;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__LOWER_BOUND = RELATIONSHIP__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__UPPER_BOUND = RELATIONSHIP__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION__TARGET_CLASS = RELATIONSHIP__TARGET_CLASS;

	/**
	 * The number of structural features of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Realization</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REALIZATION_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.AssociationImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 5;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__LOWER_BOUND = RELATIONSHIP__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__UPPER_BOUND = RELATIONSHIP__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET_CLASS = RELATIONSHIP__TARGET_CLASS;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.AggregationImpl <em>Aggregation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.AggregationImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getAggregation()
	 * @generated
	 */
	int AGGREGATION = 6;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__LOWER_BOUND = RELATIONSHIP__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__UPPER_BOUND = RELATIONSHIP__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION__TARGET_CLASS = RELATIONSHIP__TARGET_CLASS;

	/**
	 * The number of structural features of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Aggregation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AGGREGATION_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.CompositionImpl <em>Composition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.CompositionImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getComposition()
	 * @generated
	 */
	int COMPOSITION = 7;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__LOWER_BOUND = RELATIONSHIP__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__UPPER_BOUND = RELATIONSHIP__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION__TARGET_CLASS = RELATIONSHIP__TARGET_CLASS;

	/**
	 * The number of structural features of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Composition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITION_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.DependencyImpl <em>Dependency</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.DependencyImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getDependency()
	 * @generated
	 */
	int DEPENDENCY = 8;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TARGET = RELATIONSHIP__TARGET;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__SOURCE = RELATIONSHIP__SOURCE;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__NAME = RELATIONSHIP__NAME;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__LOWER_BOUND = RELATIONSHIP__LOWER_BOUND;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__UPPER_BOUND = RELATIONSHIP__UPPER_BOUND;

	/**
	 * The feature id for the '<em><b>Target Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY__TARGET_CLASS = RELATIONSHIP__TARGET_CLASS;

	/**
	 * The number of structural features of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_FEATURE_COUNT = RELATIONSHIP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Dependency</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DEPENDENCY_OPERATION_COUNT = RELATIONSHIP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.CommentImpl <em>Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.CommentImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getComment()
	 * @generated
	 */
	int COMMENT = 9;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.ClassImpl <em>Class</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.ClassImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getClass_()
	 * @generated
	 */
	int CLASS = 10;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__ATTRIBUTE = 0;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__METHOD = 1;

	/**
	 * The feature id for the '<em><b>Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__COMMENT = 2;

	/**
	 * The feature id for the '<em><b>Target Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TARGET_RELATIONSHIP = 3;

	/**
	 * The feature id for the '<em><b>Source Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SOURCE_RELATIONSHIP = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__NAME = 5;

	/**
	 * The feature id for the '<em><b>Imported Package</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IMPORTED_PACKAGE = 6;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__TYPE = 7;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__VISIBILITY = 8;

	/**
	 * The feature id for the '<em><b>Is Singletone</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_SINGLETONE = 9;

	/**
	 * The feature id for the '<em><b>Is Interface</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__IS_INTERFACE = 10;

	/**
	 * The feature id for the '<em><b>Super Class</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPER_CLASS = 11;

	/**
	 * The feature id for the '<em><b>Supplier Element</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS__SUPPLIER_ELEMENT = 12;

	/**
	 * The number of structural features of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_FEATURE_COUNT = 13;

	/**
	 * The number of operations of the '<em>Class</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLASS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.ImportedPackageImpl <em>Imported Package</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.ImportedPackageImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getImportedPackage()
	 * @generated
	 */
	int IMPORTED_PACKAGE = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Is Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE__IS_INTERNAL = 1;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE__PATH = 2;

	/**
	 * The number of structural features of the '<em>Imported Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Imported Package</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IMPORTED_PACKAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.AttributeImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VISIBILITY = 2;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_CONST = 3;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__IS_STATIC = 4;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__VALUE = 5;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.MethodImpl <em>Method</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.MethodImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getMethod()
	 * @generated
	 */
	int METHOD = 13;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__PARAMETER = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__NAME = 1;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__TYPE = 2;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__VISIBILITY = 3;

	/**
	 * The feature id for the '<em><b>Is Const</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_CONST = 4;

	/**
	 * The feature id for the '<em><b>Is Virtual</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_VIRTUAL = 5;

	/**
	 * The feature id for the '<em><b>Is Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__IS_STATIC = 6;

	/**
	 * The feature id for the '<em><b>Header</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__HEADER = 7;

	/**
	 * The feature id for the '<em><b>Branch</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD__BRANCH = 8;

	/**
	 * The number of structural features of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_FEATURE_COUNT = 9;

	/**
	 * The number of operations of the '<em>Method</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int METHOD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.ParameterImpl <em>Parameter</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.ParameterImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getParameter()
	 * @generated
	 */
	int PARAMETER = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__NAME = 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__TYPE = 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER__VALUE = 2;

	/**
	 * The number of structural features of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Parameter</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PARAMETER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.HeaderImpl <em>Header</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.HeaderImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getHeader()
	 * @generated
	 */
	int HEADER = 15;

	/**
	 * The feature id for the '<em><b>Formal Parameters</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__FORMAL_PARAMETERS = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER__NAME = 1;

	/**
	 * The number of structural features of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Header</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.FormalParametersImpl <em>Formal Parameters</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.FormalParametersImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getFormalParameters()
	 * @generated
	 */
	int FORMAL_PARAMETERS = 16;

	/**
	 * The feature id for the '<em><b>Parameter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETERS__PARAMETER = 0;

	/**
	 * The number of structural features of the '<em>Formal Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETERS_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Formal Parameters</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FORMAL_PARAMETERS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.BranchImpl <em>Branch</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.BranchImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getBranch()
	 * @generated
	 */
	int BRANCH = 17;

	/**
	 * The feature id for the '<em><b>Source Branch Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__SOURCE_BRANCH_CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Target Branch Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__TARGET_BRANCH_CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__ROUTE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH__NAME = 3;

	/**
	 * The number of structural features of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Branch</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.BranchConnectionImpl <em>Branch Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.BranchConnectionImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getBranchConnection()
	 * @generated
	 */
	int BRANCH_CONNECTION = 18;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_CONNECTION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_CONNECTION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Target Branch</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_CONNECTION__TARGET_BRANCH = 2;

	/**
	 * The number of structural features of the '<em>Branch Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Branch Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BRANCH_CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.RouteImpl <em>Route</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.RouteImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getRoute()
	 * @generated
	 */
	int ROUTE = 19;

	/**
	 * The feature id for the '<em><b>Icon</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE__ICON = 0;

	/**
	 * The number of structural features of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Route</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ROUTE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.RightCommentImpl <em>Right Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.RightCommentImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getRightComment()
	 * @generated
	 */
	int RIGHT_COMMENT = 20;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_COMMENT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Right Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_COMMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Right Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RIGHT_COMMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.LeftCommentImpl <em>Left Comment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.LeftCommentImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getLeftComment()
	 * @generated
	 */
	int LEFT_COMMENT = 21;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_COMMENT__VALUE = 0;

	/**
	 * The number of structural features of the '<em>Left Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_COMMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Left Comment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LEFT_COMMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.ValencePointImpl <em>Valence Point</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.ValencePointImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getValencePoint()
	 * @generated
	 */
	int VALENCE_POINT = 22;

	/**
	 * The number of structural features of the '<em>Valence Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALENCE_POINT_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Valence Point</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VALENCE_POINT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.IconConnectionImpl <em>Icon Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.IconConnectionImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getIconConnection()
	 * @generated
	 */
	int ICON_CONNECTION = 23;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_CONNECTION__TARGET = 0;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_CONNECTION__SOURCE = 1;

	/**
	 * The feature id for the '<em><b>Target Icon</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_CONNECTION__TARGET_ICON = 2;

	/**
	 * The number of structural features of the '<em>Icon Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Icon Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.IconImpl <em>Icon</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.IconImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getIcon()
	 * @generated
	 */
	int ICON = 24;

	/**
	 * The feature id for the '<em><b>Source Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__SOURCE_ICON_CONNECTION = 0;

	/**
	 * The feature id for the '<em><b>Target Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__TARGET_ICON_CONNECTION = 1;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__VALENCE_POINT = 2;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__LEFT_COMMENT = 3;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON__RIGHT_COMMENT = 4;

	/**
	 * The number of structural features of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Icon</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ICON_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.ActionImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 25;

	/**
	 * The feature id for the '<em><b>Source Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__SOURCE_ICON_CONNECTION = ICON__SOURCE_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Target Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TARGET_ICON_CONNECTION = ICON__TARGET_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = ICON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = ICON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.QuestionImpl <em>Question</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.QuestionImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getQuestion()
	 * @generated
	 */
	int QUESTION = 26;

	/**
	 * The feature id for the '<em><b>Source Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__SOURCE_ICON_CONNECTION = ICON__SOURCE_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Target Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__TARGET_ICON_CONNECTION = ICON__TARGET_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__ROUTE = ICON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__VALUE = ICON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Yes Below</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION__YES_BELOW = ICON_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_FEATURE_COUNT = ICON_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Question</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int QUESTION_OPERATION_COUNT = ICON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.ChoiceImpl <em>Choice</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.ChoiceImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getChoice()
	 * @generated
	 */
	int CHOICE = 27;

	/**
	 * The feature id for the '<em><b>Source Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__SOURCE_ICON_CONNECTION = ICON__SOURCE_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Target Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__TARGET_ICON_CONNECTION = ICON__TARGET_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Choice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE__CHOICE = ICON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_FEATURE_COUNT = ICON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Choice</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHOICE_OPERATION_COUNT = ICON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.CaseImpl <em>Case</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.CaseImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getCase()
	 * @generated
	 */
	int CASE = 28;

	/**
	 * The feature id for the '<em><b>Source Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__SOURCE_ICON_CONNECTION = ICON__SOURCE_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Target Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__TARGET_ICON_CONNECTION = ICON__TARGET_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Route</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__ROUTE = ICON_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source Case Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__SOURCE_CASE_CONNECTION = ICON_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target Case Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE__TARGET_CASE_CONNECTION = ICON_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_FEATURE_COUNT = ICON_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Case</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_OPERATION_COUNT = ICON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.CaseConnectionImpl <em>Case Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.CaseConnectionImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getCaseConnection()
	 * @generated
	 */
	int CASE_CONNECTION = 29;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONNECTION__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONNECTION__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Target Case</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONNECTION__TARGET_CASE = 2;

	/**
	 * The number of structural features of the '<em>Case Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONNECTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Case Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CASE_CONNECTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.HeadlineImpl <em>Headline</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.HeadlineImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getHeadline()
	 * @generated
	 */
	int HEADLINE = 30;

	/**
	 * The feature id for the '<em><b>Source Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADLINE__SOURCE_ICON_CONNECTION = ICON__SOURCE_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Target Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADLINE__TARGET_ICON_CONNECTION = ICON__TARGET_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADLINE__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADLINE__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADLINE__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADLINE__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADLINE__IS_LOOP = ICON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Headline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADLINE_FEATURE_COUNT = ICON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Headline</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HEADLINE_OPERATION_COUNT = ICON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.AdressImpl <em>Adress</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.AdressImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getAdress()
	 * @generated
	 */
	int ADRESS = 31;

	/**
	 * The feature id for the '<em><b>Source Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS__SOURCE_ICON_CONNECTION = ICON__SOURCE_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Target Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS__TARGET_ICON_CONNECTION = ICON__TARGET_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Loop</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS__IS_LOOP = ICON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Adress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS_FEATURE_COUNT = ICON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Adress</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADRESS_OPERATION_COUNT = ICON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.InsertionImpl <em>Insertion</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.InsertionImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getInsertion()
	 * @generated
	 */
	int INSERTION = 32;

	/**
	 * The feature id for the '<em><b>Source Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__SOURCE_ICON_CONNECTION = ICON__SOURCE_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Target Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__TARGET_ICON_CONNECTION = ICON__TARGET_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION__METHOD = ICON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_FEATURE_COUNT = ICON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Insertion</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSERTION_OPERATION_COUNT = ICON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.ShelfImpl <em>Shelf</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.ShelfImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getShelf()
	 * @generated
	 */
	int SHELF = 33;

	/**
	 * The feature id for the '<em><b>Source Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__SOURCE_ICON_CONNECTION = ICON__SOURCE_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Target Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__TARGET_ICON_CONNECTION = ICON__TARGET_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF__METHOD = ICON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Shelf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF_FEATURE_COUNT = ICON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Shelf</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SHELF_OPERATION_COUNT = ICON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.BeginLoopImpl <em>Begin Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.BeginLoopImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getBeginLoop()
	 * @generated
	 */
	int BEGIN_LOOP = 34;

	/**
	 * The feature id for the '<em><b>Source Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_LOOP__SOURCE_ICON_CONNECTION = ICON__SOURCE_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Target Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_LOOP__TARGET_ICON_CONNECTION = ICON__TARGET_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_LOOP__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_LOOP__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_LOOP__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_LOOP__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_LOOP__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Begin Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_LOOP_FEATURE_COUNT = ICON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Begin Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEGIN_LOOP_OPERATION_COUNT = ICON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.EndLoopImpl <em>End Loop</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.EndLoopImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getEndLoop()
	 * @generated
	 */
	int END_LOOP = 35;

	/**
	 * The feature id for the '<em><b>Source Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP__SOURCE_ICON_CONNECTION = ICON__SOURCE_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Target Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP__TARGET_ICON_CONNECTION = ICON__TARGET_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>End Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP_FEATURE_COUNT = ICON_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>End Loop</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_LOOP_OPERATION_COUNT = ICON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.OutputImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 36;

	/**
	 * The feature id for the '<em><b>Source Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__SOURCE_ICON_CONNECTION = ICON__SOURCE_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Target Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__TARGET_ICON_CONNECTION = ICON__TARGET_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__METHOD = ICON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = ICON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = ICON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.InputImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 37;

	/**
	 * The feature id for the '<em><b>Source Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__SOURCE_ICON_CONNECTION = ICON__SOURCE_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Target Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__TARGET_ICON_CONNECTION = ICON__TARGET_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__VALUE = ICON_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Method</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__METHOD = ICON_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = ICON_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = ICON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.LoopArrowImpl <em>Loop Arrow</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.LoopArrowImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getLoopArrow()
	 * @generated
	 */
	int LOOP_ARROW = 38;

	/**
	 * The feature id for the '<em><b>Source Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ARROW__SOURCE_ICON_CONNECTION = ICON__SOURCE_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Target Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ARROW__TARGET_ICON_CONNECTION = ICON__TARGET_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ARROW__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ARROW__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ARROW__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ARROW__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Loop Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ARROW_FEATURE_COUNT = ICON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Loop Arrow</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOOP_ARROW_OPERATION_COUNT = ICON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.EmptyConnectorImpl <em>Empty Connector</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.EmptyConnectorImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getEmptyConnector()
	 * @generated
	 */
	int EMPTY_CONNECTOR = 39;

	/**
	 * The feature id for the '<em><b>Source Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_CONNECTOR__SOURCE_ICON_CONNECTION = ICON__SOURCE_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Target Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_CONNECTOR__TARGET_ICON_CONNECTION = ICON__TARGET_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_CONNECTOR__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_CONNECTOR__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_CONNECTOR__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_CONNECTOR__NAME = ICON_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Empty Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_CONNECTOR_FEATURE_COUNT = ICON_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Empty Connector</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMPTY_CONNECTOR_OPERATION_COUNT = ICON_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link kragstein.impl.EndImpl <em>End</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see kragstein.impl.EndImpl
	 * @see kragstein.impl.KragsteinPackageImpl#getEnd()
	 * @generated
	 */
	int END = 40;

	/**
	 * The feature id for the '<em><b>Source Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__SOURCE_ICON_CONNECTION = ICON__SOURCE_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Target Icon Connection</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__TARGET_ICON_CONNECTION = ICON__TARGET_ICON_CONNECTION;

	/**
	 * The feature id for the '<em><b>Valence Point</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__VALENCE_POINT = ICON__VALENCE_POINT;

	/**
	 * The feature id for the '<em><b>Left Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__LEFT_COMMENT = ICON__LEFT_COMMENT;

	/**
	 * The feature id for the '<em><b>Right Comment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END__RIGHT_COMMENT = ICON__RIGHT_COMMENT;

	/**
	 * The number of structural features of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_FEATURE_COUNT = ICON_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>End</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int END_OPERATION_COUNT = ICON_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link kragstein.Project <em>Project</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project</em>'.
	 * @see kragstein.Project
	 * @generated
	 */
	EClass getProject();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Project#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Project#getName()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Name();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Project#getLang <em>Lang</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lang</em>'.
	 * @see kragstein.Project#getLang()
	 * @see #getProject()
	 * @generated
	 */
	EAttribute getProject_Lang();

	/**
	 * Returns the meta object for the containment reference list '{@link kragstein.Project#getPackage <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Package</em>'.
	 * @see kragstein.Project#getPackage()
	 * @see #getProject()
	 * @generated
	 */
	EReference getProject_Package();

	/**
	 * Returns the meta object for class '{@link kragstein.Package <em>Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Package</em>'.
	 * @see kragstein.Package
	 * @generated
	 */
	EClass getPackage();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Package#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Package#getName()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link kragstein.Package#getClass_ <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Class</em>'.
	 * @see kragstein.Package#getClass_()
	 * @see #getPackage()
	 * @generated
	 */
	EReference getPackage_Class();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Package#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see kragstein.Package#getPath()
	 * @see #getPackage()
	 * @generated
	 */
	EAttribute getPackage_Path();

	/**
	 * Returns the meta object for class '{@link kragstein.Relationship <em>Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Relationship</em>'.
	 * @see kragstein.Relationship
	 * @generated
	 */
	EClass getRelationship();

	/**
	 * Returns the meta object for the reference '{@link kragstein.Relationship#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see kragstein.Relationship#getTarget()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Target();

	/**
	 * Returns the meta object for the reference '{@link kragstein.Relationship#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see kragstein.Relationship#getSource()
	 * @see #getRelationship()
	 * @generated
	 */
	EReference getRelationship_Source();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Relationship#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Relationship#getName()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_Name();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Relationship#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see kragstein.Relationship#getLowerBound()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_LowerBound();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Relationship#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see kragstein.Relationship#getUpperBound()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Relationship#getTargetClass <em>Target Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Class</em>'.
	 * @see kragstein.Relationship#getTargetClass()
	 * @see #getRelationship()
	 * @generated
	 */
	EAttribute getRelationship_TargetClass();

	/**
	 * Returns the meta object for class '{@link kragstein.Generalization <em>Generalization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Generalization</em>'.
	 * @see kragstein.Generalization
	 * @generated
	 */
	EClass getGeneralization();

	/**
	 * Returns the meta object for class '{@link kragstein.Realization <em>Realization</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Realization</em>'.
	 * @see kragstein.Realization
	 * @generated
	 */
	EClass getRealization();

	/**
	 * Returns the meta object for class '{@link kragstein.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see kragstein.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for class '{@link kragstein.Aggregation <em>Aggregation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Aggregation</em>'.
	 * @see kragstein.Aggregation
	 * @generated
	 */
	EClass getAggregation();

	/**
	 * Returns the meta object for class '{@link kragstein.Composition <em>Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composition</em>'.
	 * @see kragstein.Composition
	 * @generated
	 */
	EClass getComposition();

	/**
	 * Returns the meta object for class '{@link kragstein.Dependency <em>Dependency</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Dependency</em>'.
	 * @see kragstein.Dependency
	 * @generated
	 */
	EClass getDependency();

	/**
	 * Returns the meta object for class '{@link kragstein.Comment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Comment</em>'.
	 * @see kragstein.Comment
	 * @generated
	 */
	EClass getComment();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Comment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kragstein.Comment#getValue()
	 * @see #getComment()
	 * @generated
	 */
	EAttribute getComment_Value();

	/**
	 * Returns the meta object for class '{@link kragstein.Class <em>Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Class</em>'.
	 * @see kragstein.Class
	 * @generated
	 */
	EClass getClass_();

	/**
	 * Returns the meta object for the containment reference list '{@link kragstein.Class#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see kragstein.Class#getAttribute()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link kragstein.Class#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Method</em>'.
	 * @see kragstein.Class#getMethod()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Method();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Class#getComment <em>Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Comment</em>'.
	 * @see kragstein.Class#getComment()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_Comment();

	/**
	 * Returns the meta object for the containment reference list '{@link kragstein.Class#getTargetRelationship <em>Target Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Target Relationship</em>'.
	 * @see kragstein.Class#getTargetRelationship()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_TargetRelationship();

	/**
	 * Returns the meta object for the containment reference list '{@link kragstein.Class#getSourceRelationship <em>Source Relationship</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Source Relationship</em>'.
	 * @see kragstein.Class#getSourceRelationship()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_SourceRelationship();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Class#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Class#getName()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link kragstein.Class#getImportedPackage <em>Imported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Imported Package</em>'.
	 * @see kragstein.Class#getImportedPackage()
	 * @see #getClass_()
	 * @generated
	 */
	EReference getClass_ImportedPackage();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Class#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kragstein.Class#getType()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Type();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Class#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see kragstein.Class#getVisibility()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Class#isIsSingletone <em>Is Singletone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Singletone</em>'.
	 * @see kragstein.Class#isIsSingletone()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsSingletone();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Class#isIsInterface <em>Is Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Interface</em>'.
	 * @see kragstein.Class#isIsInterface()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_IsInterface();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Class#getSuperClass <em>Super Class</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Super Class</em>'.
	 * @see kragstein.Class#getSuperClass()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_SuperClass();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Class#getSupplierElement <em>Supplier Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Supplier Element</em>'.
	 * @see kragstein.Class#getSupplierElement()
	 * @see #getClass_()
	 * @generated
	 */
	EAttribute getClass_SupplierElement();

	/**
	 * Returns the meta object for class '{@link kragstein.ImportedPackage <em>Imported Package</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Imported Package</em>'.
	 * @see kragstein.ImportedPackage
	 * @generated
	 */
	EClass getImportedPackage();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.ImportedPackage#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.ImportedPackage#getName()
	 * @see #getImportedPackage()
	 * @generated
	 */
	EAttribute getImportedPackage_Name();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.ImportedPackage#isIsInternal <em>Is Internal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Internal</em>'.
	 * @see kragstein.ImportedPackage#isIsInternal()
	 * @see #getImportedPackage()
	 * @generated
	 */
	EAttribute getImportedPackage_IsInternal();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.ImportedPackage#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see kragstein.ImportedPackage#getPath()
	 * @see #getImportedPackage()
	 * @generated
	 */
	EAttribute getImportedPackage_Path();

	/**
	 * Returns the meta object for class '{@link kragstein.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see kragstein.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Attribute#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Attribute#getName()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Name();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Attribute#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kragstein.Attribute#getType()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Type();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Attribute#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see kragstein.Attribute#getVisibility()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Attribute#isIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see kragstein.Attribute#isIsConst()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsConst();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Attribute#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see kragstein.Attribute#isIsStatic()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_IsStatic();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Attribute#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kragstein.Attribute#getValue()
	 * @see #getAttribute()
	 * @generated
	 */
	EAttribute getAttribute_Value();

	/**
	 * Returns the meta object for class '{@link kragstein.Method <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Method</em>'.
	 * @see kragstein.Method
	 * @generated
	 */
	EClass getMethod();

	/**
	 * Returns the meta object for the containment reference list '{@link kragstein.Method#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see kragstein.Method#getParameter()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Parameter();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Method#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Method#getName()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Name();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Method#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kragstein.Method#getType()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Type();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Method#getVisibility <em>Visibility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Visibility</em>'.
	 * @see kragstein.Method#getVisibility()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_Visibility();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Method#isIsConst <em>Is Const</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Const</em>'.
	 * @see kragstein.Method#isIsConst()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsConst();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Method#isIsVirtual <em>Is Virtual</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Virtual</em>'.
	 * @see kragstein.Method#isIsVirtual()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsVirtual();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Method#isIsStatic <em>Is Static</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Static</em>'.
	 * @see kragstein.Method#isIsStatic()
	 * @see #getMethod()
	 * @generated
	 */
	EAttribute getMethod_IsStatic();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Method#getHeader <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header</em>'.
	 * @see kragstein.Method#getHeader()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Header();

	/**
	 * Returns the meta object for the containment reference list '{@link kragstein.Method#getBranch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Branch</em>'.
	 * @see kragstein.Method#getBranch()
	 * @see #getMethod()
	 * @generated
	 */
	EReference getMethod_Branch();

	/**
	 * Returns the meta object for class '{@link kragstein.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Parameter</em>'.
	 * @see kragstein.Parameter
	 * @generated
	 */
	EClass getParameter();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Parameter#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Parameter#getName()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Name();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Parameter#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see kragstein.Parameter#getType()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Type();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Parameter#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kragstein.Parameter#getValue()
	 * @see #getParameter()
	 * @generated
	 */
	EAttribute getParameter_Value();

	/**
	 * Returns the meta object for class '{@link kragstein.Header <em>Header</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Header</em>'.
	 * @see kragstein.Header
	 * @generated
	 */
	EClass getHeader();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Header#getFormalParameters <em>Formal Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Formal Parameters</em>'.
	 * @see kragstein.Header#getFormalParameters()
	 * @see #getHeader()
	 * @generated
	 */
	EReference getHeader_FormalParameters();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Header#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Header#getName()
	 * @see #getHeader()
	 * @generated
	 */
	EAttribute getHeader_Name();

	/**
	 * Returns the meta object for class '{@link kragstein.FormalParameters <em>Formal Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Formal Parameters</em>'.
	 * @see kragstein.FormalParameters
	 * @generated
	 */
	EClass getFormalParameters();

	/**
	 * Returns the meta object for the containment reference list '{@link kragstein.FormalParameters#getParameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Parameter</em>'.
	 * @see kragstein.FormalParameters#getParameter()
	 * @see #getFormalParameters()
	 * @generated
	 */
	EReference getFormalParameters_Parameter();

	/**
	 * Returns the meta object for class '{@link kragstein.Branch <em>Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch</em>'.
	 * @see kragstein.Branch
	 * @generated
	 */
	EClass getBranch();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Branch#getSourceBranchConnection <em>Source Branch Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Branch Connection</em>'.
	 * @see kragstein.Branch#getSourceBranchConnection()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_SourceBranchConnection();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Branch#getTargetBranchConnection <em>Target Branch Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Branch Connection</em>'.
	 * @see kragstein.Branch#getTargetBranchConnection()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_TargetBranchConnection();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Branch#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route</em>'.
	 * @see kragstein.Branch#getRoute()
	 * @see #getBranch()
	 * @generated
	 */
	EReference getBranch_Route();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Branch#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Branch#getName()
	 * @see #getBranch()
	 * @generated
	 */
	EAttribute getBranch_Name();

	/**
	 * Returns the meta object for class '{@link kragstein.BranchConnection <em>Branch Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Branch Connection</em>'.
	 * @see kragstein.BranchConnection
	 * @generated
	 */
	EClass getBranchConnection();

	/**
	 * Returns the meta object for the reference '{@link kragstein.BranchConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see kragstein.BranchConnection#getSource()
	 * @see #getBranchConnection()
	 * @generated
	 */
	EReference getBranchConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link kragstein.BranchConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see kragstein.BranchConnection#getTarget()
	 * @see #getBranchConnection()
	 * @generated
	 */
	EReference getBranchConnection_Target();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.BranchConnection#getTargetBranch <em>Target Branch</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Branch</em>'.
	 * @see kragstein.BranchConnection#getTargetBranch()
	 * @see #getBranchConnection()
	 * @generated
	 */
	EAttribute getBranchConnection_TargetBranch();

	/**
	 * Returns the meta object for class '{@link kragstein.Route <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Route</em>'.
	 * @see kragstein.Route
	 * @generated
	 */
	EClass getRoute();

	/**
	 * Returns the meta object for the containment reference list '{@link kragstein.Route#getIcon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Icon</em>'.
	 * @see kragstein.Route#getIcon()
	 * @see #getRoute()
	 * @generated
	 */
	EReference getRoute_Icon();

	/**
	 * Returns the meta object for class '{@link kragstein.RightComment <em>Right Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Right Comment</em>'.
	 * @see kragstein.RightComment
	 * @generated
	 */
	EClass getRightComment();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.RightComment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kragstein.RightComment#getValue()
	 * @see #getRightComment()
	 * @generated
	 */
	EAttribute getRightComment_Value();

	/**
	 * Returns the meta object for class '{@link kragstein.LeftComment <em>Left Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Left Comment</em>'.
	 * @see kragstein.LeftComment
	 * @generated
	 */
	EClass getLeftComment();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.LeftComment#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kragstein.LeftComment#getValue()
	 * @see #getLeftComment()
	 * @generated
	 */
	EAttribute getLeftComment_Value();

	/**
	 * Returns the meta object for class '{@link kragstein.ValencePoint <em>Valence Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Valence Point</em>'.
	 * @see kragstein.ValencePoint
	 * @generated
	 */
	EClass getValencePoint();

	/**
	 * Returns the meta object for class '{@link kragstein.IconConnection <em>Icon Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon Connection</em>'.
	 * @see kragstein.IconConnection
	 * @generated
	 */
	EClass getIconConnection();

	/**
	 * Returns the meta object for the reference '{@link kragstein.IconConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see kragstein.IconConnection#getTarget()
	 * @see #getIconConnection()
	 * @generated
	 */
	EReference getIconConnection_Target();

	/**
	 * Returns the meta object for the reference '{@link kragstein.IconConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see kragstein.IconConnection#getSource()
	 * @see #getIconConnection()
	 * @generated
	 */
	EReference getIconConnection_Source();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.IconConnection#getTargetIcon <em>Target Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Icon</em>'.
	 * @see kragstein.IconConnection#getTargetIcon()
	 * @see #getIconConnection()
	 * @generated
	 */
	EAttribute getIconConnection_TargetIcon();

	/**
	 * Returns the meta object for class '{@link kragstein.Icon <em>Icon</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Icon</em>'.
	 * @see kragstein.Icon
	 * @generated
	 */
	EClass getIcon();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Icon#getSourceIconConnection <em>Source Icon Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Icon Connection</em>'.
	 * @see kragstein.Icon#getSourceIconConnection()
	 * @see #getIcon()
	 * @generated
	 */
	EReference getIcon_SourceIconConnection();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Icon#getTargetIconConnection <em>Target Icon Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Icon Connection</em>'.
	 * @see kragstein.Icon#getTargetIconConnection()
	 * @see #getIcon()
	 * @generated
	 */
	EReference getIcon_TargetIconConnection();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Icon#getValencePoint <em>Valence Point</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Valence Point</em>'.
	 * @see kragstein.Icon#getValencePoint()
	 * @see #getIcon()
	 * @generated
	 */
	EReference getIcon_ValencePoint();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Icon#getLeftComment <em>Left Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Left Comment</em>'.
	 * @see kragstein.Icon#getLeftComment()
	 * @see #getIcon()
	 * @generated
	 */
	EReference getIcon_LeftComment();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Icon#getRightComment <em>Right Comment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Right Comment</em>'.
	 * @see kragstein.Icon#getRightComment()
	 * @see #getIcon()
	 * @generated
	 */
	EReference getIcon_RightComment();

	/**
	 * Returns the meta object for class '{@link kragstein.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see kragstein.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Action#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Action#getName()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Name();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Action#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kragstein.Action#getValue()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Value();

	/**
	 * Returns the meta object for class '{@link kragstein.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Question</em>'.
	 * @see kragstein.Question
	 * @generated
	 */
	EClass getQuestion();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Question#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Question#getName()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Name();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Question#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route</em>'.
	 * @see kragstein.Question#getRoute()
	 * @see #getQuestion()
	 * @generated
	 */
	EReference getQuestion_Route();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Question#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kragstein.Question#getValue()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_Value();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Question#isYesBelow <em>Yes Below</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Yes Below</em>'.
	 * @see kragstein.Question#isYesBelow()
	 * @see #getQuestion()
	 * @generated
	 */
	EAttribute getQuestion_YesBelow();

	/**
	 * Returns the meta object for class '{@link kragstein.Choice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Choice</em>'.
	 * @see kragstein.Choice
	 * @generated
	 */
	EClass getChoice();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Choice#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Choice#getName()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Name();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Choice#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kragstein.Choice#getValue()
	 * @see #getChoice()
	 * @generated
	 */
	EAttribute getChoice_Value();

	/**
	 * Returns the meta object for the containment reference list '{@link kragstein.Choice#getChoice <em>Choice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Choice</em>'.
	 * @see kragstein.Choice#getChoice()
	 * @see #getChoice()
	 * @generated
	 */
	EReference getChoice_Choice();

	/**
	 * Returns the meta object for class '{@link kragstein.Case <em>Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case</em>'.
	 * @see kragstein.Case
	 * @generated
	 */
	EClass getCase();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Case#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Case#getName()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_Name();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Case#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kragstein.Case#getValue()
	 * @see #getCase()
	 * @generated
	 */
	EAttribute getCase_Value();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Case#getRoute <em>Route</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Route</em>'.
	 * @see kragstein.Case#getRoute()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_Route();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Case#getSourceCaseConnection <em>Source Case Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source Case Connection</em>'.
	 * @see kragstein.Case#getSourceCaseConnection()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_SourceCaseConnection();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Case#getTargetCaseConnection <em>Target Case Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Target Case Connection</em>'.
	 * @see kragstein.Case#getTargetCaseConnection()
	 * @see #getCase()
	 * @generated
	 */
	EReference getCase_TargetCaseConnection();

	/**
	 * Returns the meta object for class '{@link kragstein.CaseConnection <em>Case Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Case Connection</em>'.
	 * @see kragstein.CaseConnection
	 * @generated
	 */
	EClass getCaseConnection();

	/**
	 * Returns the meta object for the reference '{@link kragstein.CaseConnection#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see kragstein.CaseConnection#getSource()
	 * @see #getCaseConnection()
	 * @generated
	 */
	EReference getCaseConnection_Source();

	/**
	 * Returns the meta object for the reference '{@link kragstein.CaseConnection#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see kragstein.CaseConnection#getTarget()
	 * @see #getCaseConnection()
	 * @generated
	 */
	EReference getCaseConnection_Target();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.CaseConnection#getTargetCase <em>Target Case</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Target Case</em>'.
	 * @see kragstein.CaseConnection#getTargetCase()
	 * @see #getCaseConnection()
	 * @generated
	 */
	EAttribute getCaseConnection_TargetCase();

	/**
	 * Returns the meta object for class '{@link kragstein.Headline <em>Headline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Headline</em>'.
	 * @see kragstein.Headline
	 * @generated
	 */
	EClass getHeadline();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Headline#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Headline#getName()
	 * @see #getHeadline()
	 * @generated
	 */
	EAttribute getHeadline_Name();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Headline#isIsLoop <em>Is Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Loop</em>'.
	 * @see kragstein.Headline#isIsLoop()
	 * @see #getHeadline()
	 * @generated
	 */
	EAttribute getHeadline_IsLoop();

	/**
	 * Returns the meta object for class '{@link kragstein.Adress <em>Adress</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Adress</em>'.
	 * @see kragstein.Adress
	 * @generated
	 */
	EClass getAdress();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Adress#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Adress#getName()
	 * @see #getAdress()
	 * @generated
	 */
	EAttribute getAdress_Name();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Adress#isIsLoop <em>Is Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Loop</em>'.
	 * @see kragstein.Adress#isIsLoop()
	 * @see #getAdress()
	 * @generated
	 */
	EAttribute getAdress_IsLoop();

	/**
	 * Returns the meta object for class '{@link kragstein.Insertion <em>Insertion</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insertion</em>'.
	 * @see kragstein.Insertion
	 * @generated
	 */
	EClass getInsertion();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Insertion#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Insertion#getName()
	 * @see #getInsertion()
	 * @generated
	 */
	EAttribute getInsertion_Name();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Insertion#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kragstein.Insertion#getValue()
	 * @see #getInsertion()
	 * @generated
	 */
	EAttribute getInsertion_Value();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Insertion#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see kragstein.Insertion#getMethod()
	 * @see #getInsertion()
	 * @generated
	 */
	EReference getInsertion_Method();

	/**
	 * Returns the meta object for class '{@link kragstein.Shelf <em>Shelf</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Shelf</em>'.
	 * @see kragstein.Shelf
	 * @generated
	 */
	EClass getShelf();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Shelf#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Shelf#getName()
	 * @see #getShelf()
	 * @generated
	 */
	EAttribute getShelf_Name();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Shelf#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kragstein.Shelf#getValue()
	 * @see #getShelf()
	 * @generated
	 */
	EAttribute getShelf_Value();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Shelf#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see kragstein.Shelf#getMethod()
	 * @see #getShelf()
	 * @generated
	 */
	EReference getShelf_Method();

	/**
	 * Returns the meta object for class '{@link kragstein.BeginLoop <em>Begin Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Begin Loop</em>'.
	 * @see kragstein.BeginLoop
	 * @generated
	 */
	EClass getBeginLoop();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.BeginLoop#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.BeginLoop#getName()
	 * @see #getBeginLoop()
	 * @generated
	 */
	EAttribute getBeginLoop_Name();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.BeginLoop#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kragstein.BeginLoop#getValue()
	 * @see #getBeginLoop()
	 * @generated
	 */
	EAttribute getBeginLoop_Value();

	/**
	 * Returns the meta object for class '{@link kragstein.EndLoop <em>End Loop</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End Loop</em>'.
	 * @see kragstein.EndLoop
	 * @generated
	 */
	EClass getEndLoop();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.EndLoop#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.EndLoop#getName()
	 * @see #getEndLoop()
	 * @generated
	 */
	EAttribute getEndLoop_Name();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.EndLoop#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kragstein.EndLoop#getValue()
	 * @see #getEndLoop()
	 * @generated
	 */
	EAttribute getEndLoop_Value();

	/**
	 * Returns the meta object for class '{@link kragstein.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see kragstein.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Output#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Output#getName()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Name();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Output#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kragstein.Output#getValue()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Value();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Output#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see kragstein.Output#getMethod()
	 * @see #getOutput()
	 * @generated
	 */
	EReference getOutput_Method();

	/**
	 * Returns the meta object for class '{@link kragstein.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see kragstein.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Input#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.Input#getName()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Name();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.Input#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see kragstein.Input#getValue()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Value();

	/**
	 * Returns the meta object for the containment reference '{@link kragstein.Input#getMethod <em>Method</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Method</em>'.
	 * @see kragstein.Input#getMethod()
	 * @see #getInput()
	 * @generated
	 */
	EReference getInput_Method();

	/**
	 * Returns the meta object for class '{@link kragstein.LoopArrow <em>Loop Arrow</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Loop Arrow</em>'.
	 * @see kragstein.LoopArrow
	 * @generated
	 */
	EClass getLoopArrow();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.LoopArrow#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.LoopArrow#getName()
	 * @see #getLoopArrow()
	 * @generated
	 */
	EAttribute getLoopArrow_Name();

	/**
	 * Returns the meta object for class '{@link kragstein.EmptyConnector <em>Empty Connector</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Empty Connector</em>'.
	 * @see kragstein.EmptyConnector
	 * @generated
	 */
	EClass getEmptyConnector();

	/**
	 * Returns the meta object for the attribute '{@link kragstein.EmptyConnector#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see kragstein.EmptyConnector#getName()
	 * @see #getEmptyConnector()
	 * @generated
	 */
	EAttribute getEmptyConnector_Name();

	/**
	 * Returns the meta object for class '{@link kragstein.End <em>End</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>End</em>'.
	 * @see kragstein.End
	 * @generated
	 */
	EClass getEnd();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	KragsteinFactory getKragsteinFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link kragstein.impl.ProjectImpl <em>Project</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.ProjectImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getProject()
		 * @generated
		 */
		EClass PROJECT = eINSTANCE.getProject();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__NAME = eINSTANCE.getProject_Name();

		/**
		 * The meta object literal for the '<em><b>Lang</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PROJECT__LANG = eINSTANCE.getProject_Lang();

		/**
		 * The meta object literal for the '<em><b>Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PROJECT__PACKAGE = eINSTANCE.getProject_Package();

		/**
		 * The meta object literal for the '{@link kragstein.impl.PackageImpl <em>Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.PackageImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getPackage()
		 * @generated
		 */
		EClass PACKAGE = eINSTANCE.getPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__NAME = eINSTANCE.getPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Class</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PACKAGE__CLASS = eINSTANCE.getPackage_Class();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PACKAGE__PATH = eINSTANCE.getPackage_Path();

		/**
		 * The meta object literal for the '{@link kragstein.Relationship <em>Relationship</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.Relationship
		 * @see kragstein.impl.KragsteinPackageImpl#getRelationship()
		 * @generated
		 */
		EClass RELATIONSHIP = eINSTANCE.getRelationship();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__TARGET = eINSTANCE.getRelationship_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RELATIONSHIP__SOURCE = eINSTANCE.getRelationship_Source();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__NAME = eINSTANCE.getRelationship_Name();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__LOWER_BOUND = eINSTANCE.getRelationship_LowerBound();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__UPPER_BOUND = eINSTANCE.getRelationship_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Target Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RELATIONSHIP__TARGET_CLASS = eINSTANCE.getRelationship_TargetClass();

		/**
		 * The meta object literal for the '{@link kragstein.impl.GeneralizationImpl <em>Generalization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.GeneralizationImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getGeneralization()
		 * @generated
		 */
		EClass GENERALIZATION = eINSTANCE.getGeneralization();

		/**
		 * The meta object literal for the '{@link kragstein.impl.RealizationImpl <em>Realization</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.RealizationImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getRealization()
		 * @generated
		 */
		EClass REALIZATION = eINSTANCE.getRealization();

		/**
		 * The meta object literal for the '{@link kragstein.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.AssociationImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '{@link kragstein.impl.AggregationImpl <em>Aggregation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.AggregationImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getAggregation()
		 * @generated
		 */
		EClass AGGREGATION = eINSTANCE.getAggregation();

		/**
		 * The meta object literal for the '{@link kragstein.impl.CompositionImpl <em>Composition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.CompositionImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getComposition()
		 * @generated
		 */
		EClass COMPOSITION = eINSTANCE.getComposition();

		/**
		 * The meta object literal for the '{@link kragstein.impl.DependencyImpl <em>Dependency</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.DependencyImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getDependency()
		 * @generated
		 */
		EClass DEPENDENCY = eINSTANCE.getDependency();

		/**
		 * The meta object literal for the '{@link kragstein.impl.CommentImpl <em>Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.CommentImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getComment()
		 * @generated
		 */
		EClass COMMENT = eINSTANCE.getComment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMENT__VALUE = eINSTANCE.getComment_Value();

		/**
		 * The meta object literal for the '{@link kragstein.impl.ClassImpl <em>Class</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.ClassImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getClass_()
		 * @generated
		 */
		EClass CLASS = eINSTANCE.getClass_();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__ATTRIBUTE = eINSTANCE.getClass_Attribute();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__METHOD = eINSTANCE.getClass_Method();

		/**
		 * The meta object literal for the '<em><b>Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__COMMENT = eINSTANCE.getClass_Comment();

		/**
		 * The meta object literal for the '<em><b>Target Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__TARGET_RELATIONSHIP = eINSTANCE.getClass_TargetRelationship();

		/**
		 * The meta object literal for the '<em><b>Source Relationship</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__SOURCE_RELATIONSHIP = eINSTANCE.getClass_SourceRelationship();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__NAME = eINSTANCE.getClass_Name();

		/**
		 * The meta object literal for the '<em><b>Imported Package</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLASS__IMPORTED_PACKAGE = eINSTANCE.getClass_ImportedPackage();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__TYPE = eINSTANCE.getClass_Type();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__VISIBILITY = eINSTANCE.getClass_Visibility();

		/**
		 * The meta object literal for the '<em><b>Is Singletone</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_SINGLETONE = eINSTANCE.getClass_IsSingletone();

		/**
		 * The meta object literal for the '<em><b>Is Interface</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__IS_INTERFACE = eINSTANCE.getClass_IsInterface();

		/**
		 * The meta object literal for the '<em><b>Super Class</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__SUPER_CLASS = eINSTANCE.getClass_SuperClass();

		/**
		 * The meta object literal for the '<em><b>Supplier Element</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLASS__SUPPLIER_ELEMENT = eINSTANCE.getClass_SupplierElement();

		/**
		 * The meta object literal for the '{@link kragstein.impl.ImportedPackageImpl <em>Imported Package</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.ImportedPackageImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getImportedPackage()
		 * @generated
		 */
		EClass IMPORTED_PACKAGE = eINSTANCE.getImportedPackage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_PACKAGE__NAME = eINSTANCE.getImportedPackage_Name();

		/**
		 * The meta object literal for the '<em><b>Is Internal</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_PACKAGE__IS_INTERNAL = eINSTANCE.getImportedPackage_IsInternal();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IMPORTED_PACKAGE__PATH = eINSTANCE.getImportedPackage_Path();

		/**
		 * The meta object literal for the '{@link kragstein.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.AttributeImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getAttribute()
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
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__TYPE = eINSTANCE.getAttribute_Type();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VISIBILITY = eINSTANCE.getAttribute_Visibility();

		/**
		 * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_CONST = eINSTANCE.getAttribute_IsConst();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__IS_STATIC = eINSTANCE.getAttribute_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ATTRIBUTE__VALUE = eINSTANCE.getAttribute_Value();

		/**
		 * The meta object literal for the '{@link kragstein.impl.MethodImpl <em>Method</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.MethodImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getMethod()
		 * @generated
		 */
		EClass METHOD = eINSTANCE.getMethod();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__PARAMETER = eINSTANCE.getMethod_Parameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__NAME = eINSTANCE.getMethod_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__TYPE = eINSTANCE.getMethod_Type();

		/**
		 * The meta object literal for the '<em><b>Visibility</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__VISIBILITY = eINSTANCE.getMethod_Visibility();

		/**
		 * The meta object literal for the '<em><b>Is Const</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_CONST = eINSTANCE.getMethod_IsConst();

		/**
		 * The meta object literal for the '<em><b>Is Virtual</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_VIRTUAL = eINSTANCE.getMethod_IsVirtual();

		/**
		 * The meta object literal for the '<em><b>Is Static</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute METHOD__IS_STATIC = eINSTANCE.getMethod_IsStatic();

		/**
		 * The meta object literal for the '<em><b>Header</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__HEADER = eINSTANCE.getMethod_Header();

		/**
		 * The meta object literal for the '<em><b>Branch</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference METHOD__BRANCH = eINSTANCE.getMethod_Branch();

		/**
		 * The meta object literal for the '{@link kragstein.impl.ParameterImpl <em>Parameter</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.ParameterImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getParameter()
		 * @generated
		 */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__NAME = eINSTANCE.getParameter_Name();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__TYPE = eINSTANCE.getParameter_Type();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PARAMETER__VALUE = eINSTANCE.getParameter_Value();

		/**
		 * The meta object literal for the '{@link kragstein.impl.HeaderImpl <em>Header</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.HeaderImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getHeader()
		 * @generated
		 */
		EClass HEADER = eINSTANCE.getHeader();

		/**
		 * The meta object literal for the '<em><b>Formal Parameters</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference HEADER__FORMAL_PARAMETERS = eINSTANCE.getHeader_FormalParameters();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADER__NAME = eINSTANCE.getHeader_Name();

		/**
		 * The meta object literal for the '{@link kragstein.impl.FormalParametersImpl <em>Formal Parameters</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.FormalParametersImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getFormalParameters()
		 * @generated
		 */
		EClass FORMAL_PARAMETERS = eINSTANCE.getFormalParameters();

		/**
		 * The meta object literal for the '<em><b>Parameter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FORMAL_PARAMETERS__PARAMETER = eINSTANCE.getFormalParameters_Parameter();

		/**
		 * The meta object literal for the '{@link kragstein.impl.BranchImpl <em>Branch</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.BranchImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getBranch()
		 * @generated
		 */
		EClass BRANCH = eINSTANCE.getBranch();

		/**
		 * The meta object literal for the '<em><b>Source Branch Connection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__SOURCE_BRANCH_CONNECTION = eINSTANCE.getBranch_SourceBranchConnection();

		/**
		 * The meta object literal for the '<em><b>Target Branch Connection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__TARGET_BRANCH_CONNECTION = eINSTANCE.getBranch_TargetBranchConnection();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH__ROUTE = eINSTANCE.getBranch_Route();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH__NAME = eINSTANCE.getBranch_Name();

		/**
		 * The meta object literal for the '{@link kragstein.impl.BranchConnectionImpl <em>Branch Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.BranchConnectionImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getBranchConnection()
		 * @generated
		 */
		EClass BRANCH_CONNECTION = eINSTANCE.getBranchConnection();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_CONNECTION__SOURCE = eINSTANCE.getBranchConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BRANCH_CONNECTION__TARGET = eINSTANCE.getBranchConnection_Target();

		/**
		 * The meta object literal for the '<em><b>Target Branch</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BRANCH_CONNECTION__TARGET_BRANCH = eINSTANCE.getBranchConnection_TargetBranch();

		/**
		 * The meta object literal for the '{@link kragstein.impl.RouteImpl <em>Route</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.RouteImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getRoute()
		 * @generated
		 */
		EClass ROUTE = eINSTANCE.getRoute();

		/**
		 * The meta object literal for the '<em><b>Icon</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ROUTE__ICON = eINSTANCE.getRoute_Icon();

		/**
		 * The meta object literal for the '{@link kragstein.impl.RightCommentImpl <em>Right Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.RightCommentImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getRightComment()
		 * @generated
		 */
		EClass RIGHT_COMMENT = eINSTANCE.getRightComment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RIGHT_COMMENT__VALUE = eINSTANCE.getRightComment_Value();

		/**
		 * The meta object literal for the '{@link kragstein.impl.LeftCommentImpl <em>Left Comment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.LeftCommentImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getLeftComment()
		 * @generated
		 */
		EClass LEFT_COMMENT = eINSTANCE.getLeftComment();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LEFT_COMMENT__VALUE = eINSTANCE.getLeftComment_Value();

		/**
		 * The meta object literal for the '{@link kragstein.impl.ValencePointImpl <em>Valence Point</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.ValencePointImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getValencePoint()
		 * @generated
		 */
		EClass VALENCE_POINT = eINSTANCE.getValencePoint();

		/**
		 * The meta object literal for the '{@link kragstein.impl.IconConnectionImpl <em>Icon Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.IconConnectionImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getIconConnection()
		 * @generated
		 */
		EClass ICON_CONNECTION = eINSTANCE.getIconConnection();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON_CONNECTION__TARGET = eINSTANCE.getIconConnection_Target();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON_CONNECTION__SOURCE = eINSTANCE.getIconConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target Icon</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ICON_CONNECTION__TARGET_ICON = eINSTANCE.getIconConnection_TargetIcon();

		/**
		 * The meta object literal for the '{@link kragstein.impl.IconImpl <em>Icon</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.IconImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getIcon()
		 * @generated
		 */
		EClass ICON = eINSTANCE.getIcon();

		/**
		 * The meta object literal for the '<em><b>Source Icon Connection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON__SOURCE_ICON_CONNECTION = eINSTANCE.getIcon_SourceIconConnection();

		/**
		 * The meta object literal for the '<em><b>Target Icon Connection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON__TARGET_ICON_CONNECTION = eINSTANCE.getIcon_TargetIconConnection();

		/**
		 * The meta object literal for the '<em><b>Valence Point</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON__VALENCE_POINT = eINSTANCE.getIcon_ValencePoint();

		/**
		 * The meta object literal for the '<em><b>Left Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON__LEFT_COMMENT = eINSTANCE.getIcon_LeftComment();

		/**
		 * The meta object literal for the '<em><b>Right Comment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ICON__RIGHT_COMMENT = eINSTANCE.getIcon_RightComment();

		/**
		 * The meta object literal for the '{@link kragstein.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.ActionImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__NAME = eINSTANCE.getAction_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__VALUE = eINSTANCE.getAction_Value();

		/**
		 * The meta object literal for the '{@link kragstein.impl.QuestionImpl <em>Question</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.QuestionImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getQuestion()
		 * @generated
		 */
		EClass QUESTION = eINSTANCE.getQuestion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__NAME = eINSTANCE.getQuestion_Name();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference QUESTION__ROUTE = eINSTANCE.getQuestion_Route();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__VALUE = eINSTANCE.getQuestion_Value();

		/**
		 * The meta object literal for the '<em><b>Yes Below</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute QUESTION__YES_BELOW = eINSTANCE.getQuestion_YesBelow();

		/**
		 * The meta object literal for the '{@link kragstein.impl.ChoiceImpl <em>Choice</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.ChoiceImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getChoice()
		 * @generated
		 */
		EClass CHOICE = eINSTANCE.getChoice();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__NAME = eINSTANCE.getChoice_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHOICE__VALUE = eINSTANCE.getChoice_Value();

		/**
		 * The meta object literal for the '<em><b>Choice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHOICE__CHOICE = eINSTANCE.getChoice_Choice();

		/**
		 * The meta object literal for the '{@link kragstein.impl.CaseImpl <em>Case</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.CaseImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getCase()
		 * @generated
		 */
		EClass CASE = eINSTANCE.getCase();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__NAME = eINSTANCE.getCase_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE__VALUE = eINSTANCE.getCase_Value();

		/**
		 * The meta object literal for the '<em><b>Route</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__ROUTE = eINSTANCE.getCase_Route();

		/**
		 * The meta object literal for the '<em><b>Source Case Connection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__SOURCE_CASE_CONNECTION = eINSTANCE.getCase_SourceCaseConnection();

		/**
		 * The meta object literal for the '<em><b>Target Case Connection</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE__TARGET_CASE_CONNECTION = eINSTANCE.getCase_TargetCaseConnection();

		/**
		 * The meta object literal for the '{@link kragstein.impl.CaseConnectionImpl <em>Case Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.CaseConnectionImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getCaseConnection()
		 * @generated
		 */
		EClass CASE_CONNECTION = eINSTANCE.getCaseConnection();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_CONNECTION__SOURCE = eINSTANCE.getCaseConnection_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CASE_CONNECTION__TARGET = eINSTANCE.getCaseConnection_Target();

		/**
		 * The meta object literal for the '<em><b>Target Case</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CASE_CONNECTION__TARGET_CASE = eINSTANCE.getCaseConnection_TargetCase();

		/**
		 * The meta object literal for the '{@link kragstein.impl.HeadlineImpl <em>Headline</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.HeadlineImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getHeadline()
		 * @generated
		 */
		EClass HEADLINE = eINSTANCE.getHeadline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADLINE__NAME = eINSTANCE.getHeadline_Name();

		/**
		 * The meta object literal for the '<em><b>Is Loop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute HEADLINE__IS_LOOP = eINSTANCE.getHeadline_IsLoop();

		/**
		 * The meta object literal for the '{@link kragstein.impl.AdressImpl <em>Adress</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.AdressImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getAdress()
		 * @generated
		 */
		EClass ADRESS = eINSTANCE.getAdress();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESS__NAME = eINSTANCE.getAdress_Name();

		/**
		 * The meta object literal for the '<em><b>Is Loop</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADRESS__IS_LOOP = eINSTANCE.getAdress_IsLoop();

		/**
		 * The meta object literal for the '{@link kragstein.impl.InsertionImpl <em>Insertion</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.InsertionImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getInsertion()
		 * @generated
		 */
		EClass INSERTION = eINSTANCE.getInsertion();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION__NAME = eINSTANCE.getInsertion_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSERTION__VALUE = eINSTANCE.getInsertion_Value();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSERTION__METHOD = eINSTANCE.getInsertion_Method();

		/**
		 * The meta object literal for the '{@link kragstein.impl.ShelfImpl <em>Shelf</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.ShelfImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getShelf()
		 * @generated
		 */
		EClass SHELF = eINSTANCE.getShelf();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHELF__NAME = eINSTANCE.getShelf_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SHELF__VALUE = eINSTANCE.getShelf_Value();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SHELF__METHOD = eINSTANCE.getShelf_Method();

		/**
		 * The meta object literal for the '{@link kragstein.impl.BeginLoopImpl <em>Begin Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.BeginLoopImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getBeginLoop()
		 * @generated
		 */
		EClass BEGIN_LOOP = eINSTANCE.getBeginLoop();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEGIN_LOOP__NAME = eINSTANCE.getBeginLoop_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEGIN_LOOP__VALUE = eINSTANCE.getBeginLoop_Value();

		/**
		 * The meta object literal for the '{@link kragstein.impl.EndLoopImpl <em>End Loop</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.EndLoopImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getEndLoop()
		 * @generated
		 */
		EClass END_LOOP = eINSTANCE.getEndLoop();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_LOOP__NAME = eINSTANCE.getEndLoop_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute END_LOOP__VALUE = eINSTANCE.getEndLoop_Value();

		/**
		 * The meta object literal for the '{@link kragstein.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.OutputImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__NAME = eINSTANCE.getOutput_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__VALUE = eINSTANCE.getOutput_Value();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUTPUT__METHOD = eINSTANCE.getOutput_Method();

		/**
		 * The meta object literal for the '{@link kragstein.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.InputImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__NAME = eINSTANCE.getInput_Name();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__VALUE = eINSTANCE.getInput_Value();

		/**
		 * The meta object literal for the '<em><b>Method</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INPUT__METHOD = eINSTANCE.getInput_Method();

		/**
		 * The meta object literal for the '{@link kragstein.impl.LoopArrowImpl <em>Loop Arrow</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.LoopArrowImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getLoopArrow()
		 * @generated
		 */
		EClass LOOP_ARROW = eINSTANCE.getLoopArrow();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOOP_ARROW__NAME = eINSTANCE.getLoopArrow_Name();

		/**
		 * The meta object literal for the '{@link kragstein.impl.EmptyConnectorImpl <em>Empty Connector</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.EmptyConnectorImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getEmptyConnector()
		 * @generated
		 */
		EClass EMPTY_CONNECTOR = eINSTANCE.getEmptyConnector();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute EMPTY_CONNECTOR__NAME = eINSTANCE.getEmptyConnector_Name();

		/**
		 * The meta object literal for the '{@link kragstein.impl.EndImpl <em>End</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see kragstein.impl.EndImpl
		 * @see kragstein.impl.KragsteinPackageImpl#getEnd()
		 * @generated
		 */
		EClass END = eINSTANCE.getEnd();

	}

} //KragsteinPackage

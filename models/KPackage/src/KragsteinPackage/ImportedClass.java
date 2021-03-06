/**
 */
package KragsteinPackage;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Imported Class</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link KragsteinPackage.ImportedClass#getName <em>Name</em>}</li>
 *   <li>{@link KragsteinPackage.ImportedClass#getPath <em>Path</em>}</li>
 *   <li>{@link KragsteinPackage.ImportedClass#isIsInternal <em>Is Internal</em>}</li>
 * </ul>
 * </p>
 *
 * @see KragsteinPackage.KragsteinPackagePackage#getImportedClass()
 * @model annotation="gmf.node label='name'"
 * @generated
 */
public interface ImportedClass extends EObject {
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
	 * @see KragsteinPackage.KragsteinPackagePackage#getImportedClass_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link KragsteinPackage.ImportedClass#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Path</em>' attribute.
	 * @see #setPath(String)
	 * @see KragsteinPackage.KragsteinPackagePackage#getImportedClass_Path()
	 * @model
	 * @generated
	 */
	String getPath();

	/**
	 * Sets the value of the '{@link KragsteinPackage.ImportedClass#getPath <em>Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Path</em>' attribute.
	 * @see #getPath()
	 * @generated
	 */
	void setPath(String value);

	/**
	 * Returns the value of the '<em><b>Is Internal</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Internal</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Internal</em>' attribute.
	 * @see #setIsInternal(boolean)
	 * @see KragsteinPackage.KragsteinPackagePackage#getImportedClass_IsInternal()
	 * @model
	 * @generated
	 */
	boolean isIsInternal();

	/**
	 * Sets the value of the '{@link KragsteinPackage.ImportedClass#isIsInternal <em>Is Internal</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Internal</em>' attribute.
	 * @see #isIsInternal()
	 * @generated
	 */
	void setIsInternal(boolean value);

} // ImportedClass

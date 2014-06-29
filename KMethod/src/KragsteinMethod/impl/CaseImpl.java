/**
 */
package KragsteinMethod.impl;

import KragsteinMethod.Case;
import KragsteinMethod.CaseConnection;
import KragsteinMethod.KragsteinMethodPackage;
import KragsteinMethod.Route;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Case</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link KragsteinMethod.impl.CaseImpl#getName <em>Name</em>}</li>
 *   <li>{@link KragsteinMethod.impl.CaseImpl#getValue <em>Value</em>}</li>
 *   <li>{@link KragsteinMethod.impl.CaseImpl#getSourceCaseConnection <em>Source Case Connection</em>}</li>
 *   <li>{@link KragsteinMethod.impl.CaseImpl#getTargetCaseConnection <em>Target Case Connection</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CaseImpl extends IconImpl implements Case {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected static final String VALUE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getValue() <em>Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getValue()
	 * @generated
	 * @ordered
	 */
	protected String value = VALUE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSourceCaseConnection() <em>Source Case Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSourceCaseConnection()
	 * @generated
	 * @ordered
	 */
	protected CaseConnection sourceCaseConnection;

	/**
	 * The cached value of the '{@link #getTargetCaseConnection() <em>Target Case Connection</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTargetCaseConnection()
	 * @generated
	 * @ordered
	 */
	protected CaseConnection targetCaseConnection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CaseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return KragsteinMethodPackage.Literals.CASE;
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
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.CASE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setValue(String newValue) {
		String oldValue = value;
		value = newValue;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.CASE__VALUE, oldValue, value));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseConnection getSourceCaseConnection() {
		return sourceCaseConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSourceCaseConnection(CaseConnection newSourceCaseConnection, NotificationChain msgs) {
		CaseConnection oldSourceCaseConnection = sourceCaseConnection;
		sourceCaseConnection = newSourceCaseConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.CASE__SOURCE_CASE_CONNECTION, oldSourceCaseConnection, newSourceCaseConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSourceCaseConnection(CaseConnection newSourceCaseConnection) {
		if (newSourceCaseConnection != sourceCaseConnection) {
			NotificationChain msgs = null;
			if (sourceCaseConnection != null)
				msgs = ((InternalEObject)sourceCaseConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinMethodPackage.CASE__SOURCE_CASE_CONNECTION, null, msgs);
			if (newSourceCaseConnection != null)
				msgs = ((InternalEObject)newSourceCaseConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinMethodPackage.CASE__SOURCE_CASE_CONNECTION, null, msgs);
			msgs = basicSetSourceCaseConnection(newSourceCaseConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.CASE__SOURCE_CASE_CONNECTION, newSourceCaseConnection, newSourceCaseConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CaseConnection getTargetCaseConnection() {
		return targetCaseConnection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTargetCaseConnection(CaseConnection newTargetCaseConnection, NotificationChain msgs) {
		CaseConnection oldTargetCaseConnection = targetCaseConnection;
		targetCaseConnection = newTargetCaseConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.CASE__TARGET_CASE_CONNECTION, oldTargetCaseConnection, newTargetCaseConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTargetCaseConnection(CaseConnection newTargetCaseConnection) {
		if (newTargetCaseConnection != targetCaseConnection) {
			NotificationChain msgs = null;
			if (targetCaseConnection != null)
				msgs = ((InternalEObject)targetCaseConnection).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - KragsteinMethodPackage.CASE__TARGET_CASE_CONNECTION, null, msgs);
			if (newTargetCaseConnection != null)
				msgs = ((InternalEObject)newTargetCaseConnection).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - KragsteinMethodPackage.CASE__TARGET_CASE_CONNECTION, null, msgs);
			msgs = basicSetTargetCaseConnection(newTargetCaseConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, KragsteinMethodPackage.CASE__TARGET_CASE_CONNECTION, newTargetCaseConnection, newTargetCaseConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case KragsteinMethodPackage.CASE__SOURCE_CASE_CONNECTION:
				return basicSetSourceCaseConnection(null, msgs);
			case KragsteinMethodPackage.CASE__TARGET_CASE_CONNECTION:
				return basicSetTargetCaseConnection(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case KragsteinMethodPackage.CASE__NAME:
				return getName();
			case KragsteinMethodPackage.CASE__VALUE:
				return getValue();
			case KragsteinMethodPackage.CASE__SOURCE_CASE_CONNECTION:
				return getSourceCaseConnection();
			case KragsteinMethodPackage.CASE__TARGET_CASE_CONNECTION:
				return getTargetCaseConnection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case KragsteinMethodPackage.CASE__NAME:
				setName((String)newValue);
				return;
			case KragsteinMethodPackage.CASE__VALUE:
				setValue((String)newValue);
				return;
			case KragsteinMethodPackage.CASE__SOURCE_CASE_CONNECTION:
				setSourceCaseConnection((CaseConnection)newValue);
				return;
			case KragsteinMethodPackage.CASE__TARGET_CASE_CONNECTION:
				setTargetCaseConnection((CaseConnection)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case KragsteinMethodPackage.CASE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case KragsteinMethodPackage.CASE__VALUE:
				setValue(VALUE_EDEFAULT);
				return;
			case KragsteinMethodPackage.CASE__SOURCE_CASE_CONNECTION:
				setSourceCaseConnection((CaseConnection)null);
				return;
			case KragsteinMethodPackage.CASE__TARGET_CASE_CONNECTION:
				setTargetCaseConnection((CaseConnection)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case KragsteinMethodPackage.CASE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case KragsteinMethodPackage.CASE__VALUE:
				return VALUE_EDEFAULT == null ? value != null : !VALUE_EDEFAULT.equals(value);
			case KragsteinMethodPackage.CASE__SOURCE_CASE_CONNECTION:
				return sourceCaseConnection != null;
			case KragsteinMethodPackage.CASE__TARGET_CASE_CONNECTION:
				return targetCaseConnection != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", value: ");
		result.append(value);
		result.append(')');
		return result.toString();
	}

} //CaseImpl

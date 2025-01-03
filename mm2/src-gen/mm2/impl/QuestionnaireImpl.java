/**
 */
package mm2.impl;

import java.util.Collection;

import mm2.Mm2Package;
import mm2.Page;
import mm2.Questionnaire;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm2.impl.QuestionnaireImpl#getPage <em>Page</em>}</li>
 *   <li>{@link mm2.impl.QuestionnaireImpl#getResultat <em>Resultat</em>}</li>
 *   <li>{@link mm2.impl.QuestionnaireImpl#getNom <em>Nom</em>}</li>
 *   <li>{@link mm2.impl.QuestionnaireImpl#isRetourAutorise <em>Retour Autorise</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionnaireImpl extends MinimalEObjectImpl.Container implements Questionnaire {
	/**
	 * The cached value of the '{@link #getPage() <em>Page</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPage()
	 * @generated
	 * @ordered
	 */
	protected EList<Page> page;

	/**
	 * The default value of the '{@link #getResultat() <em>Resultat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultat()
	 * @generated
	 * @ordered
	 */
	protected static final double RESULTAT_EDEFAULT = 0.0;

	/**
	 * The cached value of the '{@link #getResultat() <em>Resultat</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultat()
	 * @generated
	 * @ordered
	 */
	protected double resultat = RESULTAT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected static final String NOM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNom() <em>Nom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNom()
	 * @generated
	 * @ordered
	 */
	protected String nom = NOM_EDEFAULT;

	/**
	 * The default value of the '{@link #isRetourAutorise() <em>Retour Autorise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetourAutorise()
	 * @generated
	 * @ordered
	 */
	protected static final boolean RETOUR_AUTORISE_EDEFAULT = true;

	/**
	 * The cached value of the '{@link #isRetourAutorise() <em>Retour Autorise</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isRetourAutorise()
	 * @generated
	 * @ordered
	 */
	protected boolean retourAutorise = RETOUR_AUTORISE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionnaireImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm2Package.Literals.QUESTIONNAIRE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Page> getPage() {
		if (page == null) {
			page = new EObjectContainmentEList<Page>(Page.class, this, Mm2Package.QUESTIONNAIRE__PAGE);
		}
		return page;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public double getResultat() {
		return resultat;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setResultat(double newResultat) {
		double oldResultat = resultat;
		resultat = newResultat;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.QUESTIONNAIRE__RESULTAT, oldResultat,
					resultat));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getNom() {
		return nom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setNom(String newNom) {
		String oldNom = nom;
		nom = newNom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.QUESTIONNAIRE__NOM, oldNom, nom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isRetourAutorise() {
		return retourAutorise;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRetourAutorise(boolean newRetourAutorise) {
		boolean oldRetourAutorise = retourAutorise;
		retourAutorise = newRetourAutorise;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.QUESTIONNAIRE__RETOUR_AUTORISE,
					oldRetourAutorise, retourAutorise));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mm2Package.QUESTIONNAIRE__PAGE:
			return ((InternalEList<?>) getPage()).basicRemove(otherEnd, msgs);
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
		case Mm2Package.QUESTIONNAIRE__PAGE:
			return getPage();
		case Mm2Package.QUESTIONNAIRE__RESULTAT:
			return getResultat();
		case Mm2Package.QUESTIONNAIRE__NOM:
			return getNom();
		case Mm2Package.QUESTIONNAIRE__RETOUR_AUTORISE:
			return isRetourAutorise();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case Mm2Package.QUESTIONNAIRE__PAGE:
			getPage().clear();
			getPage().addAll((Collection<? extends Page>) newValue);
			return;
		case Mm2Package.QUESTIONNAIRE__RESULTAT:
			setResultat((Double) newValue);
			return;
		case Mm2Package.QUESTIONNAIRE__NOM:
			setNom((String) newValue);
			return;
		case Mm2Package.QUESTIONNAIRE__RETOUR_AUTORISE:
			setRetourAutorise((Boolean) newValue);
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
		case Mm2Package.QUESTIONNAIRE__PAGE:
			getPage().clear();
			return;
		case Mm2Package.QUESTIONNAIRE__RESULTAT:
			setResultat(RESULTAT_EDEFAULT);
			return;
		case Mm2Package.QUESTIONNAIRE__NOM:
			setNom(NOM_EDEFAULT);
			return;
		case Mm2Package.QUESTIONNAIRE__RETOUR_AUTORISE:
			setRetourAutorise(RETOUR_AUTORISE_EDEFAULT);
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
		case Mm2Package.QUESTIONNAIRE__PAGE:
			return page != null && !page.isEmpty();
		case Mm2Package.QUESTIONNAIRE__RESULTAT:
			return resultat != RESULTAT_EDEFAULT;
		case Mm2Package.QUESTIONNAIRE__NOM:
			return NOM_EDEFAULT == null ? nom != null : !NOM_EDEFAULT.equals(nom);
		case Mm2Package.QUESTIONNAIRE__RETOUR_AUTORISE:
			return retourAutorise != RETOUR_AUTORISE_EDEFAULT;
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
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (resultat: ");
		result.append(resultat);
		result.append(", nom: ");
		result.append(nom);
		result.append(", retourAutorise: ");
		result.append(retourAutorise);
		result.append(')');
		return result.toString();
	}

} //QuestionnaireImpl

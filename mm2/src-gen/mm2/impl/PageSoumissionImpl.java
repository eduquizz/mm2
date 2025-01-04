/**
 */
package mm2.impl;

import java.util.Collection;
import mm2.BoutonSoumettre;
import mm2.Mm2Package;
import mm2.Page;
import mm2.PageSoumission;

import mm2.Question;
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
 * An implementation of the model object '<em><b>Page Soumission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm2.impl.PageSoumissionImpl#getPageSuivante <em>Page Suivante</em>}</li>
 *   <li>{@link mm2.impl.PageSoumissionImpl#getPagePrecedente <em>Page Precedente</em>}</li>
 *   <li>{@link mm2.impl.PageSoumissionImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link mm2.impl.PageSoumissionImpl#getBoutonSoumettre <em>Bouton Soumettre</em>}</li>
 *   <li>{@link mm2.impl.PageSoumissionImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageSoumissionImpl extends MinimalEObjectImpl.Container implements PageSoumission {
	/**
	 * The cached value of the '{@link #getPageSuivante() <em>Page Suivante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageSuivante()
	 * @generated
	 * @ordered
	 */
	protected Page pageSuivante;

	/**
	 * The cached value of the '{@link #getPagePrecedente() <em>Page Precedente</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPagePrecedente()
	 * @generated
	 * @ordered
	 */
	protected Page pagePrecedente;

	/**
	 * The default value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected static final String TITRE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitre() <em>Titre</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitre()
	 * @generated
	 * @ordered
	 */
	protected String titre = TITRE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getBoutonSoumettre() <em>Bouton Soumettre</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoutonSoumettre()
	 * @generated
	 * @ordered
	 */
	protected BoutonSoumettre boutonSoumettre;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected EList<Question> question;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageSoumissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm2Package.Literals.PAGE_SOUMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page getPageSuivante() {
		if (pageSuivante != null && pageSuivante.eIsProxy()) {
			InternalEObject oldPageSuivante = (InternalEObject) pageSuivante;
			pageSuivante = (Page) eResolveProxy(oldPageSuivante);
			if (pageSuivante != oldPageSuivante) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mm2Package.PAGE_SOUMISSION__PAGE_SUIVANTE,
							oldPageSuivante, pageSuivante));
			}
		}
		return pageSuivante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetPageSuivante() {
		return pageSuivante;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageSuivante(Page newPageSuivante) {
		Page oldPageSuivante = pageSuivante;
		pageSuivante = newPageSuivante;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.PAGE_SOUMISSION__PAGE_SUIVANTE,
					oldPageSuivante, pageSuivante));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Page getPagePrecedente() {
		if (pagePrecedente != null && pagePrecedente.eIsProxy()) {
			InternalEObject oldPagePrecedente = (InternalEObject) pagePrecedente;
			pagePrecedente = (Page) eResolveProxy(oldPagePrecedente);
			if (pagePrecedente != oldPagePrecedente) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Mm2Package.PAGE_SOUMISSION__PAGE_PRECEDENTE, oldPagePrecedente, pagePrecedente));
			}
		}
		return pagePrecedente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Page basicGetPagePrecedente() {
		return pagePrecedente;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPagePrecedente(Page newPagePrecedente) {
		Page oldPagePrecedente = pagePrecedente;
		pagePrecedente = newPagePrecedente;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.PAGE_SOUMISSION__PAGE_PRECEDENTE,
					oldPagePrecedente, pagePrecedente));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTitre() {
		return titre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTitre(String newTitre) {
		String oldTitre = titre;
		titre = newTitre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.PAGE_SOUMISSION__TITRE, oldTitre, titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoutonSoumettre getBoutonSoumettre() {
		if (boutonSoumettre != null && boutonSoumettre.eIsProxy()) {
			InternalEObject oldBoutonSoumettre = (InternalEObject) boutonSoumettre;
			boutonSoumettre = (BoutonSoumettre) eResolveProxy(oldBoutonSoumettre);
			if (boutonSoumettre != oldBoutonSoumettre) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							Mm2Package.PAGE_SOUMISSION__BOUTON_SOUMETTRE, oldBoutonSoumettre, boutonSoumettre));
			}
		}
		return boutonSoumettre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoutonSoumettre basicGetBoutonSoumettre() {
		return boutonSoumettre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoutonSoumettre(BoutonSoumettre newBoutonSoumettre) {
		BoutonSoumettre oldBoutonSoumettre = boutonSoumettre;
		boutonSoumettre = newBoutonSoumettre;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.PAGE_SOUMISSION__BOUTON_SOUMETTRE,
					oldBoutonSoumettre, boutonSoumettre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Question> getQuestion() {
		if (question == null) {
			question = new EObjectContainmentEList<Question>(Question.class, this,
					Mm2Package.PAGE_SOUMISSION__QUESTION);
		}
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mm2Package.PAGE_SOUMISSION__QUESTION:
			return ((InternalEList<?>) getQuestion()).basicRemove(otherEnd, msgs);
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
		case Mm2Package.PAGE_SOUMISSION__PAGE_SUIVANTE:
			if (resolve)
				return getPageSuivante();
			return basicGetPageSuivante();
		case Mm2Package.PAGE_SOUMISSION__PAGE_PRECEDENTE:
			if (resolve)
				return getPagePrecedente();
			return basicGetPagePrecedente();
		case Mm2Package.PAGE_SOUMISSION__TITRE:
			return getTitre();
		case Mm2Package.PAGE_SOUMISSION__BOUTON_SOUMETTRE:
			if (resolve)
				return getBoutonSoumettre();
			return basicGetBoutonSoumettre();
		case Mm2Package.PAGE_SOUMISSION__QUESTION:
			return getQuestion();
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
		case Mm2Package.PAGE_SOUMISSION__PAGE_SUIVANTE:
			setPageSuivante((Page) newValue);
			return;
		case Mm2Package.PAGE_SOUMISSION__PAGE_PRECEDENTE:
			setPagePrecedente((Page) newValue);
			return;
		case Mm2Package.PAGE_SOUMISSION__TITRE:
			setTitre((String) newValue);
			return;
		case Mm2Package.PAGE_SOUMISSION__BOUTON_SOUMETTRE:
			setBoutonSoumettre((BoutonSoumettre) newValue);
			return;
		case Mm2Package.PAGE_SOUMISSION__QUESTION:
			getQuestion().clear();
			getQuestion().addAll((Collection<? extends Question>) newValue);
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
		case Mm2Package.PAGE_SOUMISSION__PAGE_SUIVANTE:
			setPageSuivante((Page) null);
			return;
		case Mm2Package.PAGE_SOUMISSION__PAGE_PRECEDENTE:
			setPagePrecedente((Page) null);
			return;
		case Mm2Package.PAGE_SOUMISSION__TITRE:
			setTitre(TITRE_EDEFAULT);
			return;
		case Mm2Package.PAGE_SOUMISSION__BOUTON_SOUMETTRE:
			setBoutonSoumettre((BoutonSoumettre) null);
			return;
		case Mm2Package.PAGE_SOUMISSION__QUESTION:
			getQuestion().clear();
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
		case Mm2Package.PAGE_SOUMISSION__PAGE_SUIVANTE:
			return pageSuivante != null;
		case Mm2Package.PAGE_SOUMISSION__PAGE_PRECEDENTE:
			return pagePrecedente != null;
		case Mm2Package.PAGE_SOUMISSION__TITRE:
			return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
		case Mm2Package.PAGE_SOUMISSION__BOUTON_SOUMETTRE:
			return boutonSoumettre != null;
		case Mm2Package.PAGE_SOUMISSION__QUESTION:
			return question != null && !question.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == Page.class) {
			switch (derivedFeatureID) {
			case Mm2Package.PAGE_SOUMISSION__TITRE:
				return Mm2Package.PAGE__TITRE;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == Page.class) {
			switch (baseFeatureID) {
			case Mm2Package.PAGE__TITRE:
				return Mm2Package.PAGE_SOUMISSION__TITRE;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (titre: ");
		result.append(titre);
		result.append(')');
		return result.toString();
	}

} //PageSoumissionImpl

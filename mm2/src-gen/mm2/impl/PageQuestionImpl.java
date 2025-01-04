/**
 */
package mm2.impl;

import mm2.BoutonRetour;
import mm2.BoutonSuivant;
import mm2.Mm2Package;
import mm2.Page;
import mm2.PageQuestion;
import mm2.Question;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm2.impl.PageQuestionImpl#getPageSuivante <em>Page Suivante</em>}</li>
 *   <li>{@link mm2.impl.PageQuestionImpl#getPagePrecedente <em>Page Precedente</em>}</li>
 *   <li>{@link mm2.impl.PageQuestionImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link mm2.impl.PageQuestionImpl#getBoutonSuivant <em>Bouton Suivant</em>}</li>
 *   <li>{@link mm2.impl.PageQuestionImpl#getBoutonRetour <em>Bouton Retour</em>}</li>
 *   <li>{@link mm2.impl.PageQuestionImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageQuestionImpl extends MinimalEObjectImpl.Container implements PageQuestion {
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
	 * The cached value of the '{@link #getBoutonSuivant() <em>Bouton Suivant</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoutonSuivant()
	 * @generated
	 * @ordered
	 */
	protected BoutonSuivant boutonSuivant;

	/**
	 * The cached value of the '{@link #getBoutonRetour() <em>Bouton Retour</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoutonRetour()
	 * @generated
	 * @ordered
	 */
	protected BoutonRetour boutonRetour;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestion()
	 * @generated
	 * @ordered
	 */
	protected Question question;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PageQuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm2Package.Literals.PAGE_QUESTION;
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mm2Package.PAGE_QUESTION__PAGE_SUIVANTE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.PAGE_QUESTION__PAGE_SUIVANTE,
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
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mm2Package.PAGE_QUESTION__PAGE_PRECEDENTE,
							oldPagePrecedente, pagePrecedente));
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.PAGE_QUESTION__PAGE_PRECEDENTE,
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
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.PAGE_QUESTION__TITRE, oldTitre, titre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Question getQuestion() {
		if (question != null && question.eIsProxy()) {
			InternalEObject oldQuestion = (InternalEObject) question;
			question = (Question) eResolveProxy(oldQuestion);
			if (question != oldQuestion) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mm2Package.PAGE_QUESTION__QUESTION,
							oldQuestion, question));
			}
		}
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Question basicGetQuestion() {
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setQuestion(Question newQuestion) {
		Question oldQuestion = question;
		question = newQuestion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.PAGE_QUESTION__QUESTION, oldQuestion,
					question));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoutonSuivant getBoutonSuivant() {
		if (boutonSuivant != null && boutonSuivant.eIsProxy()) {
			InternalEObject oldBoutonSuivant = (InternalEObject) boutonSuivant;
			boutonSuivant = (BoutonSuivant) eResolveProxy(oldBoutonSuivant);
			if (boutonSuivant != oldBoutonSuivant) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mm2Package.PAGE_QUESTION__BOUTON_SUIVANT,
							oldBoutonSuivant, boutonSuivant));
			}
		}
		return boutonSuivant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoutonSuivant basicGetBoutonSuivant() {
		return boutonSuivant;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoutonSuivant(BoutonSuivant newBoutonSuivant) {
		BoutonSuivant oldBoutonSuivant = boutonSuivant;
		boutonSuivant = newBoutonSuivant;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.PAGE_QUESTION__BOUTON_SUIVANT,
					oldBoutonSuivant, boutonSuivant));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoutonRetour getBoutonRetour() {
		if (boutonRetour != null && boutonRetour.eIsProxy()) {
			InternalEObject oldBoutonRetour = (InternalEObject) boutonRetour;
			boutonRetour = (BoutonRetour) eResolveProxy(oldBoutonRetour);
			if (boutonRetour != oldBoutonRetour) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Mm2Package.PAGE_QUESTION__BOUTON_RETOUR,
							oldBoutonRetour, boutonRetour));
			}
		}
		return boutonRetour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BoutonRetour basicGetBoutonRetour() {
		return boutonRetour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoutonRetour(BoutonRetour newBoutonRetour) {
		BoutonRetour oldBoutonRetour = boutonRetour;
		boutonRetour = newBoutonRetour;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.PAGE_QUESTION__BOUTON_RETOUR,
					oldBoutonRetour, boutonRetour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case Mm2Package.PAGE_QUESTION__PAGE_SUIVANTE:
			if (resolve)
				return getPageSuivante();
			return basicGetPageSuivante();
		case Mm2Package.PAGE_QUESTION__PAGE_PRECEDENTE:
			if (resolve)
				return getPagePrecedente();
			return basicGetPagePrecedente();
		case Mm2Package.PAGE_QUESTION__TITRE:
			return getTitre();
		case Mm2Package.PAGE_QUESTION__BOUTON_SUIVANT:
			if (resolve)
				return getBoutonSuivant();
			return basicGetBoutonSuivant();
		case Mm2Package.PAGE_QUESTION__BOUTON_RETOUR:
			if (resolve)
				return getBoutonRetour();
			return basicGetBoutonRetour();
		case Mm2Package.PAGE_QUESTION__QUESTION:
			if (resolve)
				return getQuestion();
			return basicGetQuestion();
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
		case Mm2Package.PAGE_QUESTION__PAGE_SUIVANTE:
			setPageSuivante((Page) newValue);
			return;
		case Mm2Package.PAGE_QUESTION__PAGE_PRECEDENTE:
			setPagePrecedente((Page) newValue);
			return;
		case Mm2Package.PAGE_QUESTION__TITRE:
			setTitre((String) newValue);
			return;
		case Mm2Package.PAGE_QUESTION__BOUTON_SUIVANT:
			setBoutonSuivant((BoutonSuivant) newValue);
			return;
		case Mm2Package.PAGE_QUESTION__BOUTON_RETOUR:
			setBoutonRetour((BoutonRetour) newValue);
			return;
		case Mm2Package.PAGE_QUESTION__QUESTION:
			setQuestion((Question) newValue);
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
		case Mm2Package.PAGE_QUESTION__PAGE_SUIVANTE:
			setPageSuivante((Page) null);
			return;
		case Mm2Package.PAGE_QUESTION__PAGE_PRECEDENTE:
			setPagePrecedente((Page) null);
			return;
		case Mm2Package.PAGE_QUESTION__TITRE:
			setTitre(TITRE_EDEFAULT);
			return;
		case Mm2Package.PAGE_QUESTION__BOUTON_SUIVANT:
			setBoutonSuivant((BoutonSuivant) null);
			return;
		case Mm2Package.PAGE_QUESTION__BOUTON_RETOUR:
			setBoutonRetour((BoutonRetour) null);
			return;
		case Mm2Package.PAGE_QUESTION__QUESTION:
			setQuestion((Question) null);
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
		case Mm2Package.PAGE_QUESTION__PAGE_SUIVANTE:
			return pageSuivante != null;
		case Mm2Package.PAGE_QUESTION__PAGE_PRECEDENTE:
			return pagePrecedente != null;
		case Mm2Package.PAGE_QUESTION__TITRE:
			return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
		case Mm2Package.PAGE_QUESTION__BOUTON_SUIVANT:
			return boutonSuivant != null;
		case Mm2Package.PAGE_QUESTION__BOUTON_RETOUR:
			return boutonRetour != null;
		case Mm2Package.PAGE_QUESTION__QUESTION:
			return question != null;
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
			case Mm2Package.PAGE_QUESTION__TITRE:
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
				return Mm2Package.PAGE_QUESTION__TITRE;
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

} //PageQuestionImpl

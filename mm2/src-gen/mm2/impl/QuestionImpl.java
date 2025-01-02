/**
 */
package mm2.impl;

import java.util.Collection;

import mm2.Etiquette;
import mm2.Mm2Package;
import mm2.Question;
import mm2.Reponse;

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
 * An implementation of the model object '<em><b>Question</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm2.impl.QuestionImpl#getReponse <em>Reponse</em>}</li>
 *   <li>{@link mm2.impl.QuestionImpl#getEnnonce <em>Ennonce</em>}</li>
 *   <li>{@link mm2.impl.QuestionImpl#getDifficulte <em>Difficulte</em>}</li>
 *   <li>{@link mm2.impl.QuestionImpl#isReponsesMultiples <em>Reponses Multiples</em>}</li>
 *   <li>{@link mm2.impl.QuestionImpl#getEtiquette <em>Etiquette</em>}</li>
 * </ul>
 *
 * @generated
 */
public class QuestionImpl extends MinimalEObjectImpl.Container implements Question {
	/**
	 * The cached value of the '{@link #getReponse() <em>Reponse</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReponse()
	 * @generated
	 * @ordered
	 */
	protected EList<Reponse> reponse;

	/**
	 * The default value of the '{@link #getEnnonce() <em>Ennonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnnonce()
	 * @generated
	 * @ordered
	 */
	protected static final String ENNONCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEnnonce() <em>Ennonce</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnnonce()
	 * @generated
	 * @ordered
	 */
	protected String ennonce = ENNONCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDifficulte() <em>Difficulte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulte()
	 * @generated
	 * @ordered
	 */
	protected static final int DIFFICULTE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDifficulte() <em>Difficulte</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDifficulte()
	 * @generated
	 * @ordered
	 */
	protected int difficulte = DIFFICULTE_EDEFAULT;

	/**
	 * The default value of the '{@link #isReponsesMultiples() <em>Reponses Multiples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReponsesMultiples()
	 * @generated
	 * @ordered
	 */
	protected static final boolean REPONSES_MULTIPLES_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isReponsesMultiples() <em>Reponses Multiples</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isReponsesMultiples()
	 * @generated
	 * @ordered
	 */
	protected boolean reponsesMultiples = REPONSES_MULTIPLES_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEtiquette() <em>Etiquette</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEtiquette()
	 * @generated
	 * @ordered
	 */
	protected EList<Etiquette> etiquette;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected QuestionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Mm2Package.Literals.QUESTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Reponse> getReponse() {
		if (reponse == null) {
			reponse = new EObjectContainmentEList<Reponse>(Reponse.class, this, Mm2Package.QUESTION__REPONSE);
		}
		return reponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getEnnonce() {
		return ennonce;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setEnnonce(String newEnnonce) {
		String oldEnnonce = ennonce;
		ennonce = newEnnonce;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.QUESTION__ENNONCE, oldEnnonce, ennonce));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int getDifficulte() {
		return difficulte;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setDifficulte(int newDifficulte) {
		int oldDifficulte = difficulte;
		difficulte = newDifficulte;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.QUESTION__DIFFICULTE, oldDifficulte,
					difficulte));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isReponsesMultiples() {
		return reponsesMultiples;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setReponsesMultiples(boolean newReponsesMultiples) {
		boolean oldReponsesMultiples = reponsesMultiples;
		reponsesMultiples = newReponsesMultiples;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.QUESTION__REPONSES_MULTIPLES,
					oldReponsesMultiples, reponsesMultiples));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Etiquette> getEtiquette() {
		if (etiquette == null) {
			etiquette = new EObjectContainmentEList<Etiquette>(Etiquette.class, this, Mm2Package.QUESTION__ETIQUETTE);
		}
		return etiquette;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mm2Package.QUESTION__REPONSE:
			return ((InternalEList<?>) getReponse()).basicRemove(otherEnd, msgs);
		case Mm2Package.QUESTION__ETIQUETTE:
			return ((InternalEList<?>) getEtiquette()).basicRemove(otherEnd, msgs);
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
		case Mm2Package.QUESTION__REPONSE:
			return getReponse();
		case Mm2Package.QUESTION__ENNONCE:
			return getEnnonce();
		case Mm2Package.QUESTION__DIFFICULTE:
			return getDifficulte();
		case Mm2Package.QUESTION__REPONSES_MULTIPLES:
			return isReponsesMultiples();
		case Mm2Package.QUESTION__ETIQUETTE:
			return getEtiquette();
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
		case Mm2Package.QUESTION__REPONSE:
			getReponse().clear();
			getReponse().addAll((Collection<? extends Reponse>) newValue);
			return;
		case Mm2Package.QUESTION__ENNONCE:
			setEnnonce((String) newValue);
			return;
		case Mm2Package.QUESTION__DIFFICULTE:
			setDifficulte((Integer) newValue);
			return;
		case Mm2Package.QUESTION__REPONSES_MULTIPLES:
			setReponsesMultiples((Boolean) newValue);
			return;
		case Mm2Package.QUESTION__ETIQUETTE:
			getEtiquette().clear();
			getEtiquette().addAll((Collection<? extends Etiquette>) newValue);
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
		case Mm2Package.QUESTION__REPONSE:
			getReponse().clear();
			return;
		case Mm2Package.QUESTION__ENNONCE:
			setEnnonce(ENNONCE_EDEFAULT);
			return;
		case Mm2Package.QUESTION__DIFFICULTE:
			setDifficulte(DIFFICULTE_EDEFAULT);
			return;
		case Mm2Package.QUESTION__REPONSES_MULTIPLES:
			setReponsesMultiples(REPONSES_MULTIPLES_EDEFAULT);
			return;
		case Mm2Package.QUESTION__ETIQUETTE:
			getEtiquette().clear();
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
		case Mm2Package.QUESTION__REPONSE:
			return reponse != null && !reponse.isEmpty();
		case Mm2Package.QUESTION__ENNONCE:
			return ENNONCE_EDEFAULT == null ? ennonce != null : !ENNONCE_EDEFAULT.equals(ennonce);
		case Mm2Package.QUESTION__DIFFICULTE:
			return difficulte != DIFFICULTE_EDEFAULT;
		case Mm2Package.QUESTION__REPONSES_MULTIPLES:
			return reponsesMultiples != REPONSES_MULTIPLES_EDEFAULT;
		case Mm2Package.QUESTION__ETIQUETTE:
			return etiquette != null && !etiquette.isEmpty();
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
		result.append(" (ennonce: ");
		result.append(ennonce);
		result.append(", difficulte: ");
		result.append(difficulte);
		result.append(", reponsesMultiples: ");
		result.append(reponsesMultiples);
		result.append(')');
		return result.toString();
	}

} //QuestionImpl

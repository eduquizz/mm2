/**
 */
package mm2.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.Collection;
import java.util.Map;
import mm2.BoutonRetour;
import mm2.BoutonSoumettre;
import mm2.Mm2Package;
import mm2.Mm2Tables;
import mm2.Page;
import mm2.PageSoumission;

import mm2.Question;
import mm2.Questionnaire;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.ocl.pivot.evaluation.Executor;
import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;
import org.eclipse.ocl.pivot.internal.library.UnboxedCompositionProperty;
import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;
import org.eclipse.ocl.pivot.library.collection.CollectionNotEmptyOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;
import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;
import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;
import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Page Soumission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm2.impl.PageSoumissionImpl#getPagePrecedente <em>Page Precedente</em>}</li>
 *   <li>{@link mm2.impl.PageSoumissionImpl#getPageSuivante <em>Page Suivante</em>}</li>
 *   <li>{@link mm2.impl.PageSoumissionImpl#getTitre <em>Titre</em>}</li>
 *   <li>{@link mm2.impl.PageSoumissionImpl#getBoutonRetour <em>Bouton Retour</em>}</li>
 *   <li>{@link mm2.impl.PageSoumissionImpl#getBoutonSoumettre <em>Bouton Soumettre</em>}</li>
 *   <li>{@link mm2.impl.PageSoumissionImpl#getQuestion <em>Question</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PageSoumissionImpl extends MinimalEObjectImpl.Container implements PageSoumission {
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
	 * The cached value of the '{@link #getPageSuivante() <em>Page Suivante</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageSuivante()
	 * @generated
	 * @ordered
	 */
	protected Page pageSuivante;

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
	 * The cached value of the '{@link #getBoutonRetour() <em>Bouton Retour</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoutonRetour()
	 * @generated
	 * @ordered
	 */
	protected BoutonRetour boutonRetour;

	/**
	 * The cached value of the '{@link #getBoutonSoumettre() <em>Bouton Soumettre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBoutonSoumettre()
	 * @generated
	 * @ordered
	 */
	protected BoutonSoumettre boutonSoumettre;

	/**
	 * The cached value of the '{@link #getQuestion() <em>Question</em>}' reference list.
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
		return boutonSoumettre;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoutonSoumettre(BoutonSoumettre newBoutonSoumettre, NotificationChain msgs) {
		BoutonSoumettre oldBoutonSoumettre = boutonSoumettre;
		boutonSoumettre = newBoutonSoumettre;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mm2Package.PAGE_SOUMISSION__BOUTON_SOUMETTRE, oldBoutonSoumettre, newBoutonSoumettre);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoutonSoumettre(BoutonSoumettre newBoutonSoumettre) {
		if (newBoutonSoumettre != boutonSoumettre) {
			NotificationChain msgs = null;
			if (boutonSoumettre != null)
				msgs = ((InternalEObject) boutonSoumettre).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Mm2Package.PAGE_SOUMISSION__BOUTON_SOUMETTRE, null, msgs);
			if (newBoutonSoumettre != null)
				msgs = ((InternalEObject) newBoutonSoumettre).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Mm2Package.PAGE_SOUMISSION__BOUTON_SOUMETTRE, null, msgs);
			msgs = basicSetBoutonSoumettre(newBoutonSoumettre, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.PAGE_SOUMISSION__BOUTON_SOUMETTRE,
					newBoutonSoumettre, newBoutonSoumettre));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean btnRetour(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PageSoumission::btnRetour";
		try {
			/**
			 *
			 * inv btnRetour:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[1] = if
			 *           self->oclAsType(Page).Questionnaire.retourAutorise
			 *         then self.boutonRetour->notEmpty()
			 *         else self.boutonRetour->isEmpty()
			 *         endif
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Mm2Package.Literals.PAGE_SOUMISSION___BTN_RETOUR__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Mm2Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_mm2_c_c_Page_0 = idResolver
							.getClass(Mm2Tables.CLSSid_Page, null);
					final /*@NonInvalid*/ UnboxedCompositionProperty IMPPROPid_page = new UnboxedCompositionProperty(
							Mm2Tables.PROPid_page);
					final /*@NonInvalid*/ BoutonRetour boutonRetour_0 = this.getBoutonRetour();
					final /*@Thrown*/ SetValue oclAsSet_1 = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
							Mm2Tables.SET_CLSSid_BoutonRetour, boutonRetour_0);
					final /*@NonInvalid*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
							Mm2Tables.SET_CLSSid_PageSoumission, this);
					final /*@Thrown*/ Page oclAsType = (Page) OclAnyOclAsTypeOperation.INSTANCE.evaluate(executor,
							oclAsSet, TYP_mm2_c_c_Page_0);
					final /*@Thrown*/ Questionnaire Questionnaire = (Questionnaire) IMPPROPid_page.evaluate(executor,
							Mm2Tables.CLSSid_Questionnaire, oclAsType);
					if (Questionnaire == null) {
						throw new InvalidValueException(
								"Null source for \'\'http://www.example.org/mm2\'::Questionnaire::retourAutorise\'");
					}
					final /*@Thrown*/ boolean retourAutorise = Questionnaire.isRetourAutorise();
					/*@Thrown*/ boolean result;
					if (retourAutorise) {
						final /*@Thrown*/ boolean notEmpty = CollectionNotEmptyOperation.INSTANCE.evaluate(oclAsSet_1)
								.booleanValue();
						result = notEmpty;
					} else {
						final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE.evaluate(oclAsSet_1)
								.booleanValue();
						result = isEmpty;
					}
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Mm2Tables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean btnSuivant(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "PageSoumission::btnSuivant";
		try {
			/**
			 *
			 * inv btnSuivant:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[1] = self.pageSuivante->isEmpty()
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Mm2Package.Literals.PAGE_SOUMISSION___BTN_SUIVANT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Mm2Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ Page pageSuivante = this.getPageSuivante();
					final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE.evaluate(executor,
							Mm2Tables.SET_CLSSid_Page, pageSuivante);
					final /*@Thrown*/ boolean result = CollectionIsEmptyOperation.INSTANCE.evaluate(oclAsSet)
							.booleanValue();
					CAUGHT_result = result;
				} catch (Exception e) {
					CAUGHT_result = ValueUtil.createInvalidValue(e);
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, CAUGHT_result, Mm2Tables.INT_0)
						.booleanValue();
				IF_le = logDiagnostic;
			}
			return IF_le;
		} catch (Throwable e) {
			return ValueUtil.validationFailedDiagnostic(constraintName, this, diagnostics, context, e);
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Question> getQuestion() {
		if (question == null) {
			question = new EObjectResolvingEList<Question>(Question.class, this, Mm2Package.PAGE_SOUMISSION__QUESTION);
		}
		return question;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BoutonRetour getBoutonRetour() {
		return boutonRetour;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBoutonRetour(BoutonRetour newBoutonRetour, NotificationChain msgs) {
		BoutonRetour oldBoutonRetour = boutonRetour;
		boutonRetour = newBoutonRetour;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					Mm2Package.PAGE_SOUMISSION__BOUTON_RETOUR, oldBoutonRetour, newBoutonRetour);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setBoutonRetour(BoutonRetour newBoutonRetour) {
		if (newBoutonRetour != boutonRetour) {
			NotificationChain msgs = null;
			if (boutonRetour != null)
				msgs = ((InternalEObject) boutonRetour).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - Mm2Package.PAGE_SOUMISSION__BOUTON_RETOUR, null, msgs);
			if (newBoutonRetour != null)
				msgs = ((InternalEObject) newBoutonRetour).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - Mm2Package.PAGE_SOUMISSION__BOUTON_RETOUR, null, msgs);
			msgs = basicSetBoutonRetour(newBoutonRetour, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Mm2Package.PAGE_SOUMISSION__BOUTON_RETOUR,
					newBoutonRetour, newBoutonRetour));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case Mm2Package.PAGE_SOUMISSION__BOUTON_RETOUR:
			return basicSetBoutonRetour(null, msgs);
		case Mm2Package.PAGE_SOUMISSION__BOUTON_SOUMETTRE:
			return basicSetBoutonSoumettre(null, msgs);
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
		case Mm2Package.PAGE_SOUMISSION__PAGE_PRECEDENTE:
			if (resolve)
				return getPagePrecedente();
			return basicGetPagePrecedente();
		case Mm2Package.PAGE_SOUMISSION__PAGE_SUIVANTE:
			if (resolve)
				return getPageSuivante();
			return basicGetPageSuivante();
		case Mm2Package.PAGE_SOUMISSION__TITRE:
			return getTitre();
		case Mm2Package.PAGE_SOUMISSION__BOUTON_RETOUR:
			return getBoutonRetour();
		case Mm2Package.PAGE_SOUMISSION__BOUTON_SOUMETTRE:
			return getBoutonSoumettre();
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
		case Mm2Package.PAGE_SOUMISSION__PAGE_PRECEDENTE:
			setPagePrecedente((Page) newValue);
			return;
		case Mm2Package.PAGE_SOUMISSION__PAGE_SUIVANTE:
			setPageSuivante((Page) newValue);
			return;
		case Mm2Package.PAGE_SOUMISSION__TITRE:
			setTitre((String) newValue);
			return;
		case Mm2Package.PAGE_SOUMISSION__BOUTON_RETOUR:
			setBoutonRetour((BoutonRetour) newValue);
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
		case Mm2Package.PAGE_SOUMISSION__PAGE_PRECEDENTE:
			setPagePrecedente((Page) null);
			return;
		case Mm2Package.PAGE_SOUMISSION__PAGE_SUIVANTE:
			setPageSuivante((Page) null);
			return;
		case Mm2Package.PAGE_SOUMISSION__TITRE:
			setTitre(TITRE_EDEFAULT);
			return;
		case Mm2Package.PAGE_SOUMISSION__BOUTON_RETOUR:
			setBoutonRetour((BoutonRetour) null);
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
		case Mm2Package.PAGE_SOUMISSION__PAGE_PRECEDENTE:
			return pagePrecedente != null;
		case Mm2Package.PAGE_SOUMISSION__PAGE_SUIVANTE:
			return pageSuivante != null;
		case Mm2Package.PAGE_SOUMISSION__TITRE:
			return TITRE_EDEFAULT == null ? titre != null : !TITRE_EDEFAULT.equals(titre);
		case Mm2Package.PAGE_SOUMISSION__BOUTON_RETOUR:
			return boutonRetour != null;
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Mm2Package.PAGE_SOUMISSION___BTN_RETOUR__DIAGNOSTICCHAIN_MAP:
			return btnRetour((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Mm2Package.PAGE_SOUMISSION___BTN_SUIVANT__DIAGNOSTICCHAIN_MAP:
			return btnSuivant((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		}
		return super.eInvoke(operationID, arguments);
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

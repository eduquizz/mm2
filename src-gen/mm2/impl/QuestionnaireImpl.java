/**
 */
package mm2.impl;

import java.lang.reflect.InvocationTargetException;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import mm2.BoutonRetour;
import mm2.Mm2Package;
import mm2.Mm2Tables;
import mm2.Navigable;
import mm2.Page;
import mm2.PageQuestion;
import mm2.Questionnaire;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.eclipse.ocl.pivot.evaluation.Executor;

import org.eclipse.ocl.pivot.ids.IdResolver;
import org.eclipse.ocl.pivot.ids.TypeId;

import org.eclipse.ocl.pivot.library.collection.CollectionIsEmptyOperation;

import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsSetOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclAsTypeOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsKindOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclAnyOclIsTypeOfOperation;
import org.eclipse.ocl.pivot.library.oclany.OclComparableLessThanEqualOperation;

import org.eclipse.ocl.pivot.library.string.CGStringGetSeverityOperation;
import org.eclipse.ocl.pivot.library.string.CGStringLogDiagnosticOperation;

import org.eclipse.ocl.pivot.messages.PivotMessages;

import org.eclipse.ocl.pivot.utilities.PivotUtil;
import org.eclipse.ocl.pivot.utilities.ValueUtil;

import org.eclipse.ocl.pivot.values.IntegerValue;
import org.eclipse.ocl.pivot.values.InvalidValueException;
import org.eclipse.ocl.pivot.values.OrderedSetValue;
import org.eclipse.ocl.pivot.values.SetValue;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Questionnaire</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link mm2.impl.QuestionnaireImpl#getPage <em>Page</em>}</li>
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
	public boolean boutonRetourInterdit(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Questionnaire::boutonRetourInterdit";
		try {
			/**
			 *
			 * inv boutonRetourInterdit:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let result : Boolean[?] = self.retourAutorise = false implies
			 *         self.page->forAll(p |
			 *           p.oclIsTypeOf(PageQuestion) implies
			 *           p.oclAsType(PageQuestion)
			 *           .boutonRetour->isEmpty())
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Mm2Package.Literals.QUESTIONNAIRE___BOUTON_RETOUR_INTERDIT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Mm2Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ boolean retourAutorise = this.isRetourAutorise();
					final /*@NonInvalid*/ boolean eq = !retourAutorise;
					final /*@Thrown*/ Boolean result;
					if (!eq) {
						result = ValueUtil.TRUE_VALUE;
					} else {
						/*@Caught*/ Object CAUGHT_forAll;
						try {
							final /*@NonInvalid*/ List<Page> page = this.getPage();
							final /*@NonInvalid*/ OrderedSetValue BOXED_page = idResolver
									.createOrderedSetOfAll(Mm2Tables.ORD_CLSSid_Page, page);
							/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
							Iterator<Object> ITERATOR_p = BOXED_page.iterator();
							/*@Thrown*/ Boolean forAll;
							while (true) {
								if (!ITERATOR_p.hasNext()) {
									if (accumulator == null) {
										forAll = null;
									} else if (accumulator == ValueUtil.TRUE_VALUE) {
										forAll = ValueUtil.TRUE_VALUE;
									} else {
										throw (InvalidValueException) accumulator;
									}
									break;
								}
								/*@NonInvalid*/ Page p = (Page) ITERATOR_p.next();
								/**
								 *
								 * p.oclIsTypeOf(PageQuestion) implies
								 * p.oclAsType(PageQuestion)
								 * .boutonRetour->isEmpty()
								 */
								/*@Caught*/ Object CAUGHT_implies;
								try {
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_mm2_c_c_PageQuestion_0 = idResolver
											.getClass(Mm2Tables.CLSSid_PageQuestion, null);
									final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
											.evaluate(executor, p, TYP_mm2_c_c_PageQuestion_0).booleanValue();
									final /*@Thrown*/ Boolean implies;
									if (!oclIsTypeOf) {
										implies = ValueUtil.TRUE_VALUE;
									} else {
										/*@Caught*/ Object CAUGHT_isEmpty;
										try {
											final /*@Thrown*/ PageQuestion oclAsType = (PageQuestion) OclAnyOclAsTypeOperation.INSTANCE
													.evaluate(executor, p, TYP_mm2_c_c_PageQuestion_0);
											final /*@Thrown*/ BoutonRetour boutonRetour = oclAsType.getBoutonRetour();
											final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE
													.evaluate(executor, Mm2Tables.SET_CLSSid_BoutonRetour,
															boutonRetour);
											final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE
													.evaluate(oclAsSet).booleanValue();
											CAUGHT_isEmpty = isEmpty;
										} catch (Exception e) {
											CAUGHT_isEmpty = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_isEmpty == ValueUtil.TRUE_VALUE) {
											implies = ValueUtil.TRUE_VALUE;
										} else {
											if (CAUGHT_isEmpty instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_isEmpty;
											}
											implies = ValueUtil.FALSE_VALUE;
										}
									}
									CAUGHT_implies = implies;
								} catch (Exception e) {
									CAUGHT_implies = ValueUtil.createInvalidValue(e);
								}
								//
								if (CAUGHT_implies == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
									forAll = ValueUtil.FALSE_VALUE;
									break; // Stop immediately
								} else if (CAUGHT_implies == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
									; // Carry on
								} else if (CAUGHT_implies == null) { // Abnormal null body evaluation result
									if (accumulator == ValueUtil.TRUE_VALUE) {
										accumulator = null; // Cache a null failure
									}
								} else if (CAUGHT_implies instanceof InvalidValueException) { // Abnormal exception evaluation result
									accumulator = CAUGHT_implies; // Cache an exception failure
								} else { // Impossible badly typed result
									accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
								}
							}
							CAUGHT_forAll = forAll;
						} catch (Exception e) {
							CAUGHT_forAll = ValueUtil.createInvalidValue(e);
						}
						if (CAUGHT_forAll == ValueUtil.TRUE_VALUE) {
							result = ValueUtil.TRUE_VALUE;
						} else {
							if (CAUGHT_forAll instanceof InvalidValueException) {
								throw (InvalidValueException) CAUGHT_forAll;
							}
							if (CAUGHT_forAll == null) {
								result = null;
							} else {
								result = ValueUtil.FALSE_VALUE;
							}
						}
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
	public boolean auMoinsUneSoumission(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Questionnaire::auMoinsUneSoumission";
		try {
			/**
			 *
			 * inv auMoinsUneSoumission:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = page->exists(p |
			 *           p.oclIsTypeOf(PageSoumission))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Mm2Package.Literals.QUESTIONNAIRE___AU_MOINS_UNE_SOUMISSION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Mm2Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<Page> page = this.getPage();
				final /*@NonInvalid*/ OrderedSetValue BOXED_page = idResolver
						.createOrderedSetOfAll(Mm2Tables.ORD_CLSSid_Page, page);
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_p = BOXED_page.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_p.hasNext()) {
						if (accumulator == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Page p = (Page) ITERATOR_p.next();
					/**
					 * p.oclIsTypeOf(PageSoumission)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_mm2_c_c_PageSoumission = idResolver
							.getClass(Mm2Tables.CLSSid_PageSoumission, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
							.evaluate(executor, p, TYP_mm2_c_c_PageSoumission).booleanValue();
					//
					if (oclIsTypeOf) { // Normal successful body evaluation result
						result = ValueUtil.TRUE_VALUE;
						break; // Stop immediately
					} else if (!oclIsTypeOf) { // Normal unsuccessful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, Mm2Tables.INT_0)
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
	public boolean auMoinsUneResult(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Questionnaire::auMoinsUneResult";
		try {
			/**
			 *
			 * inv auMoinsUneResult:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = page->exists(p |
			 *           p.oclIsTypeOf(PageResultat))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Mm2Package.Literals.QUESTIONNAIRE___AU_MOINS_UNE_RESULT__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Mm2Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<Page> page = this.getPage();
				final /*@NonInvalid*/ OrderedSetValue BOXED_page = idResolver
						.createOrderedSetOfAll(Mm2Tables.ORD_CLSSid_Page, page);
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_p = BOXED_page.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_p.hasNext()) {
						if (accumulator == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Page p = (Page) ITERATOR_p.next();
					/**
					 * p.oclIsTypeOf(PageResultat)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_mm2_c_c_PageResultat = idResolver
							.getClass(Mm2Tables.CLSSid_PageResultat, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
							.evaluate(executor, p, TYP_mm2_c_c_PageResultat).booleanValue();
					//
					if (oclIsTypeOf) { // Normal successful body evaluation result
						result = ValueUtil.TRUE_VALUE;
						break; // Stop immediately
					} else if (!oclIsTypeOf) { // Normal unsuccessful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, Mm2Tables.INT_0)
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
	public boolean auMoinsUneQuestion(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Questionnaire::auMoinsUneQuestion";
		try {
			/**
			 *
			 * inv auMoinsUneQuestion:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = page->exists(p |
			 *           p.oclIsTypeOf(PageQuestion))
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Mm2Package.Literals.QUESTIONNAIRE___AU_MOINS_UNE_QUESTION__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Mm2Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				final /*@NonInvalid*/ List<Page> page = this.getPage();
				final /*@NonInvalid*/ OrderedSetValue BOXED_page = idResolver
						.createOrderedSetOfAll(Mm2Tables.ORD_CLSSid_Page, page);
				/*@Thrown*/ Object accumulator = ValueUtil.FALSE_VALUE;
				Iterator<Object> ITERATOR_p = BOXED_page.iterator();
				/*@NonInvalid*/ Boolean result;
				while (true) {
					if (!ITERATOR_p.hasNext()) {
						if (accumulator == ValueUtil.FALSE_VALUE) {
							result = ValueUtil.FALSE_VALUE;
						} else {
							throw (InvalidValueException) accumulator;
						}
						break;
					}
					/*@NonInvalid*/ Page p = (Page) ITERATOR_p.next();
					/**
					 * p.oclIsTypeOf(PageQuestion)
					 */
					final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_mm2_c_c_PageQuestion = idResolver
							.getClass(Mm2Tables.CLSSid_PageQuestion, null);
					final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
							.evaluate(executor, p, TYP_mm2_c_c_PageQuestion).booleanValue();
					//
					if (oclIsTypeOf) { // Normal successful body evaluation result
						result = ValueUtil.TRUE_VALUE;
						break; // Stop immediately
					} else if (!oclIsTypeOf) { // Normal unsuccessful body evaluation result
						; // Carry on
					} else { // Impossible badly typed result
						accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "exists");
					}
				}
				final /*@NonInvalid*/ boolean logDiagnostic = CGStringLogDiagnosticOperation.INSTANCE
						.evaluate(executor, TypeId.BOOLEAN, constraintName, this, (Object) null, diagnostics, context,
								(Object) null, severity_0, result, Mm2Tables.INT_0)
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
	public boolean questionPrecedente(final DiagnosticChain diagnostics, final Map<Object, Object> context) {
		final String constraintName = "Questionnaire::questionPrecedente";
		try {
			/**
			 *
			 * inv questionPrecedente:
			 *   let severity : Integer[1] = constraintName.getSeverity()
			 *   in
			 *     if severity <= 0
			 *     then true
			 *     else
			 *       let
			 *         result : Boolean[?] = self.page->forAll(p |
			 *           p.oclIsTypeOf(PageQuestion) and not self.retourAutorise implies
			 *           p.oclIsKindOf(Navigable) and
			 *           p.oclAsType(Navigable)
			 *           .pagePrecedente->isEmpty())
			 *       in
			 *         constraintName.logDiagnostic(self, null, diagnostics, context, null, severity, result, 0)
			 *     endif
			 */
			final /*@NonInvalid*/ Executor executor = PivotUtil.getExecutor(this);
			final /*@NonInvalid*/ IdResolver idResolver = executor.getIdResolver();
			final /*@NonInvalid*/ IntegerValue severity_0 = CGStringGetSeverityOperation.INSTANCE.evaluate(executor,
					Mm2Package.Literals.QUESTIONNAIRE___QUESTION_PRECEDENTE__DIAGNOSTICCHAIN_MAP);
			final /*@NonInvalid*/ boolean le = OclComparableLessThanEqualOperation.INSTANCE
					.evaluate(executor, severity_0, Mm2Tables.INT_0).booleanValue();
			/*@NonInvalid*/ boolean IF_le;
			if (le) {
				IF_le = true;
			} else {
				/*@Caught*/ Object CAUGHT_result;
				try {
					final /*@NonInvalid*/ List<Page> page = this.getPage();
					final /*@NonInvalid*/ OrderedSetValue BOXED_page = idResolver
							.createOrderedSetOfAll(Mm2Tables.ORD_CLSSid_Page, page);
					/*@Thrown*/ Object accumulator = ValueUtil.TRUE_VALUE;
					Iterator<Object> ITERATOR_p = BOXED_page.iterator();
					/*@Thrown*/ Boolean result;
					while (true) {
						if (!ITERATOR_p.hasNext()) {
							if (accumulator == null) {
								result = null;
							} else if (accumulator == ValueUtil.TRUE_VALUE) {
								result = ValueUtil.TRUE_VALUE;
							} else {
								throw (InvalidValueException) accumulator;
							}
							break;
						}
						/*@NonInvalid*/ Page p = (Page) ITERATOR_p.next();
						/**
						 *
						 * p.oclIsTypeOf(PageQuestion) and not self.retourAutorise implies
						 * p.oclIsKindOf(Navigable) and
						 * p.oclAsType(Navigable)
						 * .pagePrecedente->isEmpty()
						 */
						/*@Caught*/ Object CAUGHT_implies;
						try {
							/*@Caught*/ Object CAUGHT_and;
							try {
								final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_mm2_c_c_PageQuestion_0 = idResolver
										.getClass(Mm2Tables.CLSSid_PageQuestion, null);
								final /*@NonInvalid*/ boolean oclIsTypeOf = OclAnyOclIsTypeOfOperation.INSTANCE
										.evaluate(executor, p, TYP_mm2_c_c_PageQuestion_0).booleanValue();
								final /*@Thrown*/ Boolean and;
								if (!oclIsTypeOf) {
									and = ValueUtil.FALSE_VALUE;
								} else {
									final /*@NonInvalid*/ boolean retourAutorise = this.isRetourAutorise();
									final /*@NonInvalid*/ Boolean not;
									if (!retourAutorise) {
										not = ValueUtil.TRUE_VALUE;
									} else {
										if (retourAutorise) {
											not = ValueUtil.FALSE_VALUE;
										} else {
											not = null;
										}
									}
									if (not == ValueUtil.FALSE_VALUE) {
										and = ValueUtil.FALSE_VALUE;
									} else {
										if (not == null) {
											and = null;
										} else {
											and = ValueUtil.TRUE_VALUE;
										}
									}
								}
								CAUGHT_and = and;
							} catch (Exception e) {
								CAUGHT_and = ValueUtil.createInvalidValue(e);
							}
							final /*@Thrown*/ Boolean implies;
							if (CAUGHT_and == ValueUtil.FALSE_VALUE) {
								implies = ValueUtil.TRUE_VALUE;
							} else {
								/*@Caught*/ Object CAUGHT_and_0;
								try {
									final /*@NonInvalid*/ org.eclipse.ocl.pivot.Class TYP_mm2_c_c_Navigable = idResolver
											.getClass(Mm2Tables.CLSSid_Navigable, null);
									final /*@NonInvalid*/ boolean oclIsKindOf = OclAnyOclIsKindOfOperation.INSTANCE
											.evaluate(executor, p, TYP_mm2_c_c_Navigable).booleanValue();
									final /*@Thrown*/ Boolean and_0;
									if (!oclIsKindOf) {
										and_0 = ValueUtil.FALSE_VALUE;
									} else {
										/*@Caught*/ Object CAUGHT_isEmpty;
										try {
											final /*@Thrown*/ Navigable oclAsType = (Navigable) OclAnyOclAsTypeOperation.INSTANCE
													.evaluate(executor, p, TYP_mm2_c_c_Navigable);
											final /*@Thrown*/ Page pagePrecedente = oclAsType.getPagePrecedente();
											final /*@Thrown*/ SetValue oclAsSet = OclAnyOclAsSetOperation.INSTANCE
													.evaluate(executor, Mm2Tables.SET_CLSSid_Page, pagePrecedente);
											final /*@Thrown*/ boolean isEmpty = CollectionIsEmptyOperation.INSTANCE
													.evaluate(oclAsSet).booleanValue();
											CAUGHT_isEmpty = isEmpty;
										} catch (Exception e) {
											CAUGHT_isEmpty = ValueUtil.createInvalidValue(e);
										}
										if (CAUGHT_isEmpty == ValueUtil.FALSE_VALUE) {
											and_0 = ValueUtil.FALSE_VALUE;
										} else {
											if (CAUGHT_isEmpty instanceof InvalidValueException) {
												throw (InvalidValueException) CAUGHT_isEmpty;
											}
											and_0 = ValueUtil.TRUE_VALUE;
										}
									}
									CAUGHT_and_0 = and_0;
								} catch (Exception e) {
									CAUGHT_and_0 = ValueUtil.createInvalidValue(e);
								}
								if (CAUGHT_and_0 == ValueUtil.TRUE_VALUE) {
									implies = ValueUtil.TRUE_VALUE;
								} else {
									if (CAUGHT_and instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and;
									}
									if (CAUGHT_and_0 instanceof InvalidValueException) {
										throw (InvalidValueException) CAUGHT_and_0;
									}
									if ((CAUGHT_and == null) || (CAUGHT_and_0 == null)) {
										implies = null;
									} else {
										implies = ValueUtil.FALSE_VALUE;
									}
								}
							}
							CAUGHT_implies = implies;
						} catch (Exception e) {
							CAUGHT_implies = ValueUtil.createInvalidValue(e);
						}
						//
						if (CAUGHT_implies == ValueUtil.FALSE_VALUE) { // Normal unsuccessful body evaluation result
							result = ValueUtil.FALSE_VALUE;
							break; // Stop immediately
						} else if (CAUGHT_implies == ValueUtil.TRUE_VALUE) { // Normal successful body evaluation result
							; // Carry on
						} else if (CAUGHT_implies == null) { // Abnormal null body evaluation result
							if (accumulator == ValueUtil.TRUE_VALUE) {
								accumulator = null; // Cache a null failure
							}
						} else if (CAUGHT_implies instanceof InvalidValueException) { // Abnormal exception evaluation result
							accumulator = CAUGHT_implies; // Cache an exception failure
						} else { // Impossible badly typed result
							accumulator = new InvalidValueException(PivotMessages.NonBooleanBody, "forAll");
						}
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
	@SuppressWarnings("unchecked")
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
		case Mm2Package.QUESTIONNAIRE___BOUTON_RETOUR_INTERDIT__DIAGNOSTICCHAIN_MAP:
			return boutonRetourInterdit((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Mm2Package.QUESTIONNAIRE___AU_MOINS_UNE_SOUMISSION__DIAGNOSTICCHAIN_MAP:
			return auMoinsUneSoumission((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Mm2Package.QUESTIONNAIRE___AU_MOINS_UNE_RESULT__DIAGNOSTICCHAIN_MAP:
			return auMoinsUneResult((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Mm2Package.QUESTIONNAIRE___AU_MOINS_UNE_QUESTION__DIAGNOSTICCHAIN_MAP:
			return auMoinsUneQuestion((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
		case Mm2Package.QUESTIONNAIRE___QUESTION_PRECEDENTE__DIAGNOSTICCHAIN_MAP:
			return questionPrecedente((DiagnosticChain) arguments.get(0), (Map<Object, Object>) arguments.get(1));
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
		result.append(" (nom: ");
		result.append(nom);
		result.append(", retourAutorise: ");
		result.append(retourAutorise);
		result.append(')');
		return result.toString();
	}

} //QuestionnaireImpl

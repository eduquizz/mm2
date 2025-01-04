/**
 */
package mm2.util;

import java.util.Map;

import mm2.*;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see mm2.Mm2Package
 * @generated
 */
public class Mm2Validator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Mm2Validator INSTANCE = new Mm2Validator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "mm2";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Bouton Retour Interdit' of 'Questionnaire'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE__BOUTON_RETOUR_INTERDIT = 1;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Au Moins Une Soumission' of 'Questionnaire'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE__AU_MOINS_UNE_SOUMISSION = 2;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Au Moins Une Result' of 'Questionnaire'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE__AU_MOINS_UNE_RESULT = 3;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Au Moins Une Question' of 'Questionnaire'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE__AU_MOINS_UNE_QUESTION = 4;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Question Precedente' of 'Questionnaire'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTIONNAIRE__QUESTION_PRECEDENTE = 5;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Bouton Retour Interdit' of 'Page Question'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE_QUESTION__BOUTON_RETOUR_INTERDIT = 6;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Visibilite Btn Suivant' of 'Page Question'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE_QUESTION__VISIBILITE_BTN_SUIVANT = 7;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Suivant Impossible' of 'Page Soumission'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int PAGE_SOUMISSION__SUIVANT_IMPOSSIBLE = 8;

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Ennonce Pas Vide' of 'Question'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int QUESTION__ENNONCE_PAS_VIDE = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 9;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mm2Validator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
		return Mm2Package.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		switch (classifierID) {
		case Mm2Package.QUESTIONNAIRE:
			return validateQuestionnaire((Questionnaire) value, diagnostics, context);
		case Mm2Package.PAGE:
			return validatePage((Page) value, diagnostics, context);
		case Mm2Package.BOUTON:
			return validateBouton((Bouton) value, diagnostics, context);
		case Mm2Package.NAVIGABLE:
			return validateNavigable((Navigable) value, diagnostics, context);
		case Mm2Package.PAGE_QUESTION:
			return validatePageQuestion((PageQuestion) value, diagnostics, context);
		case Mm2Package.PAGE_SOUMISSION:
			return validatePageSoumission((PageSoumission) value, diagnostics, context);
		case Mm2Package.PAGE_RESULTAT:
			return validatePageResultat((PageResultat) value, diagnostics, context);
		case Mm2Package.QUESTION:
			return validateQuestion((Question) value, diagnostics, context);
		case Mm2Package.REPONSE:
			return validateReponse((Reponse) value, diagnostics, context);
		case Mm2Package.BOUTON_SOUMETTRE:
			return validateBoutonSoumettre((BoutonSoumettre) value, diagnostics, context);
		case Mm2Package.BOUTON_SUIVANT:
			return validateBoutonSuivant((BoutonSuivant) value, diagnostics, context);
		case Mm2Package.BOUTON_RETOUR:
			return validateBoutonRetour((BoutonRetour) value, diagnostics, context);
		case Mm2Package.ETIQUETTE:
			return validateEtiquette((Etiquette) value, diagnostics, context);
		default:
			return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaire(Questionnaire questionnaire, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(questionnaire, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(questionnaire, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(questionnaire, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(questionnaire, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(questionnaire, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(questionnaire, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(questionnaire, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(questionnaire, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(questionnaire, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateQuestionnaire_questionPrecedente(questionnaire, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateQuestionnaire_boutonRetourInterdit(questionnaire, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateQuestionnaire_auMoinsUneSoumission(questionnaire, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateQuestionnaire_auMoinsUneResult(questionnaire, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateQuestionnaire_auMoinsUneQuestion(questionnaire, diagnostics, context);
		return result;
	}

	/**
	 * Validates the questionPrecedente constraint of '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaire_questionPrecedente(Questionnaire questionnaire, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaire.questionPrecedente(diagnostics, context);
	}

	/**
	 * Validates the boutonRetourInterdit constraint of '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaire_boutonRetourInterdit(Questionnaire questionnaire, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaire.boutonRetourInterdit(diagnostics, context);
	}

	/**
	 * Validates the auMoinsUneSoumission constraint of '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaire_auMoinsUneSoumission(Questionnaire questionnaire, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaire.auMoinsUneSoumission(diagnostics, context);
	}

	/**
	 * Validates the auMoinsUneResult constraint of '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaire_auMoinsUneResult(Questionnaire questionnaire, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaire.auMoinsUneResult(diagnostics, context);
	}

	/**
	 * Validates the auMoinsUneQuestion constraint of '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestionnaire_auMoinsUneQuestion(Questionnaire questionnaire, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return questionnaire.auMoinsUneQuestion(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePage(Page page, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(page, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBouton(Bouton bouton, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(bouton, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNavigable(Navigable navigable, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(navigable, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageQuestion(PageQuestion pageQuestion, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pageQuestion, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(pageQuestion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(pageQuestion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(pageQuestion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(pageQuestion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(pageQuestion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(pageQuestion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(pageQuestion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(pageQuestion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePageQuestion_visibiliteBtnSuivant(pageQuestion, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePageQuestion_boutonRetourInterdit(pageQuestion, diagnostics, context);
		return result;
	}

	/**
	 * Validates the visibiliteBtnSuivant constraint of '<em>Page Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageQuestion_visibiliteBtnSuivant(PageQuestion pageQuestion, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return pageQuestion.visibiliteBtnSuivant(diagnostics, context);
	}

	/**
	 * Validates the boutonRetourInterdit constraint of '<em>Page Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageQuestion_boutonRetourInterdit(PageQuestion pageQuestion, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return pageQuestion.boutonRetourInterdit(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageSoumission(PageSoumission pageSoumission, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		if (!validate_NoCircularContainment(pageSoumission, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(pageSoumission, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(pageSoumission, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(pageSoumission, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(pageSoumission, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(pageSoumission, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(pageSoumission, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(pageSoumission, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(pageSoumission, diagnostics, context);
		if (result || diagnostics != null)
			result &= validatePageSoumission_suivantImpossible(pageSoumission, diagnostics, context);
		return result;
	}

	/**
	 * Validates the suivantImpossible constraint of '<em>Page Soumission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageSoumission_suivantImpossible(PageSoumission pageSoumission, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return pageSoumission.suivantImpossible(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePageResultat(PageResultat pageResultat, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pageResultat, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion(Question question, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(question, diagnostics, context))
			return false;
		boolean result = validate_EveryMultiplicityConforms(question, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryDataValueConforms(question, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryReferenceIsContained(question, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryBidirectionalReferenceIsPaired(question, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryProxyResolves(question, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_UniqueID(question, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryKeyUnique(question, diagnostics, context);
		if (result || diagnostics != null)
			result &= validate_EveryMapEntryUnique(question, diagnostics, context);
		if (result || diagnostics != null)
			result &= validateQuestion_ennoncePasVide(question, diagnostics, context);
		return result;
	}

	/**
	 * Validates the ennoncePasVide constraint of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateQuestion_ennoncePasVide(Question question, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return question.ennoncePasVide(diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateReponse(Reponse reponse, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(reponse, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoutonSoumettre(BoutonSoumettre boutonSoumettre, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boutonSoumettre, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoutonSuivant(BoutonSuivant boutonSuivant, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boutonSuivant, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateBoutonRetour(BoutonRetour boutonRetour, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(boutonRetour, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateEtiquette(Etiquette etiquette, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(etiquette, diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Mm2Validator

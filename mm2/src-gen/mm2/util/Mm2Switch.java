/**
 */
package mm2.util;

import mm2.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see mm2.Mm2Package
 * @generated
 */
public class Mm2Switch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Mm2Package modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mm2Switch() {
		if (modelPackage == null) {
			modelPackage = Mm2Package.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case Mm2Package.QUESTIONNAIRE: {
			Questionnaire questionnaire = (Questionnaire) theEObject;
			T result = caseQuestionnaire(questionnaire);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mm2Package.PAGE: {
			Page page = (Page) theEObject;
			T result = casePage(page);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mm2Package.BOUTON: {
			Bouton bouton = (Bouton) theEObject;
			T result = caseBouton(bouton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mm2Package.NAVIGABLE: {
			Navigable navigable = (Navigable) theEObject;
			T result = caseNavigable(navigable);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mm2Package.PAGE_QUESTION: {
			PageQuestion pageQuestion = (PageQuestion) theEObject;
			T result = casePageQuestion(pageQuestion);
			if (result == null)
				result = caseNavigable(pageQuestion);
			if (result == null)
				result = casePage(pageQuestion);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mm2Package.PAGE_SOUMISSION: {
			PageSoumission pageSoumission = (PageSoumission) theEObject;
			T result = casePageSoumission(pageSoumission);
			if (result == null)
				result = caseNavigable(pageSoumission);
			if (result == null)
				result = casePage(pageSoumission);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mm2Package.PAGE_RESULTAT: {
			PageResultat pageResultat = (PageResultat) theEObject;
			T result = casePageResultat(pageResultat);
			if (result == null)
				result = casePage(pageResultat);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mm2Package.QUESTION: {
			Question question = (Question) theEObject;
			T result = caseQuestion(question);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mm2Package.REPONSE: {
			Reponse reponse = (Reponse) theEObject;
			T result = caseReponse(reponse);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mm2Package.BOUTON_SOUMETTRE: {
			BoutonSoumettre boutonSoumettre = (BoutonSoumettre) theEObject;
			T result = caseBoutonSoumettre(boutonSoumettre);
			if (result == null)
				result = caseBouton(boutonSoumettre);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mm2Package.BOUTON_SUIVANT: {
			BoutonSuivant boutonSuivant = (BoutonSuivant) theEObject;
			T result = caseBoutonSuivant(boutonSuivant);
			if (result == null)
				result = caseBouton(boutonSuivant);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mm2Package.BOUTON_RETOUR: {
			BoutonRetour boutonRetour = (BoutonRetour) theEObject;
			T result = caseBoutonRetour(boutonRetour);
			if (result == null)
				result = caseBouton(boutonRetour);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case Mm2Package.ETIQUETTE: {
			Etiquette etiquette = (Etiquette) theEObject;
			T result = caseEtiquette(etiquette);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Questionnaire</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestionnaire(Questionnaire object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePage(Page object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bouton</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bouton</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBouton(Bouton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Navigable</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Navigable</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNavigable(Navigable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageQuestion(PageQuestion object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Soumission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Soumission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageSoumission(PageSoumission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Page Resultat</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Page Resultat</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePageResultat(PageResultat object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Question</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Question</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseQuestion(Question object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reponse</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reponse</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReponse(Reponse object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bouton Soumettre</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bouton Soumettre</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoutonSoumettre(BoutonSoumettre object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bouton Suivant</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bouton Suivant</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoutonSuivant(BoutonSuivant object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Bouton Retour</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Bouton Retour</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBoutonRetour(BoutonRetour object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Etiquette</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Etiquette</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEtiquette(Etiquette object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //Mm2Switch

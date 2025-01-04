/**
 */
package mm2.util;

import mm2.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see mm2.Mm2Package
 * @generated
 */
public class Mm2AdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static Mm2Package modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Mm2AdapterFactory() {
		if (modelPackage == null) {
			modelPackage = Mm2Package.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Mm2Switch<Adapter> modelSwitch = new Mm2Switch<Adapter>() {
		@Override
		public Adapter caseQuestionnaire(Questionnaire object) {
			return createQuestionnaireAdapter();
		}

		@Override
		public Adapter casePage(Page object) {
			return createPageAdapter();
		}

		@Override
		public Adapter caseBouton(Bouton object) {
			return createBoutonAdapter();
		}

		@Override
		public Adapter caseNavigable(Navigable object) {
			return createNavigableAdapter();
		}

		@Override
		public Adapter casePageQuestion(PageQuestion object) {
			return createPageQuestionAdapter();
		}

		@Override
		public Adapter casePageSoumission(PageSoumission object) {
			return createPageSoumissionAdapter();
		}

		@Override
		public Adapter casePageResultat(PageResultat object) {
			return createPageResultatAdapter();
		}

		@Override
		public Adapter caseQuestion(Question object) {
			return createQuestionAdapter();
		}

		@Override
		public Adapter caseReponse(Reponse object) {
			return createReponseAdapter();
		}

		@Override
		public Adapter caseBoutonSoumettre(BoutonSoumettre object) {
			return createBoutonSoumettreAdapter();
		}

		@Override
		public Adapter caseBoutonSuivant(BoutonSuivant object) {
			return createBoutonSuivantAdapter();
		}

		@Override
		public Adapter caseBoutonRetour(BoutonRetour object) {
			return createBoutonRetourAdapter();
		}

		@Override
		public Adapter caseEtiquette(Etiquette object) {
			return createEtiquetteAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm2.Questionnaire <em>Questionnaire</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm2.Questionnaire
	 * @generated
	 */
	public Adapter createQuestionnaireAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm2.Page <em>Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm2.Page
	 * @generated
	 */
	public Adapter createPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm2.Bouton <em>Bouton</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm2.Bouton
	 * @generated
	 */
	public Adapter createBoutonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm2.Navigable <em>Navigable</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm2.Navigable
	 * @generated
	 */
	public Adapter createNavigableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm2.PageQuestion <em>Page Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm2.PageQuestion
	 * @generated
	 */
	public Adapter createPageQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm2.PageSoumission <em>Page Soumission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm2.PageSoumission
	 * @generated
	 */
	public Adapter createPageSoumissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm2.PageResultat <em>Page Resultat</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm2.PageResultat
	 * @generated
	 */
	public Adapter createPageResultatAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm2.Question <em>Question</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm2.Question
	 * @generated
	 */
	public Adapter createQuestionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm2.Reponse <em>Reponse</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm2.Reponse
	 * @generated
	 */
	public Adapter createReponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm2.BoutonSoumettre <em>Bouton Soumettre</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm2.BoutonSoumettre
	 * @generated
	 */
	public Adapter createBoutonSoumettreAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm2.BoutonSuivant <em>Bouton Suivant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm2.BoutonSuivant
	 * @generated
	 */
	public Adapter createBoutonSuivantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm2.BoutonRetour <em>Bouton Retour</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm2.BoutonRetour
	 * @generated
	 */
	public Adapter createBoutonRetourAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link mm2.Etiquette <em>Etiquette</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see mm2.Etiquette
	 * @generated
	 */
	public Adapter createEtiquetteAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //Mm2AdapterFactory

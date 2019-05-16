package fr.natsystem.main; // definition du package dans lequel se trouve la classe

import fr.natsystem.datamodel.Client; // exemple d'import de code dans notre projet
import fr.natsystem.datamodel.Compte;
import fr.natsystem.datamodel.Epargne;
import fr.natsystem.services.Calculs;

public class Main {
	
	public static void main(String[] args) {
		// public : visible dans tout le projet
		// static : indépendant l'instance de la classe
		// void : aucun retour attendu en fin de méthode
		// String[] args : tableau de chaine de caractère correspondant
		// aux arguments qu'on lui passe
		
		
		System.out.println("Hello world !");
		Client premierClient = new Client();
		Client deuxiemeClient = new Client("bob", "3 rue de la republique");
		System.out.println(deuxiemeClient.getNom());
		System.out.println(premierClient.getNom());
		// appuyer sur ctrl + espace pour auto compléter
		// ctrl + shift + O pour gérer tous les imports automatiquement
		double perimetre;  // variable
		perimetre = 8;
		
		String test;
		test = "une deuxieme chaine";
		
		//TODO changer le nom du deuxième client
		deuxiemeClient.setNom("Boris");
		deuxiemeClient.setNom("Jean");
		
		
		Calculs.addition(5, 8);
		
		Epargne epargne = new Epargne();
		Compte compte = new Epargne();
		System.out.println(compte.getClass());
		
	}
	
	// En cas de debug 
	// - double clic sur la marge pour ajouter un point d'arret
	// des qu'on voit une ligne verte le code est arreté
	// F6 chaque fois qu'on veut exectuer une ligne
	// F5 si on veut rentrer dans une methode 
	// F8 pour refaire tourner le code normalement jusqu'au prochain point d'arret
}

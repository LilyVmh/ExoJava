package fr.natsystem.main;

import java.util.Scanner;

import fr.natsystem.datamodel.Client;
import fr.natsystem.datamodel.Epargne;

public class AutreMain {

	
	public static void main(String[] args) {
		
		//creation des objets et valorisation des attributs
//		Scanner scanner = new Scanner(System.in); // initialisation du scanner pour prendre les saisies
//		System.out.println("Entrez le nom du client :");
//		String nom =  scanner.nextLine(); // on demande la saisie du nom via console
//		System.out.println("Entrez l'adresse du client :");
//		String adresse = scanner.nextLine(); // puis adresse
//		Client client = new Client(nom, adresse); // on initialise un client avec le nom et l'adresse précédemment saisis
//		Epargne compteEpargne = new Epargne();
//		
//		System.out.println("Entrez le solde initial du client :");
//		double solde = scanner.nextDouble(); // on demande la saisie du solde initial
//		System.out.println("Entrez le taux d'intérêt du client :");
//		double tauxInteret = scanner.nextDouble(); // puis du taux d'intérêt
//		compteEpargne.setSolde(solde); // on met cette saisie comme attribut du compte d'épargne
//		compteEpargne.setTauxInteret(tauxInteret); //ainsi que le taux d'intérêt
//		
//		
//		//application des méthodes retraitArgent et calculInteret sur le compte
//		
//		System.out.println("Entrez le montant que vous souhaitez retirer :");
//		double montantARetirer = scanner.nextDouble(); // on demande une saisie du montant à retirer
//		compteEpargne.retraitArgent(montantARetirer); // on retire le montant saisi
//		compteEpargne.calculInteret(); // on applique l'intéret annuel
//		
//
//		//affichage des différents attributs
//		System.out.println("Le client s'appelle " + client.getNom());
//		System.out.println("Il habite " + client.getAdresse());
//		double tauxEnPourcentage = (compteEpargne.getTauxInteret() -1) * 100;
//		System.out.println("Il possède un taux à " + tauxEnPourcentage + "%");
//		System.out.println("Il a actuellement " + compteEpargne.getSolde() + " euros sur son compte");
//		Scanner scanner = new Scanner(System.in);
//		
//		System.out.println(scanner.nextInt());
//		System.out.println(scanner.nextLine());
//		
//		boolean majeur = false;
//		int age = 12;
//		if (age < 5) {
//			System.out.println("Vous etes trs petit");
//		} else if (age <18){
//			System.out.println("Vous etes mineur");
//		} else {
//			System.out.println("Vous etes majeur");
//		}
		
		int departement = 75002;
		if (departement == 75002)
		switch(departement) {
		case 75001 : System.out.println("1er arrondissement");
					 break;
		case 75002 : System.out.println("2eme arrondissement");
					 break;
		case 75003 : System.out.println("3eme arrondissement");
					 break;
		case 75004 : System.out.println("4eme arrondissement");
					 break;
		case 75005 : System.out.println("5eme arrondissement");
					 break;
		case 75006 : System.out.println("6eme arrondissement");
					 break;
		default:	System.out.println("Je ne connais pas votre departement");
		}
	
	}
	
	
}

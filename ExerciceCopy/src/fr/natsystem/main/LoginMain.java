package fr.natsystem.main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import fr.natsystem.utils.LoginException;

public class LoginMain {

	private static final String MOTDEPASSE_VALIDE = "password";
	private static final String UTILISATEUR_VALIDE = "admin";

	public static void main(String[] args) {

		System.out.println("Choisissez entre 1.connexion ou 2.gestion des identifiants :");
		Scanner premierScanner = new Scanner(System.in);
		int choix = premierScanner.nextInt();
		if (choix == 1) {
			System.out.println("Entrez votre nom d'utilisateur : ");
			Scanner scanner = new Scanner(System.in);
			String utilisateurSaisi = scanner.nextLine();

			System.out.println("Entrez votre mot de passe : ");
			String motDePasseSaisi = scanner.nextLine();
			// utilisateurValide == utilisateurSaisi
			// && : ET logique
			// || : OU logique

			// r�cup�rer la liste d'utilisateurs
			// de utilisateurs.db
			boolean identifiantsValides = false;
			try {
				List<String> listeUtilisateurs = Files.readAllLines(Paths.get("utilisateurs.db"));
				// tester si l'utilisateur saisi fait partie de la liste
				for (String ligne : listeUtilisateurs) {
					String[] ligneCoupee = ligne.split("/");
					String utilisateur = ligneCoupee[0];
					String motdepasse = ligneCoupee[1];
					if (utilisateur.equals(utilisateurSaisi) && motdepasse.equals(motDePasseSaisi)) {
						identifiantsValides = true;
					}
				}
			} catch (IOException e) {
				System.out.println("Erreur lors de l'acc�s au fichier : " + e.getMessage());
			}

			if (identifiantsValides) {
				System.out.println("Bienvenu(e) dans le programme !");
				choix = 1;
				do {
					// 1. Proposition de choix entre cr�ation, modification et suppression
					System.out.println("Choisissez entre 3 options diff�rentes :");
					System.out.println("1. Cr�ation");
					System.out.println("2. Mise � jour");
					System.out.println("3. Suppression");

					// 2. Attente de saisie utilisateur
					Scanner scan = new Scanner(System.in);
					int saisie = scan.nextInt();

					// 3. Traitement de ce choix selon la saisie
					switch (saisie) {
					case 1:
						System.out.println("Vous �tes dans l'�cran de cr�ation");
						break;
					case 2:
						System.out.println("Vous �tes dans l'�cran de mise � jour");
						break;
					case 3:
						System.out.println("Vous �tes dans l'�cran de suppression");
						break;
					default:
						System.out.println("Mauvaise saisie");
					}

					// est-ce que l'utilisateur souhaite continuer
					// Propose un choix entre continuer ou non
					System.out.println("Souhaitez-vous retourner dans le menu ?");
					System.out.println("1. Oui");
					System.out.println("2. Non");
					choix = scan.nextInt(); // changer la valeur de la variable

				} while (choix == 1); // on reste dans la boucle ou on en sort selon la saisie

				System.out.println("Au revoir !");
			} else {
				System.out.println("Utilisateur et/ou mot de passe invalides");
			}
			// mainAlternatif();

		} else if (choix == 2) {
			// TODO ajouter une fonctionalit�
			// qui permet d'ajouter des utilisateurs et mot de passe
			// dans un fichier
			premierScanner = new Scanner(System.in);
			System.out.println("Saisissez le nouvel utilisateur : ");
			String nouvelUtilisateur = premierScanner.nextLine();
			System.out.println("Saisissez son mot de passe : ");
			String nouveauMotDePasse = premierScanner.nextLine();

//			Files.write(Paths.get("utilisateurs.db"), nouvelUtilisateur.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
//			Files.write(Paths.get("motsdepasse.db"), nouveauMotDePasse.getBytes(), StandardOpenOption.APPEND, StandardOpenOption.CREATE);
			String combinaison = nouvelUtilisateur + "/" + nouveauMotDePasse + "\n";
			try {
				Files.write(Paths.get("utilisateurs.db"), combinaison.getBytes(), StandardOpenOption.APPEND,
						StandardOpenOption.CREATE);
			} catch (IOException e) {
				System.out.println("Erreur lors de l'acc�s au fichier : " + e.getMessage());
			}

		} else {
			System.out.println("Choix invalide");
		}

		// premiere �tape : donner le choix entre aller sur
		// l'authentification ou bien un autre menu

		// 2e �tape : cr�ation d'un menu qui permet de mettre
		// des utilisateurs et mot de passe dans un fichier

		// 3e �tape : lire le fichier pour d�terminer
		// si un utilisateur / mot de passe est valide ou non

	}

	public static void mainAlternatif() { // main alternatif
		try {
			if (login()) { // login r�sum� dans une m�thode d�di�e
				System.out.println("Bienvenu(e) dans le programme !");
				navigationMenu(); // navigation dans une m�thode d�di�e
				System.out.println("Au revoir !");
			}
		} catch (LoginException e) {
			// on rattrape l'exception de la m�thode login
			// et on affiche son message d'erreur
			System.out.println("Erreur lors de la connexion : " + e.getMessage());
		}

	}

	private static boolean login() throws LoginException { // throws : indicateur qu'un type d'exception est susceptible
															// d'etre g�n�r� par la m�thode
		System.out.println("Entrez votre nom d'utilisateur : ");
		Scanner scanner = new Scanner(System.in);
		String utilisateurSaisi = scanner.nextLine();

		System.out.println("Entrez votre mot de passe : ");
		String motDePasseSaisi = scanner.nextLine();
		if (UTILISATEUR_VALIDE.equals(utilisateurSaisi) && MOTDEPASSE_VALIDE.equals(motDePasseSaisi)) {
			return true;
		} else { // on lance une LoginException avec un message explicatif
			throw new LoginException("Utilisateur et/ou mot de passe invalides"); // throw : je g�n�re manuellement une
																					// exception
		}
	}

	private static void navigationMenu() {

		int choix = 1;
		do {
			// 1. Proposition de choix entre cr�ation, modification et suppression
			System.out.println("Choisissez entre 3 options diff�rentes :");
			System.out.println("1. Cr�ation");
			System.out.println("2. Mise � jour");
			System.out.println("3. Suppression");

			// 2. Attente de saisie utilisateur
			Scanner scan = new Scanner(System.in);
			int saisie = scan.nextInt();

			// 3. Traitement de ce choix selon la saisie
			switch (saisie) {
			case 1:
				System.out.println("Vous �tes dans l'�cran de cr�ation");
				break;
			case 2:
				System.out.println("Vous �tes dans l'�cran de mise � jour");
				break;
			case 3:
				System.out.println("Vous �tes dans l'�cran de suppression");
				break;
			default:
				System.out.println("Mauvaise saisie");
			}

			// est-ce que l'utilisateur souhaite continuer
			// Propose un choix entre continuer ou non
			System.out.println("Souhaitez-vous retourner dans le menu ?");
			System.out.println("1. Oui");
			System.out.println("2. Non");
			choix = scan.nextInt(); // changer la valeur de la variable

		} while (choix == 1); // on reste dans la boucle ou on en sort selon la saisie
	}

//	try : bloc de code normal qu'on essaie d'ex�cuter
//	catch : bloc de code ex�cut� si on rencontre un certain type d'exception
//	finally : bloc de code ex�cut� tout le temps
//	
//	throw : lancer manuellement une exception
//	throws : indiquer qu'une exception est susceptible d'etre lanc�, sans la g�rer forc�ment
}

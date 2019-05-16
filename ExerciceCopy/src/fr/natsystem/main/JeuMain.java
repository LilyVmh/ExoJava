package fr.natsystem.main;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class JeuMain {

	public static void main(String[] args) {
		Random r = new Random();
		int randomInt = r.nextInt(20) + 1;
		Scanner scanner = new Scanner(System.in);
		int saisie = 0;
		System.out.println("Veuillez saisir un nombre entre 1 et 20");
		// tant que je n'ai pas trouvé le bon nombre
		while (saisie != randomInt) {
			try {
				saisie = scanner.nextInt();
				if (saisie > randomInt) {
					System.out.println("Le nombre saisi est trop grand");
				} else if (saisie < randomInt) {
					System.out.println("Le nombre saisi est trop petit");
				}
			} catch (InputMismatchException e) {
				saisie = 0;
				System.out.println("Erreur de saisie, veuillez réessayer");
				scanner.nextLine();
			}

		}
		System.out.println("Bravo ! Tu as gagné");

	}

}

package fr.natsystem.main;

import java.util.Scanner;

public class IOMain {
	
	public static void main(String[] args) {
		System.out.println("Bienvenu(e)"); //affiche du texte dans la console
		Scanner scanner = new Scanner(System.in);
		// cr�ation d'un scanner qui va enregistrer ce 
		// qu'on va �crire dans la console
		System.out.println("Entrez un chiffre entre 1 et 9");
		int chiffre = scanner.nextInt();
		System.out.println("Vous avez entr� le chiffre " + chiffre);
		
	}

}

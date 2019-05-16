package fr.natsystem.services;

public class Calculs {
	
	
	public static int addition(int a, int b) { // 2 paramètres, a et b, de type int
		// retourne une valeur de type int
		
		 // on définit une variable résultat
 // on met l'addition de a et b dedans
		
		int resultat = a+b;
		return resultat; // on retourne la valeur
	}
	
	
	public static int factorielleWhile(int nombre) {
		int resultat=1;
		int i = 1;
		while (i<= nombre) {
			resultat = resultat * i;
			i++;
		}
		return resultat;
	}
	
	
	public static int deuxiemeFactorielleWhile(int nombre) {
		if (nombre == 0) {
			return 1;
		}
		int i = nombre-1;
		while (i>0) {
			nombre = nombre * i;
			i--;
		}
		return nombre;
		
	}
	
	public static int factorielleDoWhile(int nombre) {
		int resultat = 1;
		int i = 1;
		do {
			resultat *= i;
			i++;
		} while(i <= nombre);
		return resultat;
	}
	
	public static int factorielleFor(int nombre) {
		int resultat = 1;
		for (int i=1; i<=nombre; i++) {
			resultat *= i;
		}
		return resultat;
	}
	
	public int factorielle(int nombre) { // BONUS : recursion
		if (nombre == 1 || nombre == 0) {
			return 1;
		} else {
			return nombre * factorielle(nombre-1);
		}
	}
}

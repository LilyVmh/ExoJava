package fr.natsystem.main;

import fr.natsystem.services.Calculs;

public class CalculMain {

	public static void main(String[] args) {
		System.out.println(Calculs.factorielleWhile(5));
		System.out.println(Calculs.deuxiemeFactorielleWhile(6));
		System.out.println(Calculs.factorielleDoWhile(4));
		System.out.println(Calculs.factorielleFor(7));
	}
	
}

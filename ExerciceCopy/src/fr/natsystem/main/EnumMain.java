package fr.natsystem.main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Stack;

import fr.natsystem.datamodel.Saison;

public class EnumMain {

	
	public static void main(String[] args) {
		String[] moisDeLannee = new String[12];
		moisDeLannee[0] = "janvier";
		moisDeLannee[1] = "fevrier";
		// ...
		moisDeLannee[11] = "d�cembre";
		int tailleTableau = moisDeLannee.length;
		ArrayList<String> listeMois = new ArrayList<>();
		listeMois.add("janvier");
		listeMois.add("f�vrier");
		// ...
		listeMois.add("d�cembre");
		if (listeMois.contains("avril")) {
			System.out.println("le mois d'avril existe");
		}
		for (int i=0; i<listeMois.size(); i++) {
			String mois = listeMois.get(i);
			System.out.println(mois);
		}
		for (String mois : listeMois) { // on parcourt la liste listeMois
					// chaque �l�ment constitue un tour de plus dans la boucle
					// et est repr�sent� par l'objet mois
			System.out.println(mois);
		}
		
		ArrayList<Saison> listeSaisons = new ArrayList<>();
		listeSaisons.add(Saison.PRINTEMPS); // ajoute les diff�rentes saisons 
		listeSaisons.add(Saison.ETE);		// dans l'ordre
		listeSaisons.add(Saison.AUTOMNE);
		listeSaisons.add(Saison.HIVER);
		listeSaisons.add(Saison.PRINTEMPS); // on ajoute une 2e fois la premi�re saison sans probl�me
		
		for (Saison saison : listeSaisons) {
			System.out.println(saison);
		}
		
		HashMap<Integer, String> correspondanceMoisAnnee = new HashMap<>();
		correspondanceMoisAnnee.put(1, "janvier");
		correspondanceMoisAnnee.put(2, "f�vrier");
		correspondanceMoisAnnee.put(12, "d�cembre");
		correspondanceMoisAnnee.put(5, "f�vrier");
		correspondanceMoisAnnee.put(5, "mai");
		
		HashMap<String, List<String>> mapDelistes = new HashMap<>();
		List<String> listeMoisAnnee = Arrays.asList("janvier", "f�vrier");
		List<String> listeSaison = Arrays.asList("printemps", "�t�", "automne", "hiver");
		mapDelistes.put("moisDansAnnee", listeMoisAnnee);
		mapDelistes.put("saisons", listeSaison);
		List<String> listeQuonVeut = mapDelistes.get("moisDansAnnee");
		listeQuonVeut.get(0);
		
		
		
		
		for (Entry<Integer, String> entry : correspondanceMoisAnnee.entrySet()) {
			System.out.println("Cl� : " + entry.getKey() + " - Valeur : " + entry.getValue()); 
		}
		HashSet<String> setMoisAnnee = new HashSet<>(); // pas d'ordre contrairement aux listes
		setMoisAnnee.add("janvier");
		setMoisAnnee.add("f�vrier");
		setMoisAnnee.add("d�cembre");
		setMoisAnnee.add("d�cembre"); // n'ajoutera pas une 2e fois d�cembre
									// car un set n'accepte pas de doublons
	
		PriorityQueue<String> queue = new PriorityQueue<>();
		queue.add("janvier");
		queue.add("f�vrier");
		queue.add("d�cembre");
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		System.out.println(queue.poll());
		
		Stack<String> stack = new Stack<>();
		stack.push("janvier");
		stack.push("d�cembre");
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	
	}
}

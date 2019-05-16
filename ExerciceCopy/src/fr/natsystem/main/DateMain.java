package fr.natsystem.main;


	import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
	import java.time.format.DateTimeFormatter;
import java.util.Scanner;

	public class DateMain {
	    public static void main(String[] args) {

	        //Get current date time
	        LocalDateTime now = LocalDateTime.now();

	        System.out.println("Before : " + now);

	
	//demander la saisie d'une date en respectant un format predefini
	        System.out.println("Entrez une date au format DD/MM/YYYY");
	        Scanner Scan = new Scanner(System.in);
			String saisie = Scan.nextLine();
		
		
			// Verifier que la saisie respecte le format
				// Mani�re gros bourrin: On v�rifie que les 2 premiers Char sont des chiffres
										// On verifie que les  chars 4 et 5 forment un mois
										// On v�rifie que les chars 7,8,9 et 10 forment une ann�e
										//On v�rifie que les chars 3 et 6 sont des /
			
				// Mani�re d�veloppeur google
									try {
										SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
										sdf.setLenient(false);
										sdf.parse(saisie);
										System.out.println("Bon Format");}
										catch (ParseException ex) {
										System.out.println("Mauvais Format");
												}
												
			
	}
			
	        //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
	        //String formatDateTime = now.format(formatter);
}
	

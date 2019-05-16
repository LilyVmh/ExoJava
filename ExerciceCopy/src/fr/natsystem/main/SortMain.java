package fr.natsystem.main;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

import fr.natsystem.datamodel.Client;

public class SortMain {

	public static void main(String[] args) {
		ArrayList<Client> listeClients = new ArrayList<>();
		Client premierClient = new Client("Michel", "7 rue des étalons", 17);
		Client deuxiemeClient = new Client("Bernard", "2 rue de la paix", 25);
		Client troisiemeClient = new Client("Roger", "17 avenue de la république", 41);
		listeClients.add(premierClient);
		listeClients.add(deuxiemeClient);
		listeClients.add(troisiemeClient);
		Collections.sort(listeClients);
		premierClient.compareTo(deuxiemeClient);
		"bijou".compareTo("cajou");
		
	}
	
}

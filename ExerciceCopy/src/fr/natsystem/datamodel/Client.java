package fr.natsystem.datamodel;

public class Client implements Comparable<Client>{
	
	private String nom; // attribut nom de type String
	/*
	commentaire
	�largi
	*/
	private String adresse;
	
	private int age;
	
	public Client() { // constructeur
	}

	public Client(String nom, String adresse) { 
		// 2e constructeur
		// avec param�tres
		this.nom = nom; // je mets la valeur du nom pass� en param�tre
						// dans l'attribut nom de l'objet
		this.adresse = adresse;
		
	}
	
	public Client(String nom, String adresse, int age) { 

		this.nom = nom; // je mets la valeur du nom pass� en param�tre
						// dans l'attribut nom de l'objet
		this.adresse = adresse;
		this.age = age;
		
	}
	public void setAdresse(String nouvelleAdresse) {
		this.adresse = nouvelleAdresse; // change la valeur de l'adresse
			// en prenant celle pass�e en param�tre
	}
	
	public String getAdresse() {
		return this.adresse;
		// renvoie la valeur actuelle de l'adresse
	}

	
	public String getNom() { // renvoie la valeur actuelle de l'attribut nom 
		return nom;
	}

	public void setNom(String nom) { // change la valeur de l'attribut nom 
									// par celle du param�tre
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override  // impl�mente une m�thode d�j� impl�ment�e dans une super classe
	public int compareTo(Client o) { // classe qui trie les clients
		return this.getNom().compareTo(o.getNom());
		// retourne un tri par nom
	}
	

	@Deprecated // signifie que la m�thode ne devrait plus �tre utilis�e et n'est plus maintenue	
	public int compareToByAge(Client o) { // classe qui trie les clients
		return ((Integer) this.getAge()).compareTo(o.getAge());
		// retourne un tri par nom
	}
	
	

}

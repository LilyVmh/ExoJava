package fr.natsystem.datamodel;

public class Client implements Comparable<Client>{
	
	private String nom; // attribut nom de type String
	/*
	commentaire
	élargi
	*/
	private String adresse;
	
	private int age;
	
	public Client() { // constructeur
	}

	public Client(String nom, String adresse) { 
		// 2e constructeur
		// avec paramètres
		this.nom = nom; // je mets la valeur du nom passé en paramètre
						// dans l'attribut nom de l'objet
		this.adresse = adresse;
		
	}
	
	public Client(String nom, String adresse, int age) { 

		this.nom = nom; // je mets la valeur du nom passé en paramètre
						// dans l'attribut nom de l'objet
		this.adresse = adresse;
		this.age = age;
		
	}
	public void setAdresse(String nouvelleAdresse) {
		this.adresse = nouvelleAdresse; // change la valeur de l'adresse
			// en prenant celle passée en paramètre
	}
	
	public String getAdresse() {
		return this.adresse;
		// renvoie la valeur actuelle de l'adresse
	}

	
	public String getNom() { // renvoie la valeur actuelle de l'attribut nom 
		return nom;
	}

	public void setNom(String nom) { // change la valeur de l'attribut nom 
									// par celle du paramètre
		this.nom = nom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


	@Override  // implémente une méthode déjà implémentée dans une super classe
	public int compareTo(Client o) { // classe qui trie les clients
		return this.getNom().compareTo(o.getNom());
		// retourne un tri par nom
	}
	

	@Deprecated // signifie que la méthode ne devrait plus être utilisée et n'est plus maintenue	
	public int compareToByAge(Client o) { // classe qui trie les clients
		return ((Integer) this.getAge()).compareTo(o.getAge());
		// retourne un tri par nom
	}
	
	

}

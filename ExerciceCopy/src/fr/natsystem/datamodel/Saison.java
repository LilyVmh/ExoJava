package fr.natsystem.datamodel;

public enum Saison {

	PRINTEMPS ("Printemps",1),
	ETE("Eté",2),
	AUTOMNE("Automne",3),
	HIVER("Hiver",4);
	
	private String nom ="";
	private int numSaison;
	
	Saison(String nom, int numSaison) {
		this.nom = nom;
		this.numSaison = numSaison;
	}

	public String toString() {
		return nom + " - " + numSaison;
	}
	
	public int numSaison() {
		return numSaison;
	}
}

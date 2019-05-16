package fr.natsystem.datamodel;

public class Epargne extends Compte {


	private double tauxInteret;
	
	// créer une méthode calculInteret
	// qui renvoie le nouveau solde apres
	// calcul de l'interet
	
	public double calculInteret(double ancienSolde, double tauxInteret) {
		double nouveauSolde = ancienSolde * tauxInteret; // calcule une variable
		return nouveauSolde;  //renvoie la variable
	}
	
	public double calculInteret() {
		//this.solde = this.solde * this.tauxInteret;
		super.setSolde(super.getSolde() * this.tauxInteret); // modifie une propriete de l'objet Epargne 
		return super.getSolde(); //renvoie la nouvelle valeur de cette propriete
	}
	
	//TODO créer une methode appelée retraitArgent
	public double retraitArgent(double montantARetirer) {
		super.setSolde(super.getSolde() - montantARetirer);
		return super.getSolde();
	}

	public double getTauxInteret() {
		return tauxInteret;
	}

	public void setTauxInteret(double tauxInteret) {
		this.tauxInteret = tauxInteret;
	}
	
	
}

package fr.natsystem.datamodel;

public abstract class Compte {
	// abstract = ne peut pas etre instanciť
	private double solde;

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}
	

}

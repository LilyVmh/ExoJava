package fr.natsystem.datamodel;

public class Action {

	private int quantite; // attribut / propriete
	
	private int prix;
	
	private int commission;
	
	public int getQuantite() { // methode 
		return quantite;		// getter
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getCommission() {
		return commission;
	}

	public void setCommission(int commission) {
		this.commission = commission;
	}
}

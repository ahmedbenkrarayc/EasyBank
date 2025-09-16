package main.entities;

public class CompteEpargne extends Compte {
	private float tauxInteret;
	
	public CompteEpargne(String code, float solde, float decouvert) {
		super(code, solde);
		this.setTauxInteret(tauxInteret);
	}
	
	//accessors
	public float getTauxInteret() {
		return this.tauxInteret;
	}
	
	public void setTauxInteret(float decouvert) {
		this.tauxInteret = decouvert;
	}

	@Override
	public Boolean retirer(float montant) {
		if(this.solde >= montant) {
			this.solde -= montant;
			return true;
		}
		return false;
	}

	@Override
	public float calculerInteret() {
		return 0;
	}

	@Override
	public String afficherDetails() {
		return null;
	}
}

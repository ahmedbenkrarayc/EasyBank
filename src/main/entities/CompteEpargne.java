package main.entities;

public class CompteEpargne extends Compte {
	private float tauxInteret;
	
	public CompteEpargne(String code, float solde, float tauxInteret) {
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
		return this.solde * (this.tauxInteret/100);
	}

	@Override
	public String afficherDetails() {
		return "---->Account Details\n-Code : "+this.code+"\n-Solde : "+this.solde+"DH\n-tauxInteret : "+this.tauxInteret+"\n";
	}
}

package main.entities;

public abstract class Compte {
	protected String code;
    protected float solde;
    
    public Compte(String code, float solde) {
        this.setCode(code);
        this.setSolde(solde);
    }
    
    //accessors
    public String getCode() {
        return this.code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getSolde() {
        return this.solde;
    }

    public void setSolde(float solde) {
        this.solde = solde;
    }
    
    //methods
    public abstract Boolean retirer(float montant);
    public abstract float calculerInteret();
    public abstract String afficherDetails();
}

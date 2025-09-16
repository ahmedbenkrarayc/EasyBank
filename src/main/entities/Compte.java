package main.entities;

public abstract class Compte {
	protected String code;
    protected float solde;
    
    public Compte(String code, float solde) {
        this.code = code;
        this.solde = solde;
    }
}

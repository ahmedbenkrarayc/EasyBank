package main.entities;

import java.util.Set;

public abstract class Compte {
	protected String code;
    protected float solde;
    protected Set<Operation> operations;
    
    public Compte(String code, float solde, Set<Operation> operations) {
        this.setCode(code);
        this.setSolde(solde);
        this.setOperations(operations);
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
    
    public Set<Operation> getOperations() {
        return this.operations;
    }

    public void setOperations(Set<Operation> operations) {
        this.operations = operations;
    }
    
    //methods
    public abstract Boolean retirer(float montant);
    public abstract float calculerInteret();
    public abstract String afficherDetails();
}

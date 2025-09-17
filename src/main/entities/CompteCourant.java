package main.entities;

import java.util.Set;

import main.utils.ValidationUtils;

public class CompteCourant extends Compte{
	private float decouvert;
	
	public CompteCourant(String code, float solde, Set<Operation> operations, float decouvert) {
		super(code, solde, operations);
		this.setDecouvert(decouvert);
	}
	
	//accessors
	public float getDecouvert() {
		return this.decouvert;
	}
	
	public void setDecouvert(float decouvert) {
		if(ValidationUtils.isPositiveNumber(decouvert, "Decouvert"))
			this.decouvert = decouvert;
	}
	
	//methods
	@Override
	public Boolean retirer(float montant) {
		float result = this.solde - montant;
		
		if(-this.decouvert <= result) {		
			this.solde = result;
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
		return "---->Account Details\n-Code : "+this.code+"\n-Solde : "+this.solde+"DH\n-Decouvert : "+this.decouvert+"\n";
	}
	
	
}

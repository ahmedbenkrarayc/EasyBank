package main.entities;

import java.time.LocalDate;
import java.util.UUID;

import main.utils.ValidationUtils;

public abstract class Operation {
	protected UUID numero;
	protected LocalDate date;
	protected float montant;
	
	public Operation(LocalDate date, float montant) {
		this.numero = UUID.randomUUID();
		this.setDate(date);
		this.setMontant(montant);
	}

	public UUID getNumero() {
		return numero;
	}

	//public void setNumero(UUID numero) {
	//	this.numero = numero;
	//}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		if(date != null)
			this.date = date;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		if(ValidationUtils.isPositiveNumber(montant, "Montant"))
			this.montant = montant;
	}
	
	
}

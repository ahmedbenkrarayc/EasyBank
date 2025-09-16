package main.entities;

import java.time.LocalDate;
import java.util.UUID;

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

	public void setNumero(UUID numero) {
		this.numero = numero;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public float getMontant() {
		return montant;
	}

	public void setMontant(float montant) {
		this.montant = montant;
	}
	
	
}

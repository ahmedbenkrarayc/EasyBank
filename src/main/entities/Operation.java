package main.entities;

import java.time.LocalDate;
import java.util.UUID;

public abstract class Operation {
	protected UUID numero;
	protected LocalDate date;
	protected float montant;
	
	public Operation(LocalDate date, float montant) {
		this.numero = UUID.randomUUID();
		this.date = date;
		this.montant = montant;
	}
}

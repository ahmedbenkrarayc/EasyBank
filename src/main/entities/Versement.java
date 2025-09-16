package main.entities;

import java.time.LocalDate;

public class Versement extends Operation{
	private String source;
	
	public Versement(LocalDate date, float montant, String source) {
		super(date, montant);
		this.source = source;
	}
}

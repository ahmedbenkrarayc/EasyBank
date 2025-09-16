package main.entities;

import java.time.LocalDate;

public class Retrait extends Operation{
	private String destination;
	
	public Retrait(LocalDate date, float montant, String destination) {
		super(date, montant);
		this.destination = destination;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}	
}

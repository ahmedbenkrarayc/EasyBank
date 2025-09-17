package main.entities;

import java.time.LocalDate;

import main.utils.ValidationUtils;

public class Retrait extends Operation{
	private String destination;
	
	public Retrait(LocalDate date, float montant, String destination) {
		super(date, montant);
		this.setDestination(destination);
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		if(ValidationUtils.requiredString(destination, 3, "Destination"))
			this.destination = destination;
	}	
}

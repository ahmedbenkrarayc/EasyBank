package main.entities;

import java.time.LocalDate;

public class Versement extends Operation{

	private String source;
	
	public Versement(LocalDate date, float montant, String source) {
		super(date, montant);
		this.source = source;
	}
	
	public String getSource() {
		return source;
	}
	
	public void setSource(String source) {
		this.source = source;
	}

	@Override
	public String toString() {
		return "Versement [source=" + source + ", numero=" + numero + ", date=" + date + ", montant=" + montant + "]";
	}
	
	
}

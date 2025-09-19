package main.utils;

import java.util.List;

import main.entities.Compte;

public class AccountNumberGenerator {
	public static String generate(List<Compte> compte) {
		String latest = compte != null && compte.size() > 0 ? compte.get(compte.size() - 1).getCode() : null;
		if(latest == null) {
			return "CPT-00000";
		}
		
		int number = Integer.parseInt(latest.split("-")[1]) + 1; 
		
		return "CPT-" + String.format("%05d", number);
	}
}

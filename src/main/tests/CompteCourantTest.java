package main.tests;

import java.util.HashSet;

import main.entities.CompteCourant;

public class CompteCourantTest {
	private static CompteCourant compte = new CompteCourant("CodeTest", 1000, new HashSet<>(), 500);
	
	public static void all() {
		System.out.println(compte.calculerInteret() == 0 ? "calculerInteret() Test passed" : "calculerInteret() Test failed");
		System.out.println(compte.retirer(1200) ? "Case1 retirer() Test passed" : "Case 1 retirer() Test failed");
		System.out.println(!compte.retirer(1600) ? "Case2 retirer() Test passed" : "Case 2 retirer() Test failed");
		System.out.println(compte.afficherDetails());
	}
	
}

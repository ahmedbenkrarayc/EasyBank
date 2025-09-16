package main.tests;

import main.entities.CompteEpargne;

public class CompteEpargneTest {
	private static CompteEpargne compte = new CompteEpargne("CodeTest", 1000, 4);
	
	public static void all() {
		System.out.println(compte.calculerInteret() == 40 ? "calculerInteret() Test passed" : "calculerInteret() Test failed");
		System.out.println(compte.retirer(1200) ? "Case1 retirer() Test failed" : "Case 1 retirer() Test passed");
		System.out.println(compte.retirer(1000) ? "Case2 retirer() Test passed" : "Case 2 retirer() Test failed");
		System.out.println(compte.afficherDetails());
	}
}

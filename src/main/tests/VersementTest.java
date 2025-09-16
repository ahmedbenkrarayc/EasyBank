package main.tests;

import java.time.LocalDate;

import main.entities.Versement;

public class VersementTest {
	private static Versement versement = new Versement(LocalDate.now(), 200, "Testsrc");
	
	public static void all() {
		System.out.println(versement);
	}
}

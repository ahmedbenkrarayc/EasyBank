package main.tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import main.entities.Compte;
import main.entities.CompteCourant;
import main.utils.AccountNumberGenerator;

public class AccountNumberGeneratorTest {
	public static void all() {
		List<Compte> comptes = new ArrayList<>();
		comptes.add(new CompteCourant("GPT-00000", 1000, new HashSet<>(), 500));
		
		System.out.println(AccountNumberGenerator.generate(null).equals("GPT-00000") ? "Case 1 Test Passed" : "Case 1 Test Failed");
		System.out.println(AccountNumberGenerator.generate(comptes).equals("GPT-00001") ? "Case 1 Test Passed" : "Case 1 Test Failed");
		comptes.get(0).setCode("GPT-00001");
		System.out.println(AccountNumberGenerator.generate(comptes).equals("GPT-00002") ? "Case 1 Test Passed" : "Case 1 Test Failed");
	}
}

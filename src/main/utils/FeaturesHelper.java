package main.utils;

import java.io.IOException;
import java.time.LocalDate;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.Set;

import main.entities.Operation;
import main.services.AccountService;
import main.services.OperationsService;

public class FeaturesHelper {
	private static AccountService accountService = new AccountService();
	private static OperationsService operationsService = new OperationsService();
	
	public static void createAccount() {
		String type = InputHelper.readType();
		float solde = InputHelper.readFloat("Solde");
		float decouvertOrtaux;
		if(type.equalsIgnoreCase("courant")) {
			decouvertOrtaux = InputHelper.readFloat("Decouvert");
		}else {
			decouvertOrtaux = InputHelper.readFloat("Taux d'interet");
		}
		
		if(accountService.createAccount(solde, decouvertOrtaux, type)) {
			System.out.println("Account created successfully");
		}else {
			System.out.println("Something went wrong please try again");
		}
	}
	
	public static void versement() {
		String code = InputHelper.readString("Account code");
		float montant = InputHelper.readFloat("Montant");
		LocalDate date = InputHelper.readDate();
		String source = InputHelper.readString("Source");
		if(operationsService.makeVersement(code, montant, date, source)) {
			System.out.println("Operation was successfully created");
			Globals.comptes.forEach(compte -> System.out.println(compte.getSolde()));
		}else {
			System.out.println("Something went wrong please try again");
		}
	}
	
	public static void retrait() {
		String code = InputHelper.readString("Account code");
		float montant = InputHelper.readFloat("Montant");
		LocalDate date = InputHelper.readDate();
		String source = InputHelper.readString("Source");
		if(operationsService.retrait(code, montant, date, source)) {
			System.out.println("Operation was successfully created");
			Globals.comptes.forEach(compte -> System.out.println(compte.getSolde()));
		}else {
			System.out.println("Operation was rejected no enough balance !");
		}
	}
	
	public static void virement() {
		String sender = InputHelper.readString("Sender account code");
		String receiver = InputHelper.readString("Receiver account code");
		float montant = InputHelper.readFloat("Montant");

		try {
			operationsService.virement(sender, receiver, montant);
			System.out.println("Operation was successfully created");
			Globals.comptes.forEach(compte -> System.out.println(compte.getSolde()));

		} catch(NoSuchElementException e) {
			System.out.println(e.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void consulterSolde() {
		String code = InputHelper.readString("Code");
		Optional<String> balance = accountService.getSolde(code);
		if(balance.isPresent()) {
			System.out.print("Your balance is : "+balance.get()+"DH");
		}else {
			System.out.print("Account doesn't exist !");
		}
	}
	
	public static void operationHistory() {
		Optional<Set<Operation>> history = accountService.accountOperationHistory(InputHelper.readString("Code"));
		if(history.isPresent()) {
			history.get().forEach(System.out::println);
		}
	}
	
	public static void cls() {
        try {
			if (System.getProperty("os.name").contains("Windows")) {
				new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } else {
				new ProcessBuilder("clear").inheritIO().start().waitFor();
	        }
		} catch (InterruptedException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void pause() {
		try {
			System.in.read();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
}

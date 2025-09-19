package main;

import java.util.Scanner;

import main.utils.FeaturesHelper;

public class EasyBank {
	
	public static void main(String[] args) {
		int choix = 0;
		
		Scanner scan = new Scanner(System.in);
		do {
			System.out.println("------------------------------------------- EasyBank -------------------------------------------\n\n");
			System.out.println("1- Créer un compte (courant ou épargne)");
			System.out.println("2- Effectuer un versement dans un compte");
			System.out.println("3- Effectuer un retrait d'un compte");
			System.out.println("4- Effectuer un virement entre comptes");
			System.out.println("5- Consulter le solde du compte");
			System.out.println("6- Consulter la liste des opérations effectuées sur un compte");
			System.out.println("7- Exit");
			choix = scan.nextInt();
			
			switch(choix) {
				case 1:
					FeaturesHelper.createAccount();
				break;
				case 2:
					FeaturesHelper.versement();
				break;
				case 3:
					FeaturesHelper.retrait();
				break;
				case 4:
					FeaturesHelper.virement();
				break;
				case 5:
					FeaturesHelper.consulterSolde();
				break;
				case 6:
					FeaturesHelper.operationHistory();
				break;
				case 7:
					choix = 0;
					break;
				default:
					System.out.println("Please pick a valid choice !");
			}
			
		}while(choix != 0);
		scan.close();
	}
}

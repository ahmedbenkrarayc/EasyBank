package main.services;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

import main.entities.Compte;
import main.entities.CompteCourant;
import main.entities.CompteEpargne;
import main.entities.Operation;
import main.repositories.AccountRepository;
import main.utils.AccountNumberGenerator;
import main.utils.Globals;

public class AccountService {	
	private AccountRepository accountRepo;
	
	public AccountService() {
		accountRepo = new AccountRepository(); 
	}
	
	public Boolean createAccount(float solde, float tauxordecouvert, String accountType) {
		Compte compte;

		try {
			String code = AccountNumberGenerator.generate(Globals.comptes);

			if(accountType.trim().equalsIgnoreCase("Courant")) {
				compte = new CompteCourant(code, solde, new HashSet<>(), tauxordecouvert);			
			}else {
				compte = new CompteEpargne(code, solde, new HashSet<>(), tauxordecouvert);
			}
			return accountRepo.create(compte);
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return false;
		}		
		
	}
	
	public Optional<String> getSolde(String code) {
		return accountRepo.findAccountByCode(code)
						  .map(compte -> String.valueOf(compte.getSolde()));
	}
	
	public Optional<Set<Operation>> accountOperationHistory(String code){
		return accountRepo.findAccountByCode(code)
				          .map(compte -> compte.getOperations());
	}
}

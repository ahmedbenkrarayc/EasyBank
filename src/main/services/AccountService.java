package main.services;

import java.util.HashSet;
import java.util.Optional;

import main.entities.Compte;
import main.entities.CompteCourant;
import main.entities.CompteEpargne;
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

			if(accountType.trim().equals("Courant")) {
				compte = new CompteCourant(code, solde, new HashSet<>(), tauxordecouvert);			
			}else {
				compte = new CompteEpargne(code, solde, new HashSet<>(), tauxordecouvert);
			}
			
			return accountRepo.create(compte);
		}catch(Exception e) {
			return false;
		}		
		
	}
	
	public String getSolde(String code) {
		Optional<Compte> compte = accountRepo.findAccountByCode(code);
		if(compte.isPresent()) {
			return String.valueOf(compte.get().getSolde());
		}
		
		return null;
	}
}

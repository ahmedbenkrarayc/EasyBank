package main.services;

import java.time.LocalDate;
import java.util.Optional;

import main.entities.Compte;
import main.entities.Versement;
import main.repositories.AccountRepository;

public class OperationsService {
	private AccountRepository accountRepo;
	
	public OperationsService() {
		accountRepo = new AccountRepository(); 
	}                                                                                            
	
	public Boolean makeVersement(String code, float montant, LocalDate date, String source) {
		return accountRepo.findAccountByCode(code)
				.map(compte -> {
					compte.setSolde(compte.getSolde() + montant);
					compte.getOperations().add(new Versement(date, montant, source));
					return true;
				})
				.orElse(false);
	}
	
	public Boolean retrait(String code, float montant, LocalDate date, String source) {
		return accountRepo.findAccountByCode(code)
				.map(compte -> {
					compte.retirer(montant);
					compte.getOperations().add(new Versement(date, montant, source));
					return true;
				})
				.orElse(false);
	}
	
	public Boolean virement(String senderCode, String receiverCode, float montant) {
			Optional<Compte> sender = accountRepo.findAccountByCode(senderCode);
			Optional<Compte> receiver = accountRepo.findAccountByCode(receiverCode);
			
			if(!sender.isPresent() || !receiver.isPresent()) {
				return false;
			}
			
			if(this.retrait(senderCode, montant, LocalDate.now(), "Transfer to "+receiverCode)) {
				if(!this.makeVersement(receiverCode, montant, LocalDate.now(), "Transfer from "+senderCode)){
					sender.get().setSolde(sender.get().getSolde() + montant);
					return false;
				}
				
				return true;
			}
			
			return false;
	}
}

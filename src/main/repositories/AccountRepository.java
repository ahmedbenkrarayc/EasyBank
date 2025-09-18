package main.repositories;

import java.util.Optional;

import main.entities.Compte;
import main.utils.Globals;

public class AccountRepository {
	public Boolean create(Compte compte) {
		return Globals.comptes.add(compte);
	}
	
	public Optional<Compte> findAccountByCode(String code) {
		return Globals.comptes.stream()
				.filter(c -> 
					c.getCode().equals(code.trim())
				)
				.findFirst();
	}
}

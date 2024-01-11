package metier.session;

import java.util.*;

import javax.ejb.LocalBean;
import javax.ejb.Singleton;
import javax.ejb.Stateful;

import metier.entities.Compte;

@Stateful
@LocalBean
@Singleton(name="BP2")
public class Banque implements BanqueRemote, BanqueLocal {
	private Map<Long, Compte> comptes=new Hashtable<Long, Compte>();

	@Override
	public void addCompte(Compte c) {
		comptes.put(c.getCode(), c);
		
	}

	@Override
	public List<Compte> consulterComptes() {
		List<Compte> cptes=new ArrayList<Compte>(comptes.values());
		return cptes;
	}

	@Override
	public Compte consulterCompte(Long code) {
		Compte cp=comptes.get(code);
		if(cp==null) throw new RuntimeException("Compte introuvable");
		return cp;
	}
	
    public Banque() {
        // TODO Auto-generated constructor stub
    }



	@Override
	public void verser(Long code, double montant) {
		Compte cp=comptes.get(code);
		cp.setSolde(cp.getSolde()+montant);
	}

	
	@Override
	public void retirer(Long code, double montant) {
		Compte cp=comptes.get(code);
		if(cp.getSolde()<montant) throw new RuntimeException("Solde insuffisant");
		cp.setSolde(cp.getSolde()-montant);
		
	}
	
	public void initialisation() {
		addCompte(new Compte(1L, 7000, new Date()));
		addCompte(new Compte(2L, 4000, new Date()));
		addCompte(new Compte(3L, 2000, new Date()));
	}

}

package metier.session;

import java.util.List;
import javax.ejb.Remote;
import metier.entities.Compte;

@Remote
public interface BanqueLocal {
	public void addCompte(Compte c);
	public List<Compte> consulterComptes();
	public Compte consulterCompte(Long code);
	public void verser(Long code, double montant);
	public void retirer(Long code, double montant);

}

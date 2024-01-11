
public class Banque {

	//Attributs
	private CompteSimple[] comptes;
	private int nbComptes;
	
	
	//Constructeur
	public Banque(int taille) {	
		comptes = new CompteSimple[taille];
		nbComptes = 0;
	}
	
	//Methodes
	
	public void ouvrirCompteCourant(Personne personne, double solde, int numCompte){
		comptes[nbComptes++] = new CompteCourant(personne,solde);
	}
	
	public void ouvrirCompteSimple(Personne p, double montant, int nbCompte){
		comptes[nbComptes++] = new CompteSimple(p, montant);
	}
	
	
	
	
	public void ouvrirCompte(Personne p, double montant, int typeDeCompte) {
		if (typeDeCompte == 0) {
			ouvrirCompteSimple(p, montant, typeDeCompte);
		}else {
			ouvrirCompteCourant(p, montant, typeDeCompte);
		}
	}
	
	
	//Afficher tous les comptes
	public void lister() {
		for (int i = 0; i < nbComptes; i++) {
			System.out.println(comptes[i]);
			System.out.println();
		}
	}
	
	

	//Cumul des soldes des comptes generes par la banque
	public double getCumulSoldes() {
		double result = 0;
		for (int i = 0; i < nbComptes; i++) {
			result = result + comptes[i].getSolde();
		}
		return result;
		
	}


}

public class CompteCourant extends CompteSimple {
	
	//Attributs
	
	private Historique operations = new Historique();

	
	//constructeur

	public CompteCourant(Personne titulaire) {
		this(titulaire, 0);
	}

	public CompteCourant(Personne titulaire, double solde) {
		super(titulaire,solde);
		if (solde > 0) {
			this.operations.enregistrer(solde);
		}
	}
	
	//Méthodes
	
	@Override
	public void crediter(double montant) {
		super.crediter(montant);
		this.operations.enregistrer(montant);
	}
	@Override
	public void debiter(double montant) {
		super.debiter(montant);
		this.operations.enregistrer(montant);
	}
	
	public void editerReleve() {
		System.out.println("--------------------------");
		
		
		
	//Affichage caracteristique du compte
	System.out.print("Titulaire : ");
	super.getTitulaire().afficher();
	System.out.println();
	
	//Afficher l'historique des opérations
	System.out.println("Historique des opérations : ");
	for(int i = 1; i<- this.operations.getNbValeurs(); i++) {
		if (this.operations.getValeur(i)<0) {
			System.out.println(" o Dépôt de " + this.operations.getValeur(i));
		}else {
			System.out.println(" o Retrait de " + this.operations.getNbValeurs());
		}
	}
	
	//Afficher le solde du compte
	System.out.println("--------------------------------");
	System.out.println("Solde du compte : " + getSolde());
	System.out.println("--------------------------------");
	System.out.println();
	}
	

	@Override
	public String toString() {
		return "Compte Simple :" + super.toString();
	}
	
}

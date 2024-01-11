public class CompteSimple {
	public double solde;
	public Personne titulaire;
	public int numCompte;
	public static int cpt = 10000;
	
	//Constructeurs
	public CompteSimple(Personne titulaire) {
		this.titulaire = titulaire;
		this.numCompte = cpt++;
	}
	
	public CompteSimple(Personne titulaire, double solde) {
		this(titulaire); //Appel le constructeur au dessus donc pas besoin de remettre le this titulaire
		this.solde = solde;
		this.numCompte = cpt++;
	}
	
	//Méthodes
	public void crediter(double montant) {
		this.solde = this.solde + montant;
	}
	
	public void debiter(double montant) {
		if (montant<0) {
			solde = solde+montant;
		}else{
			solde = solde-montant;
		}
	}
	public void setTitulaire(Personne titulaire) {
		this.titulaire = titulaire;
	}
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public double getSolde() {
		return solde;
	}
	
	public Personne getTitulaire() {
		return titulaire;
	}
	
	@Override
	public String toString(){
	    return  "Le solde est de"+ solde;
	  }
}

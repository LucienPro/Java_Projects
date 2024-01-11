package bancaire;

public class CompteSimple {
	
	//Attributs
	
	private double solde;
	private Personne titulaire;
	
	
	//Constructeurs

	public CompteSimple(Personne titulaire) {
		this.titulaire = titulaire;
	}
	
	public CompteSimple(Personne titulaire, double solde) {
		this.titulaire = titulaire;
		this.solde = solde;
		
	}
	
	
	// Méthodes
	
	public double getSolde() {
		return solde;
	}
	
	public Personne getTitulaire() {
		return titulaire;
	}
	
	public void setSolde(double solde) {
		this.solde = solde;
	}
	
	public void setTitulaire(Personne titulaire){
		this.titulaire = titulaire;
	}
	
	public double crediter(double montant) {
		this.solde = this.solde + montant;
		return solde;
	}
	
	public double debiter(double montant) {
		this.solde = this.solde - montant;
		return solde;
	}
	
	@Override
	public String toString() {
		return "Le solde est de" + solde;
	}

}

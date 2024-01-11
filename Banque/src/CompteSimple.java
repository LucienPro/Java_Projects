
public class CompteSimple {
	public float solde;
	public Personne titulaire;
	
	public CompteSimple(float solde, Personne titulaire) {
		this.titulaire = titulaire;
		this.solde = solde;
	}
	
	public float crediter(float montant) {
		solde = solde + montant;
		return solde;
	}
	
	public float debiter(float montant) {
		solde = solde - montant;
		return solde;
	}
	
	public float getSolde() {
		return this.solde;
	}
	
}

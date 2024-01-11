public class Personne {


	// Le nom
	private String nom;
	// Le prenom
	private String prenom;
	//Le sexe
	private boolean man;

	
	public Personne(String prenom, String nom, boolean man) {
		this.nom = nom;
		this.prenom = prenom;
		this.man = man;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public boolean isMan() {
		return this.man;
	}

	public boolean isWoman() {
		return ! isMan();
	}

	public void afficher() {
		System.out.print(this);
	}

	public String toString() {
		return (this.man ? "M." : "Mme")
			+ ' ' + this.prenom + ' ' + this.nom;
	}

}

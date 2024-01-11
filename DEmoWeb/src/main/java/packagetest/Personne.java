package packagetest;

public class Personne {
	
	private String nom;
	private String prenom;
	private String villeNaissance;
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getVilleNaissance() {
		return villeNaissance;
	}
	public void setVilleNaissance(String villeNaissance) {
		this.villeNaissance = villeNaissance;
	}
	public Personne(String nom, String prenom, String villeNaissance) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.villeNaissance = villeNaissance;
	}

}

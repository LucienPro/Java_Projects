package fr.baudimont.nfp121.rappel;

public class Personne {
	
	private String nom;
	private String prenom;
	

	public Personne() {
		super();

	}
	
	public Personne(String pNom, String pPrenom){
		nom = pNom;
		prenom = pPrenom;
	}

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


}

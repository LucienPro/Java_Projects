package fr.baudimont.nfp121.rappel.abstracts;

public abstract class AAnimal {
	private String nom;
	
	public abstract void parle();

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public static void gestionAbstraite() {
		
	}
}

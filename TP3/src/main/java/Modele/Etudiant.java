package Modele;

public class Etudiant {

	private String cin;
	private String nom;
	private double moyenne;
	
	public Etudiant(String cin, String nom, double moyenne) {
		super();
		this.cin = cin;
		this.nom = nom;
		this.moyenne = moyenne;
	}
	
	public String getCin() {
		return cin;
	}

	public void setCin(String cin) {
		this.cin = cin;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public double getMoyenne() {
		return moyenne;
	}

	public void setMoyenne(double moyenne) {
		this.moyenne = moyenne;
	}
	
	public boolean equals(Etudiant eleve1, Etudiant eleve2) {
		if (eleve1.cin == eleve2.cin) {
			return true;
		} else {
			return false;
		}
	}

	
	
	
	

}

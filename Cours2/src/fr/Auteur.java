package fr;

import java.util.Date;

class Auteur {
  public Auteur() {
		super();
		System.out.println("Dans le constructeur de livre");
	}

private String nom;

  private Date dateDeNaissance;

  private int nombreOuvrages;

public String getNom() {
	return nom;
}

public void setNom(String nom) {
	this.nom = nom;
}

public Date getDateDeNaissance() {
	return dateDeNaissance;
}

public void setDateDeNaissance(Date dateDeNaissance) {
	this.dateDeNaissance = dateDeNaissance;
}

public int getNombreOuvrages() {
	return nombreOuvrages;
}

public void setNombreOuvrages(int nombreOuvrages) {
	this.nombreOuvrages = nombreOuvrages;
}

public Auteur(String pNom, Date pDateDeNaissance, int pNombreOuvrages) {
	super();
	this.nom = pNom;
	this.dateDeNaissance = pDateDeNaissance;
	this.nombreOuvrages = pNombreOuvrages;
}

public Auteur(String nom) {
	super();
	this.nom = nom;
}

}

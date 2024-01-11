package fr;

import java.util.Date;

class Livre {
  public Livre() {
		super();
		System.out.println("Dans le constructeur de livre");
	}

  public Livre(String ptitre) {
		super();
		this.titre = ptitre;
	}
  
private String titre;

  private Date dateDeParution;

  private int nombreDePages;

  private String genre;

  private Auteur monAuteur;

public String getTitre() {
	return titre;
}

public void setTitre(String titre) {
	this.titre = titre;
}

public Date getDateDeParution() {
	return dateDeParution;
}

public void setDateDeParution(Date dateDeParution) {
	this.dateDeParution = dateDeParution;
}

public int getNombreDePages() {
	return nombreDePages;
}

public void setNombreDePages(int nombreDePages) {
	this.nombreDePages = nombreDePages;
}

public String getGenre() {
	return genre;
}

public void setGenre(String genre) {
	this.genre = genre;
}

public Auteur getMonAuteur() {
	return monAuteur;
}

public void setMonAuteur(Auteur monAuteur) {
	this.monAuteur = monAuteur;
}

public Livre(String pTitre, Date pDateDeParution, int pNombreDePages, String pGenre, Auteur pMonAuteur) {
	super();
	this.titre = pTitre;
	this.dateDeParution = pDateDeParution;
	this.nombreDePages = pNombreDePages;
	this.genre = pGenre;
	this.monAuteur = pMonAuteur;
}



}

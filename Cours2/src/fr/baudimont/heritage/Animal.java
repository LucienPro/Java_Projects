package fr.baudimont.heritage;

import java.util.Date;

public class Animal {
	
	private Date dateNaissance;
	private String nom;

	public Date getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Animal(Date dateNaissance, String nom) {
		super();
		this.dateNaissance = dateNaissance;
		this.nom = nom;
	}

	public Animal() {
		super();
	}
	
	public void parle() {
		System.out.println("Je suis un animal");
	}

}

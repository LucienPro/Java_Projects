package fr.baudimont.heritage;

import java.util.Date;

public class Chien extends Animal {

	public Chien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Chien(Date dateNaissance, String nom) {
		super(dateNaissance, nom);
		// TODO Auto-generated constructor stub
	}
	
	public void aboyer() {
		System.out.println("MIAOUF");
	}
	
	public void parle() {
		super.parle();
		aboyer();
	}
	

}

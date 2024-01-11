package fr.baudimont.heritage;

import java.util.Date;

public class Lion extends Animal {

	public Lion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lion(Date dateNaissance, String nom) {
		super(dateNaissance, nom);
		// TODO Auto-generated constructor stub
	}
	
	public void rugir() {
		System.out.println("GROS MIAOU !");
	}
	
	public void parle() {
		super.parle();
		rugir();
	}

}

package fr.baudimont.nfp121.rappel.controller;

import fr.baudimont.nfp121.rappel.modele.Ocean;
import fr.baudimont.nfp121.rappel.vue.Cadran;

public class Controller {
	
	public Cadran monCadran;
	public Ocean monOcean;
//	private Montre maMontre;
	
	
	public Controller(Ocean pOcean) {
		monOcean = pOcean;
		this.monCadran = new Cadran(this);
		addListeners();
	}
	
	public void displayView() {
		monCadran.getFrame().setVisible(true);;
	}
	
	public void addListeners() {
		monOcean.ajouteObservateur(monCadran);
	}
	
	

}

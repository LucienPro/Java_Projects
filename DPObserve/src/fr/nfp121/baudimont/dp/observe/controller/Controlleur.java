package fr.nfp121.baudimont.dp.observe.controller;

import fr.nfp121.baudimont.dp.observe.view.Cadran;
import fr.nfp121.baudimont.dp.observe.view.Montre;
import fr.nfp121.baudimont.dp.observe.view.Web;

public class Controlleur {
	
	private Bassin monBassin;
	private Cadran monCadran;
	private Montre maMontre;
	private Web maPageWeb;

	public Controlleur(Bassin pBassin) {
		this.monBassin = pBassin;
		
		this.monCadran = new Cadran(this);
		this.maMontre = new Montre(this);
		this.maPageWeb = new Web(this);
		addObservateurs();
	}
	
	private void addObservateurs() {
		this.monBassin.ajouteObservateur(monCadran);
		this.monBassin.ajouteObservateur(maMontre);
		this.monBassin.ajouteObservateur(maPageWeb);
	}
	
	public void displayViews() {
		this.monCadran.getFrame().setVisible(true);
		this.maMontre.getFrame().setVisible(true);
		this.maPageWeb.getFrame().setVisible(true);
	}

	public Bassin getMonBassin() {
		return monBassin;
	}
	
	public void notifierChangement(int pValeur) {
		monBassin.setTemp(pValeur);
	}
}

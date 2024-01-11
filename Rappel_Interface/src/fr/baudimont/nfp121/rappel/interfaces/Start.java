package fr.baudimont.nfp121.rappel.interfaces;

import fr.baudimont.nfp121.rappel.interfaces.IDemarrable;
import fr.baudimont.nfp121.rappel.interfaces.IRevisable;
import fr.baudimont.nfp121.rappel.interfaces.Ordi;
import fr.baudimont.nfp121.rappel.interfaces.Voiture;

public class Start {

	public static void main(String[] args) {
		
		gestionInterface();
		
	}
	
	public static void gestionInterface() {
		IDemarrable monOrdi = new Ordi();
		IRevisable ma2CV = new Voiture();
		IDemarrable porsche = new Voiture();
		Voiture audi = new Voiture();
		
		gererDemarrable(monOrdi);
		gererDemarrable(porsche);
		gererRevisable(ma2CV);
		gererDemarrable(audi);
	}
	
	public static void gererDemarrable(IDemarrable pDem) {
		pDem.demarrer();
	}
	
	public static void gererRevisable(IRevisable pRev) {
		pRev.controler();
	}
}

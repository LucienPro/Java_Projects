package fr.baudimont.nfp121.rappel;

import fr.baudimont.nfp121.rappel.controller.Controller;
import fr.baudimont.nfp121.rappel.modele.Ocean;

public class Start {

	public static void main(String[] args) {
		Ocean atlantique = new Ocean(12);
		Controller cont = new Controller(atlantique);
		cont.displayView();

	}

}

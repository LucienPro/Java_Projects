package fr.baudimont.nfp121.rappel.abstracts;

import fr.baudimont.nfp121.rappel.abstracts.AAnimal;

public class Start {

	public static void main(String[] args) {
		gestionAbstraite();
	}
	
	public static void gestionAbstraite() {
		AAnimal monChat = new Chat();
		monChat.parle();
	}
}

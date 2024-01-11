package fr.baudimont.nfp121.rappel.interfaces;

public class Voiture implements IDemarrable, IRevisable {

	@Override
	public void controler() {
		System.out.println("Révision de la voiture");
		

	}

	@Override
	public void demarrer() {
		System.out.println("Démarrage de la voiture");

	}

}

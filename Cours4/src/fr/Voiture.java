package fr;

public class Voiture implements Demarrable {
	
	private boolean estDemarre;

	public void demarre() {

		setEstDemarre(true);
		
	}

	public boolean isEstDemarre() {
		return estDemarre;
	}

	public void setEstDemarre(boolean estDemarre) {
		this.estDemarre = estDemarre;
	}

}

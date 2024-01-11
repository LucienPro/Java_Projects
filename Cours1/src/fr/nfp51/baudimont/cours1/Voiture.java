package fr.nfp51.baudimont.cours1;

public class Voiture {
	
	private int puissance;
	private boolean estDemaree;
	private float vitesse;
	
	public boolean isEstDemaree() {
		return estDemaree;
	}
	public void setEstDemaree(boolean estDemaree) {
		this.estDemaree = estDemaree;
	}
	
	public float getVitesse() {
		return vitesse;
	}
	public void setVitesse(float vitesse) {
		this.vitesse = vitesse;
	}
	
	public int deQuellePuissance() {
		return puissance;
	}
	
	public void demarre() {
		this.isEstDemaree();
	}
	
	
	
	}

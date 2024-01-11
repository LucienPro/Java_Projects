
public class Poids extends Machine{
	
	private int nbPoids;

	public Poids() {
		// TODO Auto-generated constructor stub
	}
	
	public Poids(String nom, String emplacement, int nbCalorie, int nbPoids) {
		super(nom, emplacement, nbPoids);
		this.nbPoids = nbPoids;
	}

	public int getNbPoids() {
		return nbPoids;
	}

	public void setNbPoids(int nbPoids) {
		this.nbPoids = nbPoids;
	}

}

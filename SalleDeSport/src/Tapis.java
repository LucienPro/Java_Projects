
public class Tapis extends Machine{
	
	
	private int nbKms;

	public Tapis() {
		// TODO Auto-generated constructor stub
	}
	
	public Tapis(String nom, String emplacement, int nbCalorie) {
		super(nom, emplacement, nbCalorie);
	}

	public int getNbKms() {
		return nbKms;
	}

	public void setNbKms(int nbKms) {
		this.nbKms = nbKms;
	}

}

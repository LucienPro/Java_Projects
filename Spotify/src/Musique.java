
public class Musique extends Son {
	
	
	private String compositeur;

	
	public Musique() {
		// TODO Auto-generated constructor stub
	}
	
	public Musique(String titre, int duree, boolean ecoute, String compositeur) {
		super(titre, duree, ecoute);
		this.compositeur = compositeur;
		
	}

	
	public String getCompositeur() {
		return compositeur;
	}

	public void setCompositeur(String compositeur) {
		this.compositeur = compositeur;
	}

}

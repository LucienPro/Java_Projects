
public class Podcast extends Son {

	private String auteur;
	
	
	public Podcast() {
		// TODO Auto-generated constructor stub
	}
	
	public Podcast(String titre, int duree, boolean ecoute, String auteur) {
		super(titre, duree, ecoute);
		this.auteur = auteur;
	}
	
	
	public String getAuteur() {
		return auteur;
	}
	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	public String toString() {
		return auteur + " " + getTitre();
	}

}


public class Son {
	
	
	private String titre;
	private float duree;
	private boolean ecoute;

	public Son() {
		// TODO Auto-generated constructor stub
	}
	
	public Son(String titre, float duree, boolean ecoute) {
		this.titre = titre;
		this.duree = duree;
		this.ecoute = ecoute;
		
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public float getDuree() {
		return duree;
	}

	public void setDuree(float duree) {
		this.duree = duree;
	}

	public boolean isEcoute() {
		return ecoute;
	}

	public void setEcoute(boolean ecoute) {
		this.ecoute = ecoute;
	}

}

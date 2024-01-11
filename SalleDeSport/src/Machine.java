
public class Machine {

	public Machine() {
		// TODO Auto-generated constructor stub
	}
	
	public Machine(String nom, String emplacement, int nbCalorie) {
		this.nom = nom;
		this.emplacement = emplacement;
		this.nbCalorie = nbCalorie;
	}
	
	
	private String nom;
	private String emplacement;
	private int nbCalorie;
	
	
	
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getEmplacement() {
		return emplacement;
	}

	public void setEmplacement(String emplacement) {
		this.emplacement = emplacement;
	}

	public int getNbCalorie() {
		return nbCalorie;
	}

	public void setNbCalorie(int nbCalorie) {
		this.nbCalorie = nbCalorie;
	}

	

}


public class Fiche {

//Attributs
	private int id;
	private String nom;
	private String prenom;
	private int code_postal;
	private boolean positif;

	public Fiche(int id, String nom, String prenom, int code_postal, boolean positif) {
		
	}
	
//Getters & Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public int getCode_postal() {
		return code_postal;
	}
	public void setCode_postal(int code_postal) {
		this.code_postal = code_postal;
	}



	public boolean isPositif() {
		return positif;
	}

	public void setPositif(boolean positif) {
		this.positif = positif;
	}

	
	
	
}

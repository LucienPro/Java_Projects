
public class Joueur {

	/*Attribut - définit l'objet*/

	private String nom;
	private String prenom;
	private int nbreDeButs;

	
	/*Méthodes*/

	public String getNom() {
		return nom;
	}

	public String getPrenom() {
		return prenom;
	}
	
	public int getNbreDeButs() {
		return nbreDeButs;
	}
	
	public void SetNom(String nom) {
		this.nom=nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom=prenom;
	}
	
	public void setNbreDeButs(int nbreDeButs) {
		this.nbreDeButs=nbreDeButs;
	}
	
	
	
	/*Constructeur - construit l'objet*/

	public Joueur (String nom, String prenom, int nbreDeButs) {
		this.nom = nom;
		this.prenom = prenom;
		this.nbreDeButs = nbreDeButs;
	}
	
	
}

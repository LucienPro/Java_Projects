import java.util.ArrayList;

public class Utilisateur {

	private ArrayList<Entrainement> entrainements = new ArrayList<Entrainement>();
	private String nom;
	private String prenom;
	private int numMembre;
	
	public Utilisateur() {
		// TODO Auto-generated constructor stub
	}
	
	public Utilisateur(String nom, String prenom, int numMembre) {
		this.nom = nom;
		this.prenom = prenom;
		this.numMembre = numMembre;
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

	public int getNumMembre() {
		return numMembre;
	}

	public void setNumMembre(int numMembre) {
		this.numMembre = numMembre;
	}

	public ArrayList<Entrainement> getEntrainements() {
		return entrainements;
	}

	public void setEntrainements(ArrayList<Entrainement> entrainements) {
		this.entrainements = entrainements;
	}
	
	public void addEntrainement(Entrainement e) {
		entrainements.add(e);
	}
	
	
	//méthode qui liste les entrainements non effectués
	public ArrayList <Entrainement> entrainementNE(){
		ArrayList<Entrainement>resultat = new ArrayList <Entrainement>();
		for(Entrainement ent : entrainements) {
			if (!ent.isEffectue()) {
				resultat.add(ent);
			}
		}
		return resultat;	
	}
	
	//méthode qui donne le nombre d’entrainements
	
	public int nbEntrainement() {
		return entrainements.size();
	}
	
	
	//méthode qui liste les entrainement sur les presses uniquement
	public ArrayList <Entrainement> entrainementWP(){
		ArrayList<Entrainement>resultat = new ArrayList <Entrainement>();
		for(Entrainement list : entrainements) {
			if(list.getAppareil() instanceof Presse) {
				resultat.add(list);
			}
		}
		return resultat;
	}
	
}

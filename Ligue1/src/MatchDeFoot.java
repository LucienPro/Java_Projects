import java.util.ArrayList;

public class MatchDeFoot {
	
	/*Attribut*/
	
	private ArrayList<Joueur> listeDeJoueur = new ArrayList<Joueur>();
	
	
	/*Méthodes*/
	
	public ArrayList<Joueur> getListeDeJoueur() {
		return listeDeJoueur;
		
	}
	
	public void setListeDeJoueur (ArrayList<Joueur> listeDeJoueur) {
		this.listeDeJoueur=listeDeJoueur;
	}
	
	public void ajoutJoueur(Joueur player) {
		listeDeJoueur.add(player);
	}
	
	public int getNbJoueurMatch() {
		return this.listeDeJoueur.size();
	}
	
	public void addJoueur(Joueur equipe) {
		listeDeJoueur.add(equipe);
	}
	
	public Joueur getJoueur(int position) {
		return this.listeDeJoueur.get(position -1);
	}
		
	/*Constructeur*/
	
	public MatchDeFoot () {
		
	}
}

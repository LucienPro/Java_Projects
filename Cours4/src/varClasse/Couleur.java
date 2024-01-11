package varClasse;

public class Couleur {
	
	private String laCouleur;
	
	public static final Couleur ROUGE = new Couleur("rouge");
	public static final Couleur BLEU = new Couleur("bleu");
	public static final Couleur VERT = new Couleur("vert");
	
	private Couleur(String pCoul) {
		laCouleur = pCoul;
	}
	
	public String toString() {
		return laCouleur;
	}

}

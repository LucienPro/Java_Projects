package varClasse;

public class Voiture {
	
	public static int nbVoitureCree;
	
	public Couleur couleur;
	
	public Voiture() {
		nbVoitureCree++;
	}
	
	public static int vitesseMaxToleree() {
		return 130;
	}

}

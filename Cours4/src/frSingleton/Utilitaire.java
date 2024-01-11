package frSingleton;

public class Utilitaire {
	
	private static Utilitaire instance;
	private String nom;
	
	private Utilitaire(String pNom) {
		
		nom = pNom;
		
	}

	public static Utilitaire getInstance(String pNom) {
		if(instance == null) {
			instance = new Utilitaire(pNom);
		}
		return instance;
	}

	public void imprime() {
		System.out.println(nom + "Impression en cours...");
	}
	
	

}

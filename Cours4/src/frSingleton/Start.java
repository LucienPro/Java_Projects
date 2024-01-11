package frSingleton;

public class Start {

	public static void main(String[] args) {
		
		Utilitaire util = Utilitaire.getInstance("Orion");
		
		util.imprime();
		
		Utilitaire util2 = Utilitaire.getInstance("Jupiter");
		
		util2.imprime();

	}
	


}

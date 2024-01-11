import java.util.ArrayList;
import Modele.*;

public class GestionEtudiants {

	private static ArrayList<Etudiant> listeEtudiants = new ArrayList<Etudiant>();
	
	public static ArrayList<Etudiant> getListeEtudiants() {
		listeEtudiants.add(new Etudiant("001","Lucien", 12));
		listeEtudiants.add(new Etudiant("002","Leo", 16));
		listeEtudiants.add(new Etudiant("003","Max", 20));
		listeEtudiants.add(new Etudiant("004","Adrien", 5));
		return listeEtudiants;
	}
	

}

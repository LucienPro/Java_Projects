import java.util.ArrayList;

public class Programme {

	public static void main(String[] args) {
		Joueur j1 = new Joueur("Letailleur","Lucien",6);
		Joueur j2 = new Joueur("Vanderbecq","Cyrian",3);
		Joueur j3 = new Joueur("Caron","Felix",1);
		MatchDeFoot m1 = new MatchDeFoot();
		System.out.println(j1.getNom()+" "+j1.getPrenom()+" "+j1.getNbreDeButs());
		System.out.println(j2.getNom()+" "+j2.getPrenom()+" "+j2.getNbreDeButs());
		System.out.println(j3.getNom()+" "+j3.getPrenom()+" "+j3.getNbreDeButs());
		m1.addJoueur(j1);
		m1.addJoueur(j2);
		m1.addJoueur(j3);
		System.out.println(m1.getNbJoueurMatch());
		System.out.println(m1.getListeDeJoueur());
	}

}

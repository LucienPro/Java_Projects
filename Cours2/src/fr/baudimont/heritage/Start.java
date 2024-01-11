package fr.baudimont.heritage;

import java.util.Date;

public class Start {

	public static void main(String[] args) {
		
//		testAffectation();
//		testAffectation2();
//		testAffectation3();
		
		
//		System.out.println(chien1.getNom());
//		
//		chien1.aboyer();
		
		Animal animal = new Animal(new Date(),"animal");
	
		Chien chien1 = new Chien(new Date(), "Bobby");
		chien1.parle();
		chien1.aboyer();
		
		Lion Lion1 = new Lion(new Date(), "lion");
		Lion1.parle();
		Lion1.rugir();
			
	}
}

//	private static void testAffectation2() {
//		Livre livre1 = new Livre("Titre1");
//		System.out.println(livre1.getTitre());
//		livre1 = modifierLivre(livre1);
//		System.out.println(livre1.getTitre());
//		
//		Livre livre3 = livre1;
//		Livre livre4 = livre3;
//		livre4.setTitre("Nouvelle version");
//		
//		Livre livre5 = new Livre ("Titre5");
//		livre4 = livre5;
//		livre5 = livre3;
//		
//		
//	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	private static void testAffectation3() {
//		
//		Auteur auteur1 = new Auteur("Jacques");
//		Livre livre1 = new Livre("Titre 1");
//		
//		livre1.setMonAuteur(auteur1);
//		
//		modifierAuteur(auteur1);
//		
//		System.out.println(livre1.getMonAuteur().getNom());
//		
//		
//	}
//	
//	
//	private static void modifierAuteur(Auteur pAuteur1) {
//		pAuteur1.setNom("Paul");
//		
//	}
//}
//	
	

//	private static Livre modifierLivre(Livre pLivre1) {
//		pLivre1.setTitre("new Titre");
//		pLivre1 = new Livre("Titre 2");
//		return pLivre1;
//		
//	}
//
//	public static void testAffectation() {
//		Livre livre1 = new Livre("Livre1");
//		Livre livre2 = new Livre("Livre2");
//		
//		System.out.println("Titre de livre 1 : " + livre1.getTitre());
//		System.out.println("Titre de livre 2 : " + livre2.getTitre());
//		
//		livre1 = livre2;
//		
//		livre1.setTitre("Nouveau titre");
//		
//		livre1 = new Livre("Titre 3");
//		livre1.setTitre("Titre 3");
//		
//		System.out.println("Titre de livre 1 : " + livre1.getTitre());
//		System.out.println("Titre de livre 2 : " + livre2.getTitre());
//		
//	}
//}
//		









//Auteur monAuteur = new Auteur("Stephen", new Date(), 2);
//Livre monLivre = new Livre("Java : Pour les nuls", new Date(), 200, "Apprentissage", monAuteur );
//
//monAuteur.setNom("Jacques");
//
//System.out.println(monAuteur.getNom());
//System.out.println(monLivre.getMonAuteur().getNom());
//



//		Auteur monAuteur = new Auteur();
//		Livre monLivre2 = new Livre();
//		
//		monLivre2.setTitre("Java : Pour les nuls"); // Livre 2
//		
//		// Livre 1
//		
//		monLivre.setTitre("java pro");
//		monLivre.setGenre("SF");
//		monLivre.setNombreDePages(121);
//		
//		Date dateParu = new Date(); //Création d'une date de parution
//		
//		monLivre.setDateDeParution(dateParu);
//		monLivre.setMonAuteur(monAuteur);
//		
//		//Auteurs
//		
//		monAuteur.setNom("Stephen");
//		
//		//Affichage
//		
//		System.out.println(monLivre.getTitre());
//		System.out.println(monAuteur.getNom());
//		System.out.println(monLivre.getMonAuteur().getNom());





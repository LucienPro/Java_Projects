package fr.baudimont.nfp121.rappel;

public class Start {

	public static void main(String[] args) {
		
		Personne jean = new Personne("Vincentime", "Hugo");
		
		Personne max = new Etudiant("Pouleto", "Max", "Licence");
		Etudiant felix = new Etudiant("Caron","Felix", "Redoublement");
		Universite baudimont = new Universite();
		
		baudimont.setNom("Baudimont");
		felix.setMonUniv(baudimont);
		felix.getMonUniv().getNom();
		
		System.out.println(felix.getNom() + " " + felix.getPrenom() + " : " + felix.getNiveau());

		gerePersonne(jean);
		gerePersonne(felix);
		gerePersonne(max);

	}
	
	public static void gerePersonne (Personne pers) {
		System.out.println("Gestion de " + pers.getPrenom());
		System.out.println("Gestion de " + pers.getNom());
	}
	
	public static void gerePersonne (Etudiant pers) {
		System.out.println("Gestion de " + pers.getPrenom());
		System.out.println("Gestion de " +pers.getNiveau());
	}
		

}

package fr;

public class Start {

	public static void main(String[] args) {
		Demarrable voit = new Voiture();
		Demarrable ordi = new Ordinateur();

		Voiture voit2 = new Voiture();
		Ordinateur ordi2 = new Ordinateur();
		
		Personne pers = new Personne();
		pers.mettreEnRoute(voit);
		pers.mettreEnRoute(voit2);
		pers.mettreEnRoute(ordi);
		pers.mettreEnRoute(ordi2);
		
		System.out.println(voit2.isEstDemarre());
		System.out.println(ordi2.isEstDemarre());
		System.out.println(voit.isEstDemarre());
		System.out.println(ordi.isEstDemarre());
		
		pers.mettreAJour(ordi2);
		
		
	}

}

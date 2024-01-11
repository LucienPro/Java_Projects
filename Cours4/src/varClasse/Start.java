package varClasse;

public class Start {

	public static void main(String[] args) {
		
		Voiture voit = new Voiture();
		Voiture c3 = new Voiture();
		
		System.out.println(Voiture.nbVoitureCree);
		
		Voiture c3bis = new Voiture();
		System.out.println(Voiture.nbVoitureCree);
		
		voit.couleur = Couleur.ROUGE;
		voit.couleur = Couleur.VERT;
		voit.couleur = Couleur.BLEU;
		
		
		System.out.println(voit.couleur);
		
		Voiture.vitesseMaxToleree();
		voit.vitesseMaxToleree();

	}

}

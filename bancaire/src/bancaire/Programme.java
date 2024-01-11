package bancaire;

public class Programme {

	public static void main(String[] args) {
		
		
		//Création d'une personne
		
		Personne p1 = new Personne("Letailleur", "Lucien", 26);
		System.out.println(p1.getNom() + " " + p1.getPrenom() + " " + p1.getAge());
		p1.setNom("Caron");
		p1.setPrenom("Felix");
		p1.setAge(18);
		System.out.println(p1.getNom() + " " + p1.getPrenom() + " " + p1.getAge());
		
		//Création d'un compte
		
		CompteSimple cs1 = new CompteSimple(p1, 1500);
		System.out.println(cs1.getSolde());
		System.out.println(cs1.crediter(100));
		System.out.println(cs1);
		
	}

}

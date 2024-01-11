
public class Programme {
public static void main(String[] args) {
	Personne p1 = new Personne("John", "Foo", true);
	CompteSimple c1= new CompteSimple(100,p1);
	System.out.println("Le compte appartient à"+ " "+ p1.getNom() +" " + p1.getPrenom());
	System.out.println(c1.solde);
	}
}

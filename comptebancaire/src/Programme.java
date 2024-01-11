
public class Programme {
	public static void main (String[] args) {
		Personne p1 = new Personne("Xavier","test", true);
		CompteSimple cs1 = new CompteSimple(p1,123);
		CompteCourant cc1 = new CompteCourant (p1, 456);
		//System.out.println(cs1.getSolde());
		//System.out.println(cc1.getSolde());
		System.out.println(cs1);
		System.out.println(cc1);
		
		//cs1.crediter(1000);
		//System.out.println(cs1.getSolde());
		}
	}


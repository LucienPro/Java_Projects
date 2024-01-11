package MainPackage;

public class Start {
	
	public Start() {
		
	}
	
	public static void main(String[]args) {
		Voiture  v = new C2();
		v.setLibelle("C2");
		v.setPoids(500);
		v.setPrix(1000);
		
		v.toString();
		
		v = new ToitOuvrant(v);
		v.toString();
		
	}

}

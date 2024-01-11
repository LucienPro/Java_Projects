package Package_DPS;

public class Start {

	public static void main(String[]args) {
		Article livre = new Article("Mon livre", 12);
		
		PaiementStrategy payStrategy = new CarteDeCreditStrategy("111","€", "01/01/2023");
		payStrategy = new PaypalStrategy("Email", "Mdp", "0001");
		livre.getNom();
		
		System.out.println(livre.getNom());
		livre.payer(payStrategy);
		
	}
	
}

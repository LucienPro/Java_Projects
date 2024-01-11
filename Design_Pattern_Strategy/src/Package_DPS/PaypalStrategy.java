package Package_DPS;

public class PaypalStrategy implements PaiementStrategy{
	private String id;
	private String password;
	
	public PaypalStrategy(String email, String pass, String id){
	this.setId(id);
	this.setPassword(pass);
	}
	
	@Override
	public void payer(int montant) {
	System.out.println(montant + "€ payés par Paypal.");
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	}

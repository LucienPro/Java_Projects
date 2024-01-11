package Package_DPS;

public class CarteDeCreditStrategy implements PaiementStrategy {

	private String numeroCarte;
	private String cryptogramme;
	private String dateExpiration;
	public CarteDeCreditStrategy(String num, String crypto, String 
	date) {
	this.setNumeroCarte(num);
	this.setCryptogramme(crypto);
	this.setDateExpiration(date);
	}
	@Override
	public void payer(int montant) {
	System.out.println(montant + "€ payés par carte de crédit.");
	}
	public String getNumeroCarte() {
		return numeroCarte;
	}
	public void setNumeroCarte(String numeroCarte) {
		this.numeroCarte = numeroCarte;
	}
	public String getCryptogramme() {
		return cryptogramme;
	}
	public void setCryptogramme(String cryptogramme) {
		this.cryptogramme = cryptogramme;
	}
	public String getDateExpiration() {
		return dateExpiration;
	}
	public void setDateExpiration(String dateExpiration) {
		this.dateExpiration = dateExpiration;
	}
	}

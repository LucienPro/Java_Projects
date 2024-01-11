
public class Telephone {

	private Boussole boussole;
	
	public Boussole getBoussole() {
		return boussole;
	}
	
	public void setBoussole(Boussole boussole) {
		this.boussole = boussole;
	}
	
	public GPS getGPS() {
		return boussole.getPosition();
	}

}

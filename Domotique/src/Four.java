
public class Four implements ObjetElectrique, ObjetDomotique {

	public Four(boolean etat) {
		this.etat = etat;
	}
	
	private boolean etat = false;
	private int temperature = 0;
	
	
	@Override
	public void allumer() {
		this.etat = true;
	}
	
	@Override
	public void eteindre() {
		this.etat = false;
		this.temperature = 0;
		
	}
	
	public void chauffer(int temperature) {
		if (etat==true) {
			this.temperature = temperature;
		}
	}
	
	public void initialiser() {
	}
	
	@Override
	public boolean getEtat() {
		return this.etat;
	}
	
	public int getTemperature() {
		return this.temperature;
	}
	


	
	

}

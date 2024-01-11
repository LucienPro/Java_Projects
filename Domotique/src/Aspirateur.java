
public class Aspirateur implements ObjetElectrique, ObjetDomotique {

	public Aspirateur() {
		// TODO Auto-generated constructor stub
	}
	
	public boolean etat = false;
	
	@Override
	public void allumer() {
		etat = true;
	}
	
	@Override
	public void eteindre() {
		etat = false;
	}
	
	@Override
	public boolean getEtat() {
		return this.etat;
	}
	
	public void initialiser() {
	}
	


}

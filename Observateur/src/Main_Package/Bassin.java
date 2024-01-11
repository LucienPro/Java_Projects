package Main_Package;

public class Bassin extends A_Observe {
	
	private int temp;
	
	public Bassin() {
		
	}
	
	public Bassin(int pTemp) {
		super();
		this.temp = pTemp;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
		notifier();
	}




	

}

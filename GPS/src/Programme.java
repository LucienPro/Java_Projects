
public class Programme {

	public static void main(String[] args) {
		Telephone tel = new Telephone();
		Boussole wifib = new Wifi();
		tel.setBoussole(wifib);
		tel.getGPS();
		
		Boussole gsmb = new GSM();
		tel.setBoussole(gsmb);
		tel.getGPS();
	}

}

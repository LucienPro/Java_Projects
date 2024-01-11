
public class Wifi implements Boussole {

	@Override
	public GPS getPosition() {
		GPS gsm1 = new GPS(1,1);
		System.out.println("La position Wifi est :" + gsm1);
		return gsm1;
	}

}

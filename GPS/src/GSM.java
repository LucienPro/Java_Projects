
public class GSM implements Boussole{

	@Override
	public GPS getPosition() {
		System.out.println("La position GSM est : ");
		return new GPS(1,1);
	}

}


public class Satellite implements Boussole {

	@Override
	public GPS getPosition() {
		System.out.println("La position Satellite est : ");
		return new GPS(3,3);
	}
}

package MainPackage;

public class GPS extends DecorateurVoiture {

	@Override
	public String getLibelle() {

		return maVoiture.getLibelle() + " Avec GPS";
	}

	@Override
	public int getPrix() {

		return maVoiture.getPrix() + 250;
	}

	@Override
	public int getPoids() {

		return maVoiture.getPoids() + 2;
	}

}

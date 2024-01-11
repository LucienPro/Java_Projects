package MainPackage;

public class Regulateur extends DecorateurVoiture {

	@Override
	public String getLibelle() {

		return maVoiture.getLibelle() + " Avec Regulateur";
	}

	@Override
	public int getPrix() {

		return maVoiture.getPrix() + 1000;
	}

	@Override
	public int getPoids() {

		return maVoiture.getPoids() + 5;
	}

}

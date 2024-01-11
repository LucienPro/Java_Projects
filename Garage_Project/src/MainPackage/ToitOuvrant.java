package MainPackage;

public class ToitOuvrant extends DecorateurVoiture {

	@Override
	public String getLibelle() {

		return maVoiture.getLibelle() + " Avec toit ouvrant";
	}

	@Override
	public int getPrix() {

		return maVoiture.getPrix() + 1000;
	}

	@Override
	public int getPoids() {

		return maVoiture.getPoids() + 10;
	}


	
	public ToitOuvrant(Voiture v) {
		this.maVoiture = v;
	}
}

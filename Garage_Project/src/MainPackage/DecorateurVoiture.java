package MainPackage;

public abstract class DecorateurVoiture extends Voiture {
	
	protected Voiture maVoiture;

	@Override
	public abstract String getLibelle();

	@Override
	public abstract int getPrix();

	@Override
	public abstract int getPoids();


	
	



}

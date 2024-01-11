package fr.baudimont.nfp121.rappel.adaptateur;

public class AdaptManuscrit implements IImprimable {
	
	private Manuscrit manu;

	public AdaptManuscrit(Manuscrit pManu) {
		this.manu = pManu;
	}
	
	@Override
	public void imprimer() {
		manu.print();
	}
}

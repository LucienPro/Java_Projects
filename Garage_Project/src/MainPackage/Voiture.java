package MainPackage;

public class Voiture {
	
//Data
	
	private String libelle;
	private int Prix;
	private int Poids;


//Methodes
	
	public String getLibelle() {
		return libelle;
	}
	
	protected void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	
	public int getPrix() {
		return Prix;
	}
	
	protected void setPrix(int prix) {
		Prix = prix;
	}
	
	public int getPoids() {
		return Poids;
	}
	
	protected void setPoids(int poids) {
		Poids = poids;
	}
	
	public String toString() {
		String result = "Voiture :" + getLibelle() + " Prix :" + getPrix() + " Prix :" + getPoids();
		System.out.println(result);
		return result;
	}


	
	
	
	

}

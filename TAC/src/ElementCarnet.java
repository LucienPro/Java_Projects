
public abstract class ElementCarnet {

//Attributs
	
	private String date_vaccin;
	private boolean resultat_vaccin;

	
//Constructeurs
public ElementCarnet() {
		super();
		// TODO Auto-generated constructor stub
	}



	//Getters & Setters	
	public String getDate_vaccin() {
		return date_vaccin;
	}

	public void setDate_vaccin(String date_vaccin) {
		this.date_vaccin = date_vaccin;
	}

	public boolean getResultat_vaccin() {
		return resultat_vaccin;
	}

	public void setResultat_vaccin(boolean resultat_vaccin) {
		this.resultat_vaccin = resultat_vaccin;
	}
}

import java.util.ArrayList;

public class Tousanticovid {

//Attributs
	private CarnetVaccinal carnetVaccinal;
	private ArrayList<Fiche>List_Fiche = new ArrayList<Fiche>();
	private Fiche fiche;
	
	
//Constructeurs
	public Tousanticovid() {
		List_Fiche = new ArrayList<Fiche>();
	}
	
//Getters & setters
	
	public ArrayList<Fiche> getList_Fiche() {
		return List_Fiche;
	}

	public void setList_Fiche(ArrayList<Fiche> list_Fiche) {
		List_Fiche = list_Fiche;
	}

	public CarnetVaccinal getCarnetVaccinal() {
		return carnetVaccinal;
	}

	public void setCarnetVaccinal(CarnetVaccinal carnetVaccinal) {
		this.carnetVaccinal = carnetVaccinal;
	}

	public Fiche getFiche() {
		return fiche;
	}

	public void setFiche(Fiche fiche) {
		this.fiche = fiche;
	}
	
	public void addFiche(Fiche fiche) {
		List_Fiche.add(fiche);
	}
	
	public boolean isCasContact() {
		for (Fiche f: List_Fiche) {
			if (f.isPositif()) {
				return true;	
				}
		}
		return false;
	}
	
	public void isVaccin() {
		
	}
}

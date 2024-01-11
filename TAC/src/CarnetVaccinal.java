import java.util.ArrayList;

public class CarnetVaccinal {

//Attributs
	private ArrayList<Test>List_Test = new ArrayList<Test>();
	private ArrayList<Vaccin>List_Vaccin = new ArrayList<Vaccin>();

	
//Constructeurs
	public CarnetVaccinal() {
		
	}
	
//Getters & Setters
	public ArrayList<Test> getList_Test() {
		return List_Test;
	}

	public void setList_Test(ArrayList<Test> list_Test) {
		List_Test = list_Test;
	}

	public ArrayList<Vaccin> getList_Vaccin() {
		return List_Vaccin;
	}

	public void setList_Vaccin(ArrayList<Vaccin> list_Vaccin) {
		List_Vaccin = list_Vaccin;
	}
	
	public void addVaccin(Vaccin vaccin) {
		List_Vaccin.add(vaccin);
	}
	
	public void addTest(Test test) {
		List_Test.add(test);
	}
}

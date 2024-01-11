
public class Programme {

	public Programme() {
	}

	public static void main(String[] args) {
		
		//Instanciation de TousAntiCovid
		Tousanticovid t1 = new Tousanticovid();
		
		//Création de ma fiche personnel
		Fiche f1 = new Fiche(1, "Letailleur", "Lucien", 59500, false);
		
		//Instanciation du Carnet Vaccinal
		CarnetVaccinal cv1 = new CarnetVaccinal();
		
		//Création vaccin
		Test test = new Test();
		cv1.addTest(test);
		
		//Création test
		Vaccin Vaccin1 = new Vaccin();
		cv1.addVaccin(Vaccin1);
		
		//Création de contacts dans la liste fiche
		Fiche f2 = new Fiche(2, "Poulet", "Leo", 62000, false);
		Fiche f3 = new Fiche(3, "Roger", "Maxence", 62000, true);
		

		//Ajout de contact dans la liste
		t1.addFiche(f2);
		t1.addFiche(f3);

		
		t1.setFiche(f1);
		t1.getCarnetVaccinal().getList_Vaccin().add(Vaccin1);
		
		System.out.println(t1.isCasContact());
	}

}

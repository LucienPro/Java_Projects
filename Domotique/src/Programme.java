import java.util.ArrayList;

public class Programme {

	public static void main(String[] args) {
		Four four1 = new Four(false);
		Lampe l1 = new Lampe();
		Aspirateur a1 = new Aspirateur();
		System.out.println("Le four est " + four1.getEtat());
		four1.allumer();
		System.out.println("Le four est " + four1.getEtat());
		four1.eteindre();
		System.out.println("Le four est " + four1.getEtat());
		four1.chauffer(200);
		System.out.println(four1.getTemperature());
		four1.allumer();
		four1.chauffer(200);
		System.out.println(four1.getTemperature());
		four1.eteindre();
		
		
		
		ArrayList<ObjetElectrique>elementsElectriques = new ArrayList<ObjetElectrique>();
		elementsElectriques.add(four1);
		elementsElectriques.add(l1);
		elementsElectriques.add(a1);
		
//		for (int i = 0; i < elementsElectriques.size(); i++) {
//			ObjetElectrique objetElectrique = elementsElectriques.get(i);
//			objetElectrique.allumer();;
//			System.out.println(objetElectrique);
//		}
		
		for (ObjetElectrique objetElectrique:elementsElectriques) {
			System.out.println(objetElectrique);
			objetElectrique.allumer();
		}
		
		
		ArrayList<ObjetDomotique>elementsDomotiques = new ArrayList<ObjetDomotique>();
		elementsDomotiques.add(four1);
		elementsDomotiques.add(l1);
		elementsDomotiques.add(a1);
		
		for (ObjetDomotique objetDomotique:elementsDomotiques) {
			System.out.println(objetDomotique);
			objetDomotique.initialiser();
		}

		
		
		
	}

}

import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ConsoException {
//		Scanner reader = new Scanner(System.in);  // Reading from System.in
//		System.out.println("Entrez un nombre de kilomètres: ");
//		int kilometrage = reader.nextInt(); // Scans the next token of the input as an int.
//		System.out.println("Entrez un nombre de litres: ");
//		int litre = reader.nextInt();
//		//once finished
//		reader.close();
//		int Consommation = litre * 100 / kilometrage;
//		System.out.println(Consommation);
		int conso = calculConso();
		System.out.println(conso);
	}
	
	public static int calculConso() throws ConsoException {
		Scanner reader = new Scanner(System.in);  // Reading from System.in
		System.out.println("Entrez un nombre de kilomètres: ");
		int kilometrage = reader.nextInt(); // Scans the next token of the input as an int.
		System.out.println("Entrez un nombre de litres: ");
		int litre = reader.nextInt();
		//once finished
		reader.close();
		if (kilometrage == 0) {
			throw new ConsoException();
		}
		int Consommation = litre * 100 / kilometrage;
		System.out.println(Consommation);
		return Consommation;
	}
}

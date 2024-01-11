package fr.baudimont.nfp121.rappel.adaptateur;

public class Start {

	public static void main(String[] args) {
		PDF monPdf = new PDF();
		GestionImpression gestImp = new GestionImpression();
		gestImp.sortirDoc(monPdf);
		Manuscrit monManu = new Manuscrit();
		
		AdaptManuscrit adaptManu = new AdaptManuscrit(monManu);
		
		gestImp.sortirDoc(adaptManu);

	}
}

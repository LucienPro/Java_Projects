package fr.baudimont.nfp121.rappel;

public class Etudiant extends Personne {
	
	private String niveau;
	private Universite monUniv;

	public Universite getMonUniv() {
		return monUniv;
	}

	public void setMonUniv(Universite monUniv) {
		this.monUniv = monUniv;
	}

	public Etudiant() {
		super();
	}

	public Etudiant(String pNom, String pPrenom) {
		super(pNom, pPrenom);
	}
	
	public Etudiant(String pNom, String pPrenom, String pNiveau) {
		super(pNom, pPrenom);
		niveau = pNiveau;
	}
	
	public Etudiant(String pNom, String pPrenom, String pNiveau, Universite pUniv) {
		super(pNom, pPrenom);
		niveau = pNiveau;
		monUniv = pUniv;
	}

	public String getNiveau() {
		return niveau;
	}

	public void setNiveau(String niveau) {
		this.niveau = niveau;
	}
	
	public String getPrenom() {
		System.out.println("getPrenom de la classe Etudiant");
		return super.getPrenom();
	}


}

public class Personne {


	/** le nom */
	private String nom;
	/** le pr√©nom */
	private String prenom;
	/** est-ce un homme ? */
	private boolean man;
	
	private int age;
	
	public void setAge(int age) {
		if (age<0) {
			System.out.println("L'‚ge ne peut pas Ítre nÈgatif");
		}else {
			this.age=age;
		}
	}
	
	public int getAge(){
		return age;
	}
	
	public Personne(String prenom, String nom, boolean man) {
		this.nom = nom;
		this.prenom = prenom;
		this.man = man;
	}

	public String getNom() {
		return this.nom;
	}

	public String getPrenom() {
		return this.prenom;
	}

	public boolean isMan() {
		return this.man;
	}

	public boolean isWoman() {
		return ! isMan();
	}

	public void afficher() {
		System.out.print(this);
	}

	public String toString() {
		return (this.man ? "M." : "Mme")
			+ ' ' + this.prenom + ' ' + this.nom;
	}

}

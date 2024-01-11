package bancaire;

public class Personne {
	
	
//attributs
	
	
	private String nom;
	private String prenom;
	private int age;

	
//Constructeurs
	
	
	public Personne(String nom, String prenom, int age) {
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
	}
	
	
//Méthodes
	
	//getters
	
	public String getNom() {
		return nom;
	}
	
	public String getPrenom() {
		return prenom;
	}
	
	public int getAge() {
		return age;
	}
	
	//setters
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setAge(int age) {
		if (age > 0) {
			this.age = age;
		} else {
			System.out.println("Merci de saisir un age supérieur à 0.");
		}
		
	}

}


public class Personnage {

	//attributs
	
	private int age;
	public double taille;
	public String cheveux;
	private int vie;
	
	//constructeur
	
	public Personnage(int age, double taille, String cheveux,int vie) {
		this.age = age;
		this.taille = taille;
		this.cheveux = cheveux;
		this.vie = vie;
	}
	
	//méthodes
	public int getVie() {
		return vie;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age=age;
	}

}

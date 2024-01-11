package Package_Test_Personne;

public class Start {

	public Start() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		TraitementUser tu = new TraitementUser();
		Utilisateur user1 = new Utilisateur();
		tu.gererUser(user1);
		
		User2 user2 = new User2();
		AdaptateurUser2 adpaptU2 = new AdaptateurUser2(user2);
		tu.gererUser(adpaptU2);

	}

}

package Package_Test_Personne;

public class AdaptateurUser2 implements IUser {
	private User2 user2;
	
	public AdaptateurUser2(User2 pUser2) {
		this.user2 = pUser2;
	}

	@Override
	public void afficher() {
		user2.show();
		
	}
	
	

}

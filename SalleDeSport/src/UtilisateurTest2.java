import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import junit.framework.Assert;

/**
 * 
 */

/**
 * @author Lucien
 *
 */
class UtilisateurTest2 {

	/**
	 * Test method for {@link Utilisateur#entrainementNE()}.
	 */
	@Test
	void testEntrainementNE() {
		
		Bench b1 = new Bench("Machine1","droite", 500, 20);
		Presse p1 = new Presse("Machine2", "gauche", 375, 20);
		Tapis t1 = new Tapis("Machine3", "droite", 400);
		
		Utilisateur u1 = new Utilisateur("Letailleur", "Lucien", 1001);
		Utilisateur u2 = new Utilisateur("Caron", "Felix", 1002);
		
		Entrainement e1 = new Entrainement(b1 , 20, "20/03/2022" ,true);
		Entrainement e2 = new Entrainement(p1 , 30, "29/03/2022", false);
		
		u1.addEntrainement(e1);
		u1.addEntrainement(e2);

		ArrayList<Entrainement> resultat = u1.entrainementNE();
		
		Assert.assertEquals("message",e1, resultat.get(0));

	}

	/**
	 * Test method for {@link Utilisateur#nbEntrainement()}.
	 */
	@Test
	void testNbEntrainement() {
		fail("Not yet implemented"); // TODO
	}

	/**
	 * Test method for {@link Utilisateur#entrainementWP()}.
	 */
	@Test
	void testEntrainementWP() {
		fail("Not yet implemented"); // TODO
	}

}

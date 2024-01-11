package Package_Swing_test;

import javax.swing.SwingUtilities;

public class Calculatrice {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				CalculatriceFenetre fenetre = new CalculatriceFenetre();
				fenetre.setVisible(true);
			}
		});
	}
}

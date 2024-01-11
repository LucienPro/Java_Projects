package Package_Swing_test;

import javax.swing.JFrame;

public class SimpleFenetre extends JFrame{
	public SimpleFenetre(){
		super();
		build();//On initialise notre fenêtre
	}

	private void build(){
		setTitle("Ma première fenêtre"); //On donne un titre à l'application
		setSize(320,240); //On donne une taille à notre fenêtre
		setLocationRelativeTo(null); //On centre la fenêtre sur l'écran
	}
}


package Package_Swing_test;

import javax.swing.JFrame;

public class SimpleFenetre extends JFrame{
	public SimpleFenetre(){
		super();
		build();//On initialise notre fen�tre
	}

	private void build(){
		setTitle("Ma premi�re fen�tre"); //On donne un titre � l'application
		setSize(320,240); //On donne une taille � notre fen�tre
		setLocationRelativeTo(null); //On centre la fen�tre sur l'�cran
	}
}


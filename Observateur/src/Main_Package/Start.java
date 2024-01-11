package Main_Package;

import java.awt.EventQueue;

public class Start {

	public Start() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Bassin monBassin = new Bassin(15);
					Cadran cadran1 = new Cadran(monBassin);
					monBassin.ajouteObservateur(cadran1);
					Montre montre1 = new Montre(monBassin);
					monBassin.ajouteObservateur(montre1);
					Web window = new Web(monBassin);
					monBassin.ajouteObservateur(window);
					cadran1.getFrame().setVisible(true);
					window.getFrame().setVisible(true);
					monBassin.setTemp(12);	
					monBassin.setTemp(13);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});

	}
}


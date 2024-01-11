package fr.nfp121.baudimont.dp.observe;

import java.awt.EventQueue;

import fr.nfp121.baudimont.dp.observe.model.Bassin;
import fr.nfp121.baudimont.dp.observe.view.Cadran;
import fr.nfp121.baudimont.dp.observe.view.Montre;
import fr.nfp121.baudimont.dp.observe.view.Web;

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
					cadran1.getFrame().setVisible(true);
					
					Montre montre1 = new Montre(monBassin);
					monBassin.ajouteObservateur(montre1);
					montre1.getFrame().setVisible(true);
					
					Web window = new Web(monBassin);
					monBassin.ajouteObservateur(window);
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

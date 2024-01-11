package fr.nfp121.baudimont.dp.observe;

import fr.nfp121.baudimont.dp.observe.controller.Controlleur;
import fr.nfp121.baudimont.dp.observe.model.Bassin;

public class StartMVC {

	public StartMVC() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		Bassin monBassin = new Bassin(12);
		Controlleur cont = new Controlleur(monBassin);
		cont.displayViews();
	}
}

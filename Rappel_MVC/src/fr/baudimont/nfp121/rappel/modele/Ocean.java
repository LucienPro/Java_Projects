package fr.baudimont.nfp121.rappel.modele;

import fr.baudimont.nfp121.rappel.dpobserve.AObserve;

public class Ocean extends AObserve {
	
	private int temperature;
	
	public Ocean(int temperature) {
		super();
		this.temperature = temperature;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
		notifier();
	}



}

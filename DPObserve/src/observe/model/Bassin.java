package fr.nfp121.baudimont.dp.observe.model;

import fr.nfp121.baudimont.dp.observe.dpobserve.AObserve;

public class Bassin extends AObserve {

	private int temp;
	
	public Bassin() {
	}
	
	public Bassin(int pTemp) {
		this.temp = pTemp;
	}

	public int getTemp() {
		return temp;
	}

	public void setTemp(int temp) {
		this.temp = temp;
		notifier();
	}

}

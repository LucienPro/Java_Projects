package fr.baudimont.nfp121.rappel.dpobserve;

import java.util.LinkedList;
import java.util.List;

public abstract class AObserve {
	
	private List<IObservateur>lstobs = new LinkedList<IObservateur>();
	
	public void ajouteObservateur(IObservateur obs) {
		lstobs.add(obs);
	}
	
	public void supprimeObservateur(IObservateur obs) {
		lstobs.remove(obs);
	}
	
	public void notifier() {
		for(IObservateur obs : lstobs) {
			obs.miseAJour();
		}
	}

}

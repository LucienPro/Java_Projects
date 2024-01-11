package fr.nfp121.baudimont.dp.observe.dpobserve;

import java.util.LinkedList;
import java.util.List;

public abstract class AObserve {

	private List <IObservateur>lstObservateur = new LinkedList<IObservateur>();
	
	public void ajouteObservateur(IObservateur obs) {
		lstObservateur.add(obs);
	}
	public void supprimerObservateur(IObservateur obs) {
		lstObservateur.remove(obs);
	}
	protected void notifier() {
		for(IObservateur obs : lstObservateur) {
			obs.miseAJour();
		}
	}
}

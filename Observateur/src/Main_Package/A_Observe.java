package Main_Package;

import java.util.LinkedList;
import java.util.List;

public abstract class A_Observe {
	
	private List <I_Observateur>lstObservateur = new LinkedList<I_Observateur>();
	
	public void ajouteObservateur(I_Observateur obs) {
		
		lstObservateur.add(obs);
		
	}
	
	public void supprimerObservateur(I_Observateur obs) {
		
		lstObservateur.remove(obs);
		
	}
	
	protected void notifier() {
		
		for(I_Observateur obs : lstObservateur) {
			
			obs.miseAJour();
		}
		
	}

}

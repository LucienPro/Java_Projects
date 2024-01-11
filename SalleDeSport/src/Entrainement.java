

public class Entrainement {
	
	
	private Machine appareil;
	private int duree;
	private String date;
	private boolean effectue;


	public Entrainement() {
		// TODO Auto-generated constructor stub
	}
	
	public Entrainement (Machine appareil, int duree, String date, boolean effectue) {
		this.appareil = appareil;
		this.duree = duree;
		this.date = date;
		this.effectue = effectue;
	}



	public Machine getAppareil() {
		return appareil;
	}

	public void setAppareil(Machine appareil) {
		this.appareil = appareil;
	}

	public int getDuree() {
		return duree;
	}
	
	public void setDuree(int duree) {
		this.duree = duree;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public boolean isEffectue() {
		return effectue;
	}

	public void setEffectue(boolean effectue) {
		this.effectue = effectue;
	}
	
	

}

package frAbastract;

public abstract class VoitureDecapotable {
	
	private boolean estToitReplie;
	
	public abstract void replieLeToit();

	public boolean isEstToitReplie() {
		return estToitReplie;
	}

	public void setEstToitReplie(boolean estToitReplie) {
		this.estToitReplie = estToitReplie;
	}

}

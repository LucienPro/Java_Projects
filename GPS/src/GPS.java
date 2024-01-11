
public class GPS implements Boussole {

//attributs
	
	private float latitude;
	private float longitude;

// Constructeurs
	
	public GPS(float latitude, float longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}
	
// Méthodes
	
	@Override
	public GPS getPosition() {
		return null;
	}
	
// Getters
	public float getLatitude() {
		return latitude;
	}
	
	public void setLatitude(Float latitude) {
		this.latitude = latitude;
	}
	
	public float getLongitude() {
		return this.longitude;
	}
	
	public void setLongitude(Float longitude) {
		this.longitude = longitude;
	}

// Setters
	@Override
	public String toString() {
		return "GPS [latitude =" + latitude +", longitude = " + longitude + "]";
	}
	

}

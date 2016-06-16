package android.location;

public class Location {
    public static final int FORMAT_DEGREES = 0;
    public static final int FORMAT_MINUTES = 1;
    public static final int FORMAT_SECONDS = 2;
    
    private double latitude = 38.53203;
    private double longtitude = -121.759603;
    private double altitude = 0;
    private float speed = -1;
    
    public double getLatitude() {
       return latitude; 
    }

    public void setLatitude(double latitude) {
       this.latitude = latitude;  
    }

    public double getLongitude() {
       return longtitude; 
    }

    public void setLongitude(double longitude) {
       this.longtitude = longitude; 
    }

    public boolean hasAltitude() {
       if (altitude != 0) {
    	   return true;
       }
       return false;
    }

    public double getAltitude() {
       return altitude;
    }

    public void setAltitude(double altitude) {
    	this.altitude = altitude;
    }

    public void removeAltitude() {
    	altitude = 0;
    }

    public boolean hasSpeed() {
        if (speed == -1) {
        	return false;
        }
        return true;
    }

    public float getSpeed() {
    	return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }
}

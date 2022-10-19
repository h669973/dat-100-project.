package no.hvl.dat100ptc.oppgave1;

import no.hvl.dat100ptc.TODO;

public class GPSPoint {

	private int time;
	private double latitude;
	private double longitude;
	private double elevation;

	public GPSPoint(int time, double latitude, double longitude, double elevation) {

		// TODO - konstruktør
		this.time = time;
		this.latitude = latitude;
		this.longitude = longitude;
		this.elevation = elevation;

	}

	// TODO - get/set metoder
	public int getTime() {

		return time;
		
	

	}

	public void setTime(int time) {

		
		
	

	}

	public double getLatitude() {

		return latitude;
		
		//throw new UnsupportedOperationException(TODO.method());

	}

	public void setLatitude(double latitude) {

		

	}

	public double getLongitude() {

		return longitude;

	}

	public void setLongitude(double longitude) {

		

	}

	public double getElevation() {

		return elevation;

	}

	public void setElevation(double elevation) {

		

	}

	public String toString() {

		String str;

		 str = getTime()+ " (" + getLatitude() + ","+ getLongitude() + ") "  + getElevation ()+ "\n";
	  return str;

	}
}

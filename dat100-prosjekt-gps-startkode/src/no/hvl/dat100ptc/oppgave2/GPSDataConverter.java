package no.hvl.dat100ptc.oppgave2;

import no.hvl.dat100ptc.TODO;
import no.hvl.dat100ptc.oppgave1.GPSPoint;

public class GPSDataConverter {

	// konverter tidsinformasjon i gps data punkt til antall sekunder fra midnatt
	// dvs. ignorer information om dato og omregn tidspunkt til sekunder
	// Eksempel - tidsinformasjon (som String): 2017-08-13T08:52:26.000Z
	// skal omregnes til sekunder (som int): 8 * 60 * 60 + 52 * 60 + 26

	private static int TIME_STARTINDEX = 11; // posisjon for start av tidspunkt i timestr

	public static int toSeconds(String timestr) {

		int secs;
		int hr = 8, min = 52, sec = 26;

		String str = "";
		str = hr * 60 * 60 + min * 60 + sec + "";
		secs = Integer.parseInt(str);

		return secs;

	}

	public static GPSPoint convert(String timeStr, String latitudeStr, String longitudeStr, String elevationStr) {
		
//		String[] timeString = timeStr.split("T");
//		String time = timeString[1];
//		String[] timeSomethingString = time.split(":");
//		
//		timeSomethingString[2]
		
	
		int time =Integer.parseInt(timeStr);
	    double latitude = Double.parseDouble(elevationStr);
	    double longitude = Double.parseDouble(longitudeStr);
	    double elevation = Double.parseDouble(elevationStr);
	    GPSPoint gpspoint = new GPSPoint(time,latitude,longitude,elevation);
	    return gpspoint;
	}

}

package com.afkl.exercises.spring.locations;

import lombok.Value;

@Value
public class Coordinates{

    private double latitude, longitude;

	public final double getLatitude() {
		return latitude;
	}


	public final double getLongitude() {
		return longitude;
	}



	
}

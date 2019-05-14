package com.afkl.cases.df.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class Coordinates{

	@JsonProperty("latitude")
    private double latitude;
	
	@JsonProperty("longitude")
    private double longitude;
    
	public final double getLatitude() {
		return latitude;
	}
	public final void setLatitude(final double latitude) {
		this.latitude = latitude;
	}
	public final double getLongitude() {
		return longitude;
	}

	public final void setLongitude(final double longitude) {
		this.longitude = longitude;
	}
}

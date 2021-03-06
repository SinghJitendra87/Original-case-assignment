package com.afkl.cases.df.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonUnwrapped;

import lombok.Value;

@Value
public class Locations {

	@JsonUnwrapped
	@JsonProperty("locations")
	private List<Location> locations;

	public Locations() {
		super();
	}

	public final List<Location> getLocations() {
		return locations;
	}

	public final void setLocations(final List<Location> locations) {
		this.locations = locations;
	}

}

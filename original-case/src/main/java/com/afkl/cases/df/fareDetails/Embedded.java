package com.afkl.cases.df.fareDetails;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class Embedded {

	@JsonProperty("_embedded")
	Locations locations;

	/*
	 * @JsonUnwrapped
	 * 
	 * @JsonProperty("_embedded") Location[] locations;
	 */

	@JsonProperty("page")
	Page page;



	public final Locations getLocations() {
		return locations;
	}

	public final void setLocations(Locations locations) {
		this.locations = locations;
	}

	public final Page getPage() {
		return page;
	}

	public final void setPage(Page page) {
		this.page = page;
	}

}

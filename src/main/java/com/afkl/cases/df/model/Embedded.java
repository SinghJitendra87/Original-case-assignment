package com.afkl.cases.df.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class Embedded {

	@JsonProperty("_embedded")
	private Locations locations;

	@JsonProperty("page")
	Page page;

	public final Locations getLocations() {
		return locations;
	}

	public final void setLocations(final Locations locations) {
		this.locations = locations;
	}

	public final Page getPage() {
		return page;
	}

	public final void setPage(final Page page) {
		this.page = page;
	}

}

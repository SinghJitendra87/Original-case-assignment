package com.afkl.cases.df.model;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class Location implements Serializable, Comparable<Location> {

	private static final long serialVersionUID = 1L;

	@JsonProperty("code")
	private String code;

	@JsonProperty("name")
	private String name;

	@JsonProperty("description")
	private String description;

	public Location() {
		super();
	}

	public String getCode() {
		return code;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	@Override
	public int compareTo(final Location location) {
		return this.code.compareTo(location.code);
	}

}

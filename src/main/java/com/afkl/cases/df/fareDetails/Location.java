package com.afkl.cases.df.fareDetails;

import java.io.Serializable;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

//@JsonInclude(NON_NULL)
@Value
public class Location implements Serializable,Comparable<Location>{

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
	public int compareTo(Location location) {
		return this.code.compareTo(location.code);
	}
    
}

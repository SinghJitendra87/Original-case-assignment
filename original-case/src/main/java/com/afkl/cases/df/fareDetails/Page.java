package com.afkl.cases.df.fareDetails;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Value;

@Value
public class Page {

	@JsonProperty("size")
	private int size;
	
	@JsonProperty("totalElements")
	private int totalElements;
	
	@JsonProperty("totalPages")
	private int totalPages;
	
	@JsonProperty("number")
	private int number;
	
	public final int getSize() {
		return size;
	}
	public final void setSize(int size) {
		this.size = size;
	}
	public final int getTotalElements() {
		return totalElements;
	}
	public final void setTotalElements(int totalElements) {
		this.totalElements = totalElements;
	}
	public final int getTotalPages() {
		return totalPages;
	}
	public final void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}
	public final int getNumber() {
		return number;
	}
	public final void setNumber(int number) {
		this.number = number;
	}
	
	
	
}

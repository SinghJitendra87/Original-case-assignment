package com.afkl.cases.df.fareDetails;

import lombok.Value;

@Value
public class Fare {

    double amount;
    Currency currency;
    String origin, destination;
    public Fare() {
    	super();
    }
	public Fare(double amount, Currency currency, String origin, String destination) {
		super();
		this.amount = amount;
		this.currency = currency;
		this.origin = origin;
		this.destination = destination;
	}
	public final double getAmount() {
		return amount;
	}
	public final void setAmount(double amount) {
		this.amount = amount;
	}
	public final Currency getCurrency() {
		return currency;
	}
	public final void setCurrency(Currency currency) {
		this.currency = currency;
	}
	public final String getOrigin() {
		return origin;
	}
	public final void setOrigin(String origin) {
		this.origin = origin;
	}
	public final String getDestination() {
		return destination;
	}
	public final void setDestination(String destination) {
		this.destination = destination;
	}
	
	
	
}

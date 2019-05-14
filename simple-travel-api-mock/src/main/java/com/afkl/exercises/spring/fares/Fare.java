package com.afkl.exercises.spring.fares;

import lombok.Value;

@Value
public class Fare {

    double amount;
    Currency currency;
    String origin, destination;
	public Fare(double amount, Currency currency, String origin, String destination) {
		super();
		this.amount = amount;
		this.currency = currency;
		this.origin = origin;
		this.destination = destination;
	}
	public double getAmount() {
		return amount;
	}

	public Currency getCurrency() {
		return currency;
	}
	
	public String getOrigin() {
		return origin;
	}

	public String getDestination() {
		return destination;
	}
	
	
	
	
}

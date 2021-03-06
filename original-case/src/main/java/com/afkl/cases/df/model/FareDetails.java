package com.afkl.cases.df.model;

public class FareDetails {

	private double amount;
	private Currency currency;
	private String originCode, originName, originDescription, destinationCode, destinationName, destinationDescription;

	
	
	public FareDetails() {
		super();
	}

	public FareDetails(final double amount, final Currency currency, final String originCode, final String originName, final String originDescription,
			final String destinationCode, final String destinationName, final String destinationDescription) {
		super();
		this.amount = amount;
		this.currency = currency;
		this.originCode = originCode;
		this.destinationCode = destinationCode;
		this.originName = originName;
		this.originDescription = originDescription;
		this.destinationName = destinationName;
		this.destinationDescription = destinationDescription;
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

	public final String getOriginCode() {
		return originCode;
	}

	public final void setOriginCode(String originCode) {
		this.originCode = originCode;
	}

	public final String getDestinationCode() {
		return destinationCode;
	}

	public final void setDestinationCode(String destinationCode) {
		this.destinationCode = destinationCode;
	}

	public final String getOriginName() {
		return originName;
	}

	public final void setOriginName(String originName) {
		this.originName = originName;
	}

	public final String getOriginDescription() {
		return originDescription;
	}

	public final void setOriginDescription(String originDescription) {
		this.originDescription = originDescription;
	}

	public final String getDestinationName() {
		return destinationName;
	}

	public final void setDestinationName(String destinationName) {
		this.destinationName = destinationName;
	}

	public final String getDestinationDescription() {
		return destinationDescription;
	}

	public final void setDestinationDescription(String destinationDescription) {
		this.destinationDescription = destinationDescription;
	}

}

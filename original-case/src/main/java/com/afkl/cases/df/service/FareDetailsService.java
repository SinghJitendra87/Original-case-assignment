package com.afkl.cases.df.service;

import java.util.concurrent.CompletableFuture;

import com.afkl.cases.df.model.Fare;
import com.afkl.cases.df.model.Location;

public interface FareDetailsService {
	public CompletableFuture<Fare> getFareDetails(final String origin, final String destination);
	public CompletableFuture<Location> getLocationDetails(final String location);
}

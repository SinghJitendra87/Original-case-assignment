package com.afkl.cases.df.service;

import java.util.concurrent.Callable;

import com.afkl.cases.df.model.Locations;

public interface AirportService {
	public Callable<Locations> getLocations(final String lang);
}

package com.afkl.cases.df.fareDetails;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class FareDetailsService {

	@Autowired
	private SecurityConfiguration securityConfiguration;
	
	@Value("${travel.api.uri.fares}")
	private String uriFares;
	
	@Value("${travel.api.uri.airports}")
	private String uriAirports;
	
	private static final Logger logger = LoggerFactory.getLogger(FareDetailsService.class);


	public CompletableFuture<Fare> getFareDetails(final String origin, final String destination) {

		logger.info("Executing getFareDetails()");
		Map<String, String> params = new HashMap<String, String>();
		params.put("origin", origin);
		params.put("destination", destination);
		CompletableFuture<Fare> fare = new CompletableFuture<Fare>();
		fare.complete(securityConfiguration.oauth2RestTemplate().getForObject(uriFares, Fare.class, params));
		logger.info("Finished getFareDetails()");
		
		return fare;
	}

	public CompletableFuture<Location> getLocationDetails(final String location) {

		logger.info("Executing getLocationDetails()"+location);
		Map<String, String> params = new HashMap<String, String>();
		params.put("code", location);
		CompletableFuture<Location> locationDetails = new CompletableFuture<Location>();
		locationDetails.complete(securityConfiguration.oauth2RestTemplate().getForObject(uriAirports, Location.class, params));		
		logger.info("Finished getLocationDetails()"+location);

		return locationDetails;
	}

}

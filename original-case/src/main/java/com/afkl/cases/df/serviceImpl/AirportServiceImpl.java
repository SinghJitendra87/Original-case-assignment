package com.afkl.cases.df.serviceImpl;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.afkl.cases.df.common.SecurityConfiguration;
import com.afkl.cases.df.model.Embedded;
import com.afkl.cases.df.model.Location;
import com.afkl.cases.df.model.Locations;
import com.afkl.cases.df.service.AirportService;

@Service
public class AirportServiceImpl implements AirportService {

	private final SecurityConfiguration securityConfiguration;

	@Autowired
	public AirportServiceImpl(final SecurityConfiguration service) {
		this.securityConfiguration = service;
	}

	@Value("${travel.api.uri.airportsAll}")
	private String uriAirports;

	private static final Logger logger = LoggerFactory.getLogger(AirportServiceImpl.class);

	@Override
	public Callable<Locations> getLocations(final String lang) {

		logger.info("Executing getLocations()");

		Embedded embedded = securityConfiguration.oauth2RestTemplate().getForObject(uriAirports, Embedded.class);
		Locations locations = embedded.getLocations();
		List<Location> listLocations = locations.getLocations();
		Collections.sort(listLocations);
		locations.setLocations(listLocations);
		logger.info("Finished getLocations()");

		return () -> locations;
	}

}

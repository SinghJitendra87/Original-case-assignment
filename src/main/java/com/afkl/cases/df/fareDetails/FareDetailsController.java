package com.afkl.cases.df.fareDetails;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.concurrent.Callable;
import java.util.concurrent.CompletableFuture;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.afkl.cases.df.statistics.MetricService;

@RestController
@RequestMapping("/fareDetails/{origin}/{destination}")
public class FareDetailsController {

	@Autowired
	private FareDetailsService service;
	

	private static final Logger logger = LoggerFactory.getLogger(FareDetailsController.class);

	@RequestMapping(method = GET)
	Callable<FareDetails> getFare(@PathVariable("origin") String origin,
			@PathVariable("destination") String destination,
			@RequestParam(value = "currency", defaultValue = "EUR") String currency) {
		
		logger.info("Executing getFare()");



		CompletableFuture<Fare> result = service.getFareDetails(origin, destination);

		CompletableFuture<Location> originDetails = service.getLocationDetails(origin);
		
		CompletableFuture<Location> destinationDetails = service.getLocationDetails(destination);
		
		CompletableFuture.allOf(result, originDetails, destinationDetails).join();	
		logger.info("Finished getFare()");

		return () -> new FareDetails(result.get().getAmount(), result.get().getCurrency(), result.get().getOrigin(),originDetails.get().getName(),originDetails.get().getDescription(),
				result.get().getDestination(),destinationDetails.get().getName(),destinationDetails.get().getDescription()); 
	}
}
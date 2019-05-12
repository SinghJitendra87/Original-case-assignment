package com.afkl.cases.df.airport;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

import java.util.concurrent.Callable;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.afkl.cases.df.fareDetails.Locations;



@RestController
@RequestMapping("/airports")
public class AirportController {
	
	@Autowired
	private AirportService service;
	
	@RequestMapping(method = GET)
    public Callable<Locations> list(@RequestParam(value = "lang", defaultValue = "en") String lang) {
        return service.getLocations(lang);
    }

}

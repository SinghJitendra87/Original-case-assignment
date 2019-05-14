package com.afkl.cases.df.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.web.client.RestTemplate;

import com.afkl.cases.df.model.FareDetails;
import com.afkl.cases.df.model.Locations;

@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringJUnit4ClassRunner.class)
public class ControllerTest {

	@Value("${original.uri.fareDetails}")
	private String uriFairDetails;
	
	
	
	@Value("${original.uri.airportsAll}")
	private String uriairportsAll;

	@Test
	public void getLocationsTest() {

		final RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Locations> response = restTemplate.getForEntity(uriairportsAll, Locations.class);

		Assert.assertNotNull(response);
		Assert.assertEquals(response.getStatusCode(), HttpStatus.OK);

	}

	@Test
	public void getFairDetailsTest() {

		final RestTemplate restTemplate = new RestTemplate();

		final Map<String, String> params = new HashMap<String, String>();
		params.put("origin", "AAL");
		params.put("destination", "AOJ");

		final FareDetails fareDetails = restTemplate.getForObject(uriFairDetails, FareDetails.class, params);
		Assert.assertEquals("Aalborg - Aalborg (AAL), Denmark", fareDetails.getOriginDescription());

	}

}

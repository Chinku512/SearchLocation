package com.SearchLocation.Controller;

import org.springframework.web.client.RestTemplate;

import com.SearchLocation.Dto.Location;

public class LocationRestClient {
	public Location getLocationdata(long id) {
		RestTemplate rt= new RestTemplate();
		Location location = rt.getForObject("http://localhost:8080/location/api/get/"+id, Location.class);
		return location;
		
	}
}

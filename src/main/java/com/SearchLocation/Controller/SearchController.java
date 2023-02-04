package com.SearchLocation.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.SearchLocation.Dto.Location;

@Controller
public class SearchController {
	@RequestMapping("/show")
	public String showSearchLocationPage() {
		return "search_Location";
	}
	
	@RequestMapping("/getLocation")
	public String getLocation(@RequestParam("id")long id,ModelMap model) {
		LocationRestClient client = new LocationRestClient();
		Location location = client.getLocationdata(id);
		model.addAttribute("location", location);
		return "resultLocation";
		
	}
}

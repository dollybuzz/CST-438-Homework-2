package cst438hw2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import cst438hw2.domain.*;
import cst438hw2.service.CityService;

//This method handles the http get request. The @PathVariable annotation tells spring to
//parse the url and put the text that occurs after /cities/ into the cityName parameter

@Controller
public class CityController {
	
	@GetMapping("/cities/{city}")
	public String getWeather(@PathVariable("city") String cityName, Model model) {

		model.addAttribute(cityName);
		return "city";
	} 
	
}
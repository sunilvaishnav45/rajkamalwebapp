package com.rajkamal.web.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class Home {
	
	@GetMapping(value = {"","/"})
	public String getHomePageData() {
		return "Home page served";
	}
	
	

}

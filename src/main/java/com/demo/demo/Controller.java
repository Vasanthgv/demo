package com.demo.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller {
	@GetMapping("/jen")
	public String getW() {
		return "hellooo....";
	}



}

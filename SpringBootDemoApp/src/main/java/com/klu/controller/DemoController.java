package com.klu.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@GetMapping("/hello") //this /hello is the path mapped to our request
	public String sayHello()
	{
		return "Spring Boor Demo Application";
	}
}

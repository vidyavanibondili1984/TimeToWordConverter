package com.first.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	HelloService hss; 
	public HelloWorldController(HelloService hss) {
		super();
		this.hss = hss;
	}
	@GetMapping("/hello")
	public String hello() {
		return "Welcome to SPring boot REST API application";
	}

	@GetMapping("/tmc")
	public String testResult()
	{
		String str=hss.convertTimeToString();
		return str;
	}
}

package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestMapping;


//Controller
@RestController
public class HelloWorldController {
	
	//get
	//URI -/hello-world
	
	//method return hello world
	@RequestMapping(method=RequestMethod.GET, path="/hello-world")
	public String helloWorld() {
		return "doggy daycare";
	}

}

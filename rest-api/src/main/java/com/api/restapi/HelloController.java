package com.api.restapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	
	@GetMapping("hello")	
	 public String helloMethod() 
	{
		return "hello world";
	}

	}



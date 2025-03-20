package com.rail.This.is.the.Demo.Project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController 
{
	@GetMapping("/hello")
	public String getData1()
	{
		return "Welcome to Java Spring boot";
	}

}

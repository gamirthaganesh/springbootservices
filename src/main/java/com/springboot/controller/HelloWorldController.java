package com.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class HelloWorldController {
	
	  @RequestMapping("/hello")	
	  public String sayHello() {
	      return "Hello Spring Boot!!!";
	   }

}

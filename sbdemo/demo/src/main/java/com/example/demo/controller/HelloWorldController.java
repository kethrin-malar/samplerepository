package com.example.demo.controller;
import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.RestController;  
@RestController  

public class HelloWorldController {
	  
	@RequestMapping("/Ram")  
	public String hello()   
	{  
	return "Hello java";  
	}  

}
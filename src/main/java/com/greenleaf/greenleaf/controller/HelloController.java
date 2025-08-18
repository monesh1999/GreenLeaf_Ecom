package com.greenleaf.greenleaf.controller;


import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	

	    @GetMapping("/")
	    public String greet( HttpServletRequest request) {
	        return "Welcome to code  | Session: " + request.getSession().getId();
	    }
	    
	    @GetMapping("/hello")
	    public String greeting( HttpServletRequest request) {
	        return "Welcome to code  | Session: " + request.getSession().getId();
	    }
	    
	    @GetMapping("/hi")
	    public String greeted( HttpServletRequest request) {
	        return "Welcome to code  | Session: " + request.getSession().getId();
	    }
	
	
	


}
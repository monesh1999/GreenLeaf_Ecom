package com.greenleaf.greenleaf.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.greenleaf.greenleaf.models.Users;
import com.greenleaf.greenleaf.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	UserService service;
	
	@PostMapping("/add")
	public void adduser(@RequestBody Users user) {
		
		service.addUser(user);
		
	}

}

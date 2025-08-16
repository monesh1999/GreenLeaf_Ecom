package com.greenleaf.greenleaf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.greenleaf.greenleaf.models.Users;
import com.greenleaf.greenleaf.repository.UserRepository;

@Service
public class UserService {
	
	
	BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder(12);
	
	@Autowired
	UserRepository repo;

	public Users addUser(Users user) {
		user.setPassword(passwordEncoder.encode(user.getPassword()));
		repo.save(user);
		return user;
	}
	
	

}

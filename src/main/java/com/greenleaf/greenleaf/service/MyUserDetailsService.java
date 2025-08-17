package com.greenleaf.greenleaf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.greenleaf.greenleaf.models.Users;
import com.greenleaf.greenleaf.repository.UserRepository;
import com.greenleaf.greenleaf.security.UserPrincipal;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	UserRepository repo;
	
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Users user = repo.findByUsername(username);
		if(user == null) {
			throw new UsernameNotFoundException("user not found");
			
		}
		
		return new UserPrincipal(user);
		
	}

}

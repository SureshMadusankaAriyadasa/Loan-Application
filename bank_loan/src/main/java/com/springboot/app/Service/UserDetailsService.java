package com.springboot.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.app.Model.UserDetails;
import com.springboot.app.Repository.UserDetailsRepository;

@Service
public class UserDetailsService {
	@Autowired
    private  UserDetailsRepository userDetailsRepository;
	public List<UserDetails> listAllUser() {
		return userDetailsRepository.findAll();
	}
	
	public void addUser(UserDetails userDetails) {
		userDetailsRepository.save(userDetails);    
		
	}

	public void saveOrUpdate(UserDetails userDetails) {
		userDetailsRepository.save(userDetails);  
		
	}

	public UserDetails get(String firstname) {
		UserDetails userDetails =  userDetailsRepository.findByFirstname(firstname);
		return userDetails;
	}

}

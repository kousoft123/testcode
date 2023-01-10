package com.project.booking.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.booking.model.user.User;
import com.project.booking.repository.UserRepository;

@Service
public class UserServiceImpl {
	
	@Autowired
	private UserRepository userRepo;
	
	public  User findByFirstName(String firstname) {
		return userRepo.findByFirstName(firstname);
	}
	
	
}
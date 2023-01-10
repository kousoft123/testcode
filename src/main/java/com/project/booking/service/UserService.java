package com.project.booking.service;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.project.booking.model.user.User;
import com.project.booking.repository.UserRepository;


@Service
@Transactional
@Qualifier("UserService")
public class UserService {

    @Autowired
    private UserRepository userRepository;

    private static List<User> users = new ArrayList<>();
    
    public User createUser(User user) {
    	return userRepository.save(user);
    }

     

}
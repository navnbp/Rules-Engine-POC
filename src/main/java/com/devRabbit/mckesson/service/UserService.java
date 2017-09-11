package com.devRabbit.mckesson.service;

import org.springframework.stereotype.Service;

import com.devRabbit.mckesson.model.User;

@Service
public interface UserService {
	
	boolean validateUser(User user);

}

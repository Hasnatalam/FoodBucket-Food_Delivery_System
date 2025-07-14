package com.foodbucket.service;

import org.springframework.stereotype.Service;

import com.foodbucket.dto.UserRequest;
import com.foodbucket.dto.UserResponse;
import com.foodbucket.model.User;
import com.foodbucket.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService{
	
	private final UserRepository userRepository;

	@Override
	public UserResponse registerUser(UserRequest userRequest) {
		
		User user = userRepository.save(userRequest);
		
		return null;
	}
	

}

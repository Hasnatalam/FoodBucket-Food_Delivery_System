package com.foodbucket.service;

import org.springframework.stereotype.Service;

import com.foodbucket.entity.User;
import com.foodbucket.exception.ConfirmPasswordNotMatchException;
import com.foodbucket.model.UserRequest;
import com.foodbucket.model.UserResponse;
import com.foodbucket.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserServiceImp implements UserService {

	private final UserRepository userRepository;

	@Override
	public UserResponse registerUser(UserRequest userRequest) {
		

        // Change UserRequest to user and Encoding password
		User user = User.builder()
				.firstName(userRequest.getFirstName())
				.lastName(userRequest.getLastName())
				.email(userRequest.getEmail())
				.phone(userRequest.getPhone())
				.password(userRequest.getPassword())
				.build();
		
		User savedUser = userRepository.save(user);
		
		
		
		return UserResponse.builder()
				.firstName(savedUser.getFirstName())
				.lastName(savedUser.getLastName())
				.email(savedUser.getEmail())
				.phone(savedUser.getPhone())
				.build();
				
	}

}

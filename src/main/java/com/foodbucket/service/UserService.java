package com.foodbucket.service;

import com.foodbucket.dto.UserRequest;
import com.foodbucket.dto.UserResponse;

public interface UserService {
	
	public UserResponse registerUser(UserRequest userRequest);

}

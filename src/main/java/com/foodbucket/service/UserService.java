package com.foodbucket.service;

import com.foodbucket.model.UserRequest;
import com.foodbucket.model.UserResponse;

public interface UserService {
	
	public UserResponse registerUser(UserRequest userRequest);

}

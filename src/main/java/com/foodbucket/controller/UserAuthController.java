package com.foodbucket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.foodbucket.model.ResponseMessage;
import com.foodbucket.model.UserRequest;
import com.foodbucket.model.UserResponse;
import com.foodbucket.service.UserServiceImp;
import com.foodbucket.util.Constants;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.parameters.RequestBody;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;

@Tag(name = "User Authentication Controller",description = " User Register and Login ")
@RestController
@AllArgsConstructor
@RequestMapping("/api/user")
public class UserAuthController {
	@Autowired
	private final UserServiceImp userServiceImp;
	@Operation(summary = "Register User", description = "FoodBucket User Register it save the users")
	@PostMapping("/register")
	public ResponseEntity<ResponseMessage> registerUser(@RequestBody UserRequest userRequest){
		
		
		UserResponse registerUser = userServiceImp.registerUser(userRequest);
		
		return ResponseEntity.status(HttpStatus.OK).body(
			    new ResponseMessage(HttpStatus.OK.value(), Constants.SUCCESS, "User registerd",registerUser)
			);

		
	}
}

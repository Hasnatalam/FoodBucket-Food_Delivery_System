package com.foodbucket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodbucket.model.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	

}

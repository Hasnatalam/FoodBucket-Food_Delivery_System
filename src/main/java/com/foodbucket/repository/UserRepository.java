package com.foodbucket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.foodbucket.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	public boolean existsByEmail(String email);
	
	

}

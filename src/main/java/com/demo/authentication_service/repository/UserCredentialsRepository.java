package com.demo.authentication_service.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.authentication_service.repository.entity.UserCredentialsEntity;

public interface UserCredentialsRepository extends JpaRepository<UserCredentialsEntity, Integer>{
	
	public Optional<UserCredentialsEntity> findByName(String name);
	
}

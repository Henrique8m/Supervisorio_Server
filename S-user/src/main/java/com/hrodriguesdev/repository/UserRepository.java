package com.hrodriguesdev.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.hrodriguesdev.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
	@Query
	Optional<User> findByEmail(String email);

}

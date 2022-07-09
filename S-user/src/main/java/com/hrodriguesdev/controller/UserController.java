package com.hrodriguesdev.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.hrodriguesdev.entity.User;
import com.hrodriguesdev.repository.UserRepository;

@RestController
@RequestMapping(value = "/users")
public class UserController {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<User> findById(@PathVariable Long id){
		User user;
		try {
			user = repository.findById(id).orElseThrow(() -> new NotFoundException());
		} catch (NotFoundException e) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(user);		
	}
	
	@GetMapping(value = "/search")
	public ResponseEntity<User> findByEmail(@RequestParam String email){
		User user;
		try {
			user = repository.findByEmail(email).orElseThrow(()-> new NotFoundException());
		} catch (NotFoundException e) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(user);
	}

}

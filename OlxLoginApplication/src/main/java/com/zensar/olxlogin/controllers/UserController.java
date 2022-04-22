package com.zensar.olxlogin.controllers;

import java.util.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.olxlogin.entity.User;

@RestController
@RequestMapping("/user")
public class UserController {

	static List<User> users = new ArrayList<>();
	static
	{
		users.add(new User(1, "Anand", "Kulkarni", "anand", "anand123", "anand@gmail.com", "12345"));
	}
	
	// Get All Users
	@GetMapping(produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public List<User> getAllUsers() {
		return users;
	}
	
	// User Authenticate/Login
	@PostMapping(value="/authenticate",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<User> userAuthentication(@RequestBody User user,@RequestHeader ("auth-token") String token){
		for(User user1 : users)
		{
			if(user1.getUserName()=="anand" && user1.getPassword()=="anand123")
			{
				return new ResponseEntity<>(HttpStatus.ACCEPTED);
			}
			else
			{
				return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
			}
		}
		return new ResponseEntity<>(HttpStatus.BAD_GATEWAY);
	}
	
	// Register an User
	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public User createStock(@RequestBody User user) {
		users.add(user);
		return user;
	}
	
	//Deletes an User
	@DeleteMapping("/logout")
	public boolean deleteAllUser(@RequestHeader ("auth-token")String token)
	{
		if(token.equals("rm66633"))
		{
			return true;
		}
		else
		{
			return false;
		}
	}

}

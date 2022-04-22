package com.zensar.olxlogin.controllers;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
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
import com.zensar.olxlogin.service.LoginService;

@RestController
@RequestMapping("/user")
public class UserController {

	@Autowired
	private LoginService loginService;
	
	
	// Get All Users
	@GetMapping(produces = {MediaType.APPLICATION_XML_VALUE,MediaType.APPLICATION_JSON_VALUE})
	public List<User> getAllUsers() {
		return loginService.getAllUsers();
	}
	
	// User Authenticate/Login
	@PostMapping(value="/authenticate",produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public ResponseEntity<User> userAuthentication(@RequestBody User user,@RequestHeader ("auth-token") String token){
	
			if(loginService.userAuthentication(user, token) == null)
			{
				return new ResponseEntity<>(HttpStatus.ACCEPTED);
			}
			else
			{
				return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
			}
		
	}
	
	// Register an User
	@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE},consumes = {MediaType.APPLICATION_JSON_VALUE,MediaType.APPLICATION_XML_VALUE})
	public User createStock(@RequestBody User user) {
		return loginService.createStock(user);
	}
	
	//Deletes an User
	@DeleteMapping("/logout")
	public boolean deleteAllUser(@RequestHeader ("auth-token")String token)
	{
		return true;
		
	}

}

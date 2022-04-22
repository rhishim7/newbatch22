package com.zensar.olxlogin.service;

import java.util.List;

import com.zensar.olxlogin.entity.User;

public interface LoginService {
	public List<User> getAllUsers();
	public User userAuthentication(User user,String token);
	public User createStock( User user);
	public boolean deleteAllUser(String token);
}

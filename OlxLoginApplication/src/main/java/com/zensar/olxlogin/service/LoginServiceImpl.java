package com.zensar.olxlogin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zensar.olxlogin.entity.User;
import com.zensar.olxlogin.repository.LoginRepository;
@Service
public class LoginServiceImpl implements LoginService {

	@Autowired
	private LoginRepository loginRepository;
	
	
	@Override
	public List<User> getAllUsers() {
		
		return loginRepository.findAll();
	}

	@Override
	public User userAuthentication(User user, String token) {
//		if(loginRepository.findAll().contains(user))
//		{
//			
//		}
		return null;
	}

	@Override
	public User createStock(User user) {
		return loginRepository.save(user);
	}

	@Override
	public boolean deleteAllUser(String token) {
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

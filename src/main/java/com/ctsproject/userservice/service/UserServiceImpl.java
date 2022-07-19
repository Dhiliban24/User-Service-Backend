package com.ctsproject.userservice.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ctsproject.userservice.dao.*;

import com.ctsproject.userservice.entity.User;


@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	

	@Override
	public User saveUser(User user) {
		return userRepository.save(user);
	}
	
	@Override
	public List<User> getAllUsers(){
		return userRepository.findAll();
	}

	@Override
	public List<User> findByAuthStatusEqual(String auth){
		return userRepository.findByAuthStatusEquals(auth);
	}
	
	@Override
	public User updateUserByName(String name, User user) {
		User u= userRepository.findUserByUserName(name);
		u.setAuthStatus("accepted");	
		return userRepository.save(u);
	}
	
	@Override
	public User findByEmailEquals(String name){
		User userFetched =userRepository.findByEmail(name);
		return userFetched;
	}
	
	
	

}

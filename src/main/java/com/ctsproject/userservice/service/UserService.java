package com.ctsproject.userservice.service;

import java.util.List;
import java.util.Optional;

import com.ctsproject.userservice.entity.User;



public interface UserService {
	public User saveUser(User user);
	public List<User> getAllUsers();
	public List<User> findByAuthStatusEqual(String auth); 
	public User updateUserByName(String name,User user);
	public User findByEmailEquals(String name);
	
}

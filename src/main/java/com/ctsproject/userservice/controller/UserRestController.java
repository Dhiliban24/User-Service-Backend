package com.ctsproject.userservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ctsproject.userservice.entity.User;

import com.ctsproject.userservice.service.UserService;

@RestController
@RequestMapping("/url")
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*", methods = { RequestMethod.GET, RequestMethod.POST,
		RequestMethod.DELETE, RequestMethod.PUT })
public class UserRestController {

	@Autowired
	UserService userService;

	
   //Adding new user
	@PostMapping("/adduser")
	public User saveEmp(@RequestBody User user) {
		System.out.println(user);
		return userService.saveUser(user);
	}
	
	//Getting all users with authStatus Notaccepted
	@GetMapping("/getallusers")
	public List<User> getUsers() {
		return userService.findByAuthStatusEqual("Notaccepted");
	}
	
	//Updating user authStatus
	@PutMapping("/updateUserByName")
	public User updateUserUsingName(@RequestBody User user) {
		return userService.updateUserByName(user.getUserName(), user);

	}

	//Getting all users
	@GetMapping("/getusers")
	public List<User> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@GetMapping("/validateuserlogin/{useremail}")
	public User getUser(@PathVariable("useremail") String useremail) {
		User userResult =userService.findByEmailEquals(useremail);
		if(userResult!=null) {
		System.out.println(userResult.getPassword());
		return userResult;
		}
		return userResult;
		
	}
}

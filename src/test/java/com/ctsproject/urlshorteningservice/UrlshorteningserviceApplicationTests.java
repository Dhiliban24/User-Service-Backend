package com.ctsproject.urlshorteningservice;

import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.Optional;


import com.ctsproject.userservice.UrlshorteningserviceApplication;
import com.ctsproject.userservice.controller.UserRestController;
import com.ctsproject.userservice.entity.User;

import junit.framework.Assert;



@RunWith(SpringRunner.class)
@SpringBootTest(classes=UrlshorteningserviceApplication.class)
class UrlshorteningserviceApplicationTests {
	
	/*
	@Test
	void contextLoads() {
	}
	*/
	
	@Autowired
	private UserRestController userRestController;
	
	
	User user=new User();
	User user2=new User();
	
	

	@Test
	void testUpdateUser() {
		
		Long l=80L;
		user.setUserName("user1");
		user.setId(l);
		String auth="accepted";
		Assert.assertEquals(userRestController.updateUserUsingName(user).getAuthStatus(),auth);
	}
	
	@Test
	void testGetUsers() {
		Assert.assertNotNull(userRestController.getUsers());
	}
	
	@Test
	void testGetAllUsers() {
		Assert.assertNotNull(userRestController.getAllUsers());;
	}
	
	
	
	
	
}

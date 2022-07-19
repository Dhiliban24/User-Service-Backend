package com.ctsproject.userservice.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	

	@SuppressWarnings("deprecation")
	@Column(nullable = false)
	@NotEmpty(message = "Name may not be empty")
	private String userName;
	
	@SuppressWarnings("deprecation")
	@NotEmpty(message = "Password may not be empty")
	private String password;
	
	@SuppressWarnings("deprecation")
	@Column(unique=true,nullable=false)
	@NotEmpty(message = "email may not be empty")
	private String email;
	
	private String authStatus="NotAccepted";
	
	
	



	

	public User() {
		super();
	}
	


	public User(Long id, String userName, String password, String email) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	

	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", email=" + email
				+ ", authStatus=" + authStatus + "]";
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAuthStatus() {
		return authStatus;
	}

	public void setAuthStatus(String authStatus) {
		this.authStatus = authStatus;
	}

	

	
}

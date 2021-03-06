package com.example.thymeleafprojectdemo.entity;

//import javax.persistence.Entity;

//@Entity
public class User {
	
	//creating fields
	private String name;
	private String email;
	
	//creating default constructor
	public User() {

	}
	//creating args constructor
	public User(String name, String email) {
		this.name = name;
		this.email = email;
	}

	//getters and setters	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	

}

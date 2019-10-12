package com.zensar.entities;

import org.springframework.stereotype.Component;

/**
 * @author Arib Anwar
 * @creationDate: 11th Oct 2019 15:30
 * @version:1.0
 * @description:This is a User Class.
 * 				This is a POJO Class.
 *
 */
@Component
public class User {

	private String username;
	private String password;
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + "]";
	}
	
}

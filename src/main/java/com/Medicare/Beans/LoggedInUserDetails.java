package com.Medicare.Beans;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.Medicare.Entity.User;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@NoArgsConstructor
@AllArgsConstructor
@Data
public class LoggedInUserDetails {
	public User loggedInUserObject;
	public String authToken;
	public User getLoggedInUserObject() {
		return loggedInUserObject;
	}
	public void setLoggedInUserObject(User loggedInUserObject) {
		this.loggedInUserObject = loggedInUserObject;
	}
	public String getAuthToken() {
		return authToken;
	}
	public LoggedInUserDetails() {
		super();
	}
	public LoggedInUserDetails(User loggedInUserObject, String authToken) {
		super();
		this.loggedInUserObject = loggedInUserObject;
		this.authToken = authToken;
	}
	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	
}

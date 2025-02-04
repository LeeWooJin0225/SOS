package com.sist.web.model;

import java.io.Serializable;

public class Buyer implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String userId;
	private String userName;
	private String userStatus;
	private String rating;
	
	public Buyer() {
		userId = "";
		userName = "";
		userStatus = "";
		rating = "";
	}

	public String getUserId() {
		return userId;
	}

	public String getUserName() {
		return userName;
	}

	public String getUserStatus() {
		return userStatus;
	}

	public String getRating() {
		return rating;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void setUserStatus(String userStatus) {
		this.userStatus = userStatus;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
	
	
}

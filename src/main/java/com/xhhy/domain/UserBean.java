package com.xhhy.domain;

import java.io.Serializable;

public class UserBean implements Serializable{
	private int userId;
	private String userName;
	private int userAge;
	private String userGender;
	private String userEmail;
	private String userAddress;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	public String getUserGender() {
		return userGender;
	}
	public void setUserGender(String userGender) {
		this.userGender = userGender;
	}
	public String getUserEmail() {
		return userEmail;
	}
	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	public String getUserAddress() {
		return userAddress;
	}
	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}
	@Override
	public String toString() {
		return "UserBean [userId=" + userId + ", userName=" + userName + ", userAge=" + userAge + ", userGender="
				+ userGender + ", userEmail=" + userEmail + ", userAddress=" + userAddress + "]";
	}
	

}

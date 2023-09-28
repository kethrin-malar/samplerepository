package com.demo.dto;

import java.util.Set;

public class User{
	private int userId;
	private String firstName;
	private String lastName;
	private String passWord;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public void setEmail(String string) {
		// TODO Auto-generated method stub
		
	}
	public void setCourseEntity(Set<CourseEntity> subs) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}

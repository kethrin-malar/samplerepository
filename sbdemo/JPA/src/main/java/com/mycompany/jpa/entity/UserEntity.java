package com.mycompany.jpa.entity;

import jakarta.persistence.*;
import jakarta.validation.*;
import jakarta.validation.constraints.Size;

import java.io.Serial;
import java.io.Serializable;

@Entity
public class UserEntity {

  @Id
  @GeneratedValue
  private Long userId;
  
  
  
  //@Size(min=15, message="Name should have at least 15 characters")  
  private String firstName;
  private String lastName;
  private String password;
  
  public UserEntity() {
	  super();
  }
  
 public UserEntity(String firstName) {
	 super();
	 //this.employeeId = employeeId;
	 this.firstName = firstName;
 }
 
public Long getUserId() {
	return userId;
}
public void setUserId(Long userId) {
	this.userId = userId;
}
public String getFirstName() {
	return firstName;
}


public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getPassword() {
	return password;
}

public void setPassword(String password) {
	this.password = password;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}
  
public String toString() {
	return firstName + "id:"+ userId;
}

}


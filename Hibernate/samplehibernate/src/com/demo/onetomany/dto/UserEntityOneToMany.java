package com.demo.onetomany.dto;
import java.io.Serializable;
import java.util.Set;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity(name = "ForeignKeyAssoUserEntity")
@Table(name = "USER_1_M", uniqueConstraints =
		@UniqueConstraint(columnNames = "userid"))
		
public class UserEntityOneToMany implements Serializable {

	private static final long serialVersionUID = -1798070786993154676L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "userid", unique = true, nullable = false)
	private Integer userId;

	
	@Column(name = "firstname", unique = false, nullable = false, length = 100)
	private String firstName;

	@Column(name = "lastname", unique = false, nullable = false, length = 100)
	private String lastName;
	
	@Column(name = "password", unique = true, nullable = false, length = 100)
	private String password;


	@OneToMany(cascade=CascadeType.ALL)
	@JoinColumn(name="Userid")
	

	private Set<CourseEntityOneToMany> courseList;


	public Integer getUserId() {
		return userId;
	}


	public void setUserId(Integer userId) {
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


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public Set<CourseEntityOneToMany> getCourseList() {
		return courseList;
	}


	public void setCourseList(Set<CourseEntityOneToMany> courseList) {
		this.courseList = courseList;
	}


	}
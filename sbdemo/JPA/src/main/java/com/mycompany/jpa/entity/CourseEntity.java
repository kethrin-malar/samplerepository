package com.mycompany.jpa.entity;

//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

@Entity
//@Getter @Setter @NoArgsConstructor
public class CourseEntity {
	
	@Id
	@GeneratedValue
	private int courseid;
	private String coursename;
	private String coursecategory;
	private String credits;
	
	
	
	public CourseEntity() {
		
	}

	public CourseEntity(String coursename) {
		 super();
		 //this.employeeId = employeeId;
		 this.coursename = coursename;
	 }

	public int getCourseid() {
		return courseid;
	}

	public void setCourseid(int courseid) {
		this.courseid = courseid;
	}

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
		
	}

	public String getCoursecategory() {
		return coursecategory;
	}

	public void setCoursecategory(String coursecategory) {
		this.coursecategory = coursecategory;
	}

	public String getCredits() {
		return credits;
	}

	public void setCredits(String credits) {
		this.credits = credits;
	}

	
}
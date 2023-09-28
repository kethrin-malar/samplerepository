package com.demo.onetomany.dto;
import java.io.Serial;
import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity(name = "ForeignKeyAssoCourseEntity")
@Table(name = "COURSE_1_M", uniqueConstraints = {
    @UniqueConstraint(columnNames = "courseid")})
public class CourseEntityOneToMany implements Serializable {
	
	  @Serial
	  private static final long serialVersionUID = -6790693372846798580L;

	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "courseid", unique = true, nullable = false)
	  private Integer courseId;

	  @Column(name = "coursename", unique = true, nullable = false, length = 100)
	  private String coursename;
       
	  @Column(name = "coursecategory", unique = true, nullable = false, length = 100)
	  private String coursecategory;
	  
	  @Column(name = "credits", unique = true, nullable = false, length = 100)
	  private String credits;

	public Integer getCourseId() {
		return courseId;
	}

	public void setCourseId(Integer courseId) {
		this.courseId = courseId;
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
package com.demo.onetoone.dto;import java.io.Serializable;
import jakarta.persistence.*;

@Entity(name = "ForeignKeyAssCourseEntity")
@Table(name = "COURSE_1_1", uniqueConstraints = {@UniqueConstraint(columnNames = "courseid")})
public class CourseEntity implements Serializable {

  private static final long serialVersionUID = -6790693372846798580L;
  @OneToOne(mappedBy = "course")
  private UserEntity user;
  
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

public UserEntity getUser() {
	return user;
}

public void setUser(UserEntity user) {
	this.user = user;
}

public Integer getCourseId() {
	return courseId;
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


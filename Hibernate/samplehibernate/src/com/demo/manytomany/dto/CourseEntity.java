package com.demo.manytomany.dto;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity(name = "CourseEntity")
@Table(name = "Course_M_M")
public class CourseEntity implements Serializable {

  private static final long serialVersionUID = -1798070786993154676L;

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ID", unique = true, nullable = false)
  private Integer courseId;

  @Column(name = "COURSE_NAME", unique = true, nullable = false, length = 100)
  private String coursename;

  @ManyToMany(mappedBy = "courses")
  private Set<User> users;

  // Constructors, getters, and setters

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

  public Set<User> getUsers() {
    return users;
  }

  public void setUsers(Set<User> users) {
    this.users = users;
  }
}

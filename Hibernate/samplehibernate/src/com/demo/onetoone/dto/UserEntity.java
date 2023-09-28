package com.demo.onetoone.dto;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;


@Data
@AllArgsConstructor
@Builder
@Entity(name = "ForeignKeyAssUserEntity")
@Table(name = "USER_1_1", uniqueConstraints = 
    @UniqueConstraint(columnNames = "userid"))
    
public class UserEntity implements Serializable {

	 private static final long serialVersionUID = -1798070786993154676L;

	  public UserEntity() {}
	  @Id
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  @Column(name = "userid", unique = true, nullable = false)
	  private Integer userid;
      @Column(name = "firstName", unique = false, nullable = false, length = 100)
	  private String firstName;

	  @Column(name = "lastName", unique = false, nullable = false, length = 100)
	  private String lastName;
	  
	  @Column(name = "passWord", unique = false, nullable = false, length = 100)
	  private String passWord;

	  @OneToOne
	  @JoinColumn(name = "courseid")
	  @OrderBy("firstName ASC, email DESC")
	  private CourseEntity course;

	public Integer getUserid() {
		return userid;
	}

	public void setUserid(Integer userid) {
		this.userid = userid;
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

	public CourseEntity getCourse() {
		return course;
	}

	public void setCourse(CourseEntity course) {
		this.course = course;
	}

}
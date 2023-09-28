package com.mycompany.jpa.business;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.mycompany.jpa.data.CourseCrud;
import com.mycompany.jpa.data.DepartmentCrud;
import com.mycompany.jpa.data.EmployeeCrud;
import com.mycompany.jpa.data.UserCrud;
import com.mycompany.jpa.entity.*;

@Service
public class UserBusiness {
	
	@Autowired
	private UserCrud  userCrud;
	
	@Autowired
	private CourseCrud courseCrud;
	
	public String save() {
		UserEntity user = new UserEntity("John");
		userCrud.save(user);
		System.out.println("user id is: " + user.getUserId());
		return "Saved the data" + user.getUserId() + "--" + user.getFirstName();
	}
	
	public String save(String fname) {
		UserEntity user = new UserEntity(fname);
		userCrud.save(user);
		System.out.println("inside save fname method user id is: " + user.getUserId());
		System.out.println("Find method " + userCrud.findById(1L));
		return "Saved the data" +  user.getUserId() + "--" + user.getFirstName();
	}
	
	public String saveUser(UserEntity user) {
		userCrud.save(user);
		System.out.println("user id is: " + user.getUserId());
		return "Saved the data" + user.getUserId() + "--" + user.getFirstName();
	}
	
	public List findAll() {
		return userCrud.findAll();
	}
	
	public String remove(Long id) {
		userCrud.deleteById(id);
		return "Removed the data";
	}

	//lombok changes
	public String savecourse(String coursename) {
		CourseEntity course = new CourseEntity(coursename);
		courseCrud.save(course);
		System.out.println("inside saveCourse method dept id is: " + course.getCourseid());
		//System.out.println("Find method " + deptCrud.findById(1L));
		return "Saved the data" + course.getCourseid() + "--" + course.getCoursename();
	}
	
}

package com.mycompany.jpa.contoller;

import org.springframework.web.bind.annotation.RestController;

import com.mycompany.jpa.business.UserBusiness;
import com.mycompany.jpa.entity.UserEntity;

import java.util.List;

import jakarta.validation.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class UserController {

	@Autowired
	private UserBusiness userBusiness;
	
	@RequestMapping("/saveUser")
	public String save() {
		String msg = userBusiness.save();
		return msg;
	}
	
	@RequestMapping("/saveuser/fname/{fname}")
	public String saveUser(@PathVariable String fname) {
		String msg = userBusiness.save(fname);
		return msg;
	}
	
	
	@PostMapping(path = "/saveuserPost")
	public String saveUserPost(@Valid @RequestBody UserEntity userObj) {
		String msg = userBusiness.saveUser(userObj);
		return msg;
	}
	
	@RequestMapping("/findalluser")
	public List saveFindAll() {
		return userBusiness.findAll();
		//return "Welcome from boot";
	}
	
	@DeleteMapping("/remove/userid/{userid}")
	public String removeUser(@PathVariable Long id) {
		String msg = userBusiness.remove(id);
		return msg;
	}


	@RequestMapping("/savecourse/name/{name}")
	public String saveDept(@PathVariable String name) {
		String msg = userBusiness.savecourse(name);
		return msg;
	}
	
	@GetMapping("/transferCourse")
	ResponseEntity<String> transfer() {
	    //return new ResponseEntity<>("Transfer Completed", HttpStatus.OK);
		return new ResponseEntity<>("Transfer failed", HttpStatus.BAD_REQUEST);
	}
}

package com.insurance.demo.controller;


	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.web.bind.annotation.*;

	import com.insurance.demo.business.UserBusiness;
	import com.insurance.demo.entity.UserEntity;


	@RestController
	@RequestMapping("/user")
	@CrossOrigin(origins="*")
	public class UserController {
	    @Autowired
	    private UserBusiness userBusiness;

	    @GetMapping("/getuserslogin")
	    public String validateLoginCredentials(String username, String password) {
	        String msg = userBusiness.validateCredentials(username, password);
	        return msg;
	    }
	    
    }







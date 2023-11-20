package com.insurance.demo.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.insurance.demo.business.UserBusiness;
import com.insurance.demo.service.UserService;

@Service
public class UserBusinessImpl implements UserBusiness {
    @Autowired
    private UserService userLoginService;

    @Override
    public String validateCredentials(String username, String password) {

	
		  String msg = userLoginService.validateLoginCredentials(username, password);
		  return msg;
	}
    
}

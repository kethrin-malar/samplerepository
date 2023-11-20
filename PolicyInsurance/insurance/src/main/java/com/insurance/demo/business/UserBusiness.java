package com.insurance.demo.business;


import com.insurance.demo.entity.UserEntity;

public interface UserBusiness {
	public String validateCredentials(String username, String password);
}

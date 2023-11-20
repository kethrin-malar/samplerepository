package com.insurance.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.demo.business.DashboardBusiness;
import com.insurance.demo.entity.DriverEntity;
import com.insurance.demo.model.Driver;
import com.insurance.demo.repository.DashboardRepository;

@RestController
@CrossOrigin(origins = "*")

@RequestMapping("/api/dashboard")
public class DashboardController {

	@Autowired
	private DashboardBusiness dashboardBusiness;

	@GetMapping("/driver/{id}")
	    public Driver getDriverById(@PathVariable long id) {
	        
	            return dashboardBusiness.getDriverById(id);
	        }
}

package com.insurance.demo.business.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.insurance.demo.business.DashboardBusiness;
import com.insurance.demo.entity.DriverEntity;
import com.insurance.demo.model.Driver;
import com.insurance.demo.service.DashboardService;


@Service
public class DashboardBusinessImpl implements DashboardBusiness {

    @Autowired
    private DashboardService dashboardService;


    @Override
    public Driver getDriverById(long driverId) {
    	return dashboardService.getDriverById(driverId);
}
}


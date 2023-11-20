package com.insurance.demo.model;

import java.time.LocalDateTime;

public class Vehicle {
	private long id;
    private Policy policy;
    private String year;
    private int mileage;
    private String vehicleNumberPlate;
    private String vehicleRegisteredState;
    private LocalDateTime createdDate;
   
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Policy getPolicy() {
		return policy;
	}
	public void setPolicy(Policy policy) {
		this.policy = policy;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public String getVehicleNumberPlate() {
		return vehicleNumberPlate;
	}
	public void setVehicleNumberPlate(String vehicleNumberPlate) {
		this.vehicleNumberPlate = vehicleNumberPlate;
	}
	public String getVehicleRegisteredState() {
		return vehicleRegisteredState;
	}
	public void setVehicleRegisteredState(String vehicleRegisteredState) {
		this.vehicleRegisteredState = vehicleRegisteredState;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	

}

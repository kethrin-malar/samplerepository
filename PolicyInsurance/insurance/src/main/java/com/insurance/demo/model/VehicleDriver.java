package com.insurance.demo.model;

import java.sql.Driver;
import java.time.LocalDateTime;

public class VehicleDriver {
	private long id;
    private Vehicle vehicle;
    private Driver driver;
    private boolean isPrimaryDriver;
    private int everydayMileage;
    private LocalDateTime createdDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Vehicle getVehicle() {
		return vehicle;
	}
	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public boolean isPrimaryDriver() {
		return isPrimaryDriver;
	}
	public void setPrimaryDriver(boolean isPrimaryDriver) {
		this.isPrimaryDriver = isPrimaryDriver;
	}
	public int getEverydayMileage() {
		return everydayMileage;
	}
	public void setEverydayMileage(int everydayMileage) {
		this.everydayMileage = everydayMileage;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
    
}
	
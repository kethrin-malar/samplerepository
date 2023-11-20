package com.insurance.demo.model;

import java.time.LocalDateTime;

public class VehicleCoverage {
	private long id;
    private Vehicle vehicle;
    private Coverage coverage;
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
	public Coverage getCoverage() {
		return coverage;
	}
	public void setCoverage(Coverage coverage) {
		this.coverage = coverage;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
}
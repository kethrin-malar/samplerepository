package com.insurance.demo.model;

public class DriverTrafficViolationRecord {
	private long id;
    private Driver driver;
    private TrafficViolationCode trafficViolationcode;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Driver getDriver() {
		return driver;
	}
	public void setDriver(Driver driver) {
		this.driver = driver;
	}
	public TrafficViolationCode getTrafficViolationcode() {
		return trafficViolationcode;
	}
	public void setTrafficViolationcode(TrafficViolationCode trafficViolationcode) {
		this.trafficViolationcode = trafficViolationcode;
	}

}

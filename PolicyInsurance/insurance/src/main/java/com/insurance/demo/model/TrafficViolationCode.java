package com.insurance.demo.model;



public class TrafficViolationCode {
	private long id;
    private String trafficViolationCode;
    private double trafficViolationPoint;
    
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTrafficViolationCode() {
		return trafficViolationCode;
	}
	public void setTrafficViolationCode(String trafficViolationCode) {
		this.trafficViolationCode = trafficViolationCode;
	}
	
	public double getTrafficViolationPoint() {
		return trafficViolationPoint;
	}
	public void setTrafficViolationPoint(double trafficViolationPoint) {
		this.trafficViolationPoint = trafficViolationPoint;
	}
	
}

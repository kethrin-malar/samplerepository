package com.insurance.demo.model;

import java.time.LocalDateTime;

public class PolicyCoverage {
	private long id;
    private Policy policy;
    private Coverage coverage;
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

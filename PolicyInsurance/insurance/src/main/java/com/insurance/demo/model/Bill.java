package com.insurance.demo.model;

import java.time.LocalDateTime;
public class Bill {
	private long id;
	private Policy policy;
    private LocalDateTime dueDate;
    private double minimumPayment;
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


	public LocalDateTime getDueDate() {
		return dueDate;
	}


	public void setDueDate(LocalDateTime dueDate) {
		this.dueDate = dueDate;
	}


	public double getMinimumPayment() {
		return minimumPayment;
	}


	public void setMinimumPayment(double minimumPayment) {
		this.minimumPayment = minimumPayment;
	}


	public LocalDateTime getCreatedDate() {
		return createdDate;
	}


	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}


	

}

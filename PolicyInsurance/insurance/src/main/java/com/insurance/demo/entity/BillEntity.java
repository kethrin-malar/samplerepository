package com.insurance.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "bill")
public class BillEntity {
    @Id
    @Column(name = "id")
    private int id;

    @ManyToOne
    @JoinColumn(name = "policyid")
    private PolicyEntity policy;
    
    @Column(name = "dueDate")
    private LocalDateTime dueDate;
    
    @Column(name = "minimumPayment")
    private double minimumPayment;
    
    @Column(name = "createdDate")
    private LocalDateTime createdDate;

	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public PolicyEntity getPolicy() {
		return policy;
	}

	public void setPolicy(PolicyEntity policy) {
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
    
    
   
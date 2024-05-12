package com.insurance.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.datatype.jsr310.deser.LocalDateTimeDeserializer;

@Entity
@Table(name = "policy")
public class PolicyEntity {
    @Id
    @Column(name = "id")
    private int id;
    
    @Column(name = "policy_Number")
    private String policy_Number;
    
    @Column(name = "policy_Effective_Date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
   // @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime policy_Effective_Date;
 
    @Column(name = "policy_Expire_Date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
   // @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime policy_Expire_Date;
    
    @Column(name = "payment_Option")
    private String payment_Option;
    
    @Column(name = "total_Amount")
    private double total_Amount;
    
    @Column(name = "created_Date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    //@JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private LocalDateTime created_Date;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPolicy_Number() {
		return policy_Number;
	}

	public void setPolicy_Number(String policy_Number) {
		this.policy_Number = policy_Number;
	}

	public LocalDateTime getPolicy_Effective_Date() {
		return policy_Effective_Date;
	}

	public void setPolicy_Effective_Date(LocalDateTime policy_Effective_Date) {
		this.policy_Effective_Date = policy_Effective_Date;
	}

	public LocalDateTime getPolicy_Expire_Date() {
		return policy_Expire_Date;
	}

	public void setPolicy_Expire_Date(LocalDateTime policy_Expire_Date) {
		this.policy_Expire_Date = policy_Expire_Date;
	}

	public String getPayment_Option() {
		return payment_Option;
	}

	public void setPayment_Option(String payment_Option) {
		this.payment_Option = payment_Option;
	}

	public double getTotal_Amount() {
		return total_Amount;
	}

	public void setTotal_Amount(double total_Amount) {
		this.total_Amount = total_Amount;
	}

	public LocalDateTime getCreated_Date() {
		return created_Date;
	}

	public void setCreated_Date(LocalDateTime created_Date) {
		this.created_Date = created_Date;
	}
    
    
    
	

	}
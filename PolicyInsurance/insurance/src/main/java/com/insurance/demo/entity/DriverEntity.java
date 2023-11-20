package com.insurance.demo.entity;

import java.time.LocalDate;
import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonFormat;

import jakarta.persistence.*;

@Entity
@Table(name = "driver")
public class DriverEntity {
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name = "policy_id")
    private PolicyEntity policy; 

    
    @Column(name = "first_Name")
    private String first_Name;
    
    @Column(name = "last_Name")
    private String last_Name;
    
    @Column(name = "date_Of_Birth")
    private String date_Of_Birth;
    
    @Column(name = "phone_Number")
    private String phone_Number;
    
    @Column(name = "license_Issued_Date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDate license_Issued_Date;
    
    @Column(name = "license_Issued_State")
    private String license_Issued_State;
    
    @Column(name = "license_Number")
    private String license_Number;
    
    @Column(name = "created_Date")
    @JsonFormat(shape=JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss")
    private LocalDateTime created_Date;

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

	public String getFirst_Name() {
		return first_Name;
	}

	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}

	public String getLast_Name() {
		return last_Name;
	}

	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}

	public String getDate_Of_Birth() {
		return date_Of_Birth;
	}

	public void setDate_Of_Birth(String date_Of_Birth) {
		this.date_Of_Birth = date_Of_Birth;
	}

	public String getPhone_Number() {
		return phone_Number;
	}

	public void setPhone_Number(String phone_Number) {
		this.phone_Number = phone_Number;
	}

	public LocalDate getLicense_Issued_Date() {
		return license_Issued_Date;
	}

	public void setLicense_Issued_Date(LocalDate license_Issued_Date) {
		this.license_Issued_Date = license_Issued_Date;
	}

	public String getLicense_Issued_State() {
		return license_Issued_State;
	}

	public void setLicense_Issued_State(String license_Issued_State) {
		this.license_Issued_State = license_Issued_State;
	}

	public String getLicense_Number() {
		return license_Number;
	}

	public void setLicense_Number(String license_Number) {
		this.license_Number = license_Number;
	}

	public LocalDateTime getCreated_Date() {
		return created_Date;
	}

	public void setCreated_Date(LocalDateTime created_Date) {
		this.created_Date = created_Date;
	}
    
    
	
	
	
}
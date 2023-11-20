package com.insurance.demo.entity;

import jakarta.persistence.*;
import java.time.LocalDateTime;


@Entity
@Table(name = "paymentdetail")
public class PaymentDetailEntity {
	
    @Id
    @Column(name = "id")
    private int id;
    

    @ManyToOne
    @JoinColumn(name = "billid")
    private BillEntity bill; 
    
    @Column(name = "paidDate")
    private LocalDateTime paidDate;
    
    @Column(name = "amount")
    private double amount;
    
    @Column(name = "paymentMethod")
    private String paymentMethod;
    
    @Column(name = "firstName")
    private String firstName;
    
    @Column(name = "lastName")
    private String lastName;
    
    @Column(name = "createdDate")
    private LocalDateTime createdDate;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public BillEntity getBill() {
		return bill;
	}

	public void setBill(BillEntity bill) {
		this.bill = bill;
	}

	public LocalDateTime getPaidDate() {
		return paidDate;
	}

	public void setPaidDate(LocalDateTime paidDate) {
		this.paidDate = paidDate;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDateTime getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}

    

}
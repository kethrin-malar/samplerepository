package com.insurance.demo.model;

import java.time.LocalDateTime;

public class PaymentDetail {
	private long id;
    private Bill bill;
    private LocalDateTime paidDate;
    private double amount;
    private String paymentMethod;
    private String firstName;
    private String lastName;
    private LocalDateTime createdDate;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Bill getBill() {
		return bill;
	}
	public void setBill(Bill bill) {
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

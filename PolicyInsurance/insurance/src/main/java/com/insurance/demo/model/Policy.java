package com.insurance.demo.model;

//import java.sql.Driver;
import java.time.LocalDateTime;

public class Policy {
	private long id;
    private String policy_Number;
    private LocalDateTime policy_Effective_Date;
    private LocalDateTime policy_Expire_Date;
    private String payment_Option;
    private double total_Amount;
    private LocalDateTime created_Date;
	public long getId() {
		return id;
	}
	public void setId(long id) {
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
    
    
	
	
	/*
	 * public static void main(String[] arg) { Policy p1 =new Policy(); Policy p2
	 * =new Policy();
	 * 
	 * 
	 * int i1=10; int i2 = 20; if(i1==i2) { System.out.println("yes"); } if(p1==p2)
	 * { System.out.println("yes"); }
	 * 
	 * } public boolean equals(Object o ) {
	 * 
	 * return true; }
	 */
   
}

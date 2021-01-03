package com.bank.model;

//import java.time.LocalDate;

public class BankCustomer {
	private int id; 
	private double account_no; 
	private String account_name;
	private String email;
	private double mobile_no; 
		
	
	/*private Date deposited_date; 
	private long withdrawn_amount;
	private long deposit_amount;
	private long balance;*/ 

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getAccount_no() {
		return account_no;
	}
	public void setAccount_no(double account_no) {
		this.account_no = account_no;
	}
	public String getAccount_name() {
		return account_name;
	}
	public void setAccount_name(String account_name) {
		this.account_name = account_name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getMobile_no() {
		return mobile_no;
	}
	public void setMobile_no(double mobile_no) {
		this.mobile_no = mobile_no;
	}
	
	
	
	
	
}

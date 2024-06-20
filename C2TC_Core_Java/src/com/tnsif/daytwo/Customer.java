package com.tnsif.daytwo;

public class Customer {
	//Attributes
	private	int customerid;
	private	String customerName;
	private	String customerCity;
	
	//Default Constructor
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Parameterized Constructor
	public Customer(int customerid, String customerName, String customerCity) {
		super();
		this.customerid = customerid;
		this.customerName = customerName;
		this.customerCity = customerCity;
	}

	//Getters and Setters
	public int getCustomerid() {
		return customerid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerCity() {
		return customerCity;
	}
	public void setCustomerCity(String customerCity) {
		this.customerCity = customerCity;
	}

	@Override
	public String toString() {
		return "Customer [customerid=" + customerid + ", customerName=" + customerName + ", customerCity="
				+ customerCity + "]";
	}
	
}
//It is also known as client class.
package com.deloitte.estore.model;

public class Customer {
	
	private int customerId;
	private String customerName;
	private String location;
	
	public Customer() {
		
	}

	public Customer(int customerId, String customerName, String location) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.location = location;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", location=" + location + "]";
	}

	
}

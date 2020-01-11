package com.deloitte.estore.model;

public class Order {
	private int orderId;
	private Product prduct;
	private Seller seller;
	private Customer customer;
	
	public Order(){
		
	}

	public Order(int orderId, Product prduct, Seller seller, Customer customer) {
		super();
		this.orderId = orderId;
		this.prduct = prduct;
		this.seller = seller;
		this.customer = customer;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public Product getPrduct() {
		return prduct;
	}

	public void setPrduct(Product prduct) {
		this.prduct = prduct;
	}

	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", prduct=" + prduct + ", seller=" + seller + ", customer=" + customer
				+ "]";
	}
	
}

package com.deloitte.estore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "product_details") 
public class Product {
	
	@Id
	@Column(name = "Product_ID")
//	@GeneratedValue(strategy = GenerationType.AUTO)
	private int productId;
	@Column(name = "Product_Name")
	private String productName;
	@Column(name = "Product_Price")
	private double price;
	
	@OneToOne
	Seller seller;
	
	 public Product() {
		
	}

	public Product(int productId, String productName, double price) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}



	public Product(int productId, String productName, double price, Seller seller) {
		super();
		this.seller = seller;
		this.productId = productId;
		this.productName = productName;
		this.price = price;
	}
	
	public Seller getSeller() {
		return seller;
	}

	public void setSeller(Seller seller) {
		this.seller = seller;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", price=" + price + ", seller="
				+ seller + "]";
	}

	
	
}

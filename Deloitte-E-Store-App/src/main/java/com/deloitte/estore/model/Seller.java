package com.deloitte.estore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;


@Entity
@Table (name = "seller_details")
public class Seller {
	
	@Id
	@Column(name = "Seller_ID")
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private int sellerId;
	@Column(name = "Seller_Name")
	private String sellerName;
	@Column (name = "Seller_Gst")
	private int sellerGst;

	
	public Seller() {
		
	}

	public Seller(int sellerId, String sellerName,int sellerGst) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
		this.sellerGst = sellerGst;
	}

	
	public int getSellerGst() {
		return sellerGst;
	}

	public void setSellerGst(int sellerGst) {
		this.sellerGst = sellerGst;
	}

	public int getSellerId() {
		return sellerId;
	}

	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	@Override
	public String toString() {
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + ", sellerGst=" + sellerGst + "]";
	}

	

	
	
	
}

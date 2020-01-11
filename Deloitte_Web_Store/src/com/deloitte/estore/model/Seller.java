package com.deloitte.estore.model;

public class Seller {
	
	private int sellerId;
	private String sellerName;
	
	public Seller() {
		
	}

	public Seller(int sellerId, String sellerName) {
		super();
		this.sellerId = sellerId;
		this.sellerName = sellerName;
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
		return "Seller [sellerId=" + sellerId + ", sellerName=" + sellerName + "]";
	}
	
	
}

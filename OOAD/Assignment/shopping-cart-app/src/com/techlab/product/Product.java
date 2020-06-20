package com.techlab.product;

import java.io.Serializable;

public abstract class Product implements Serializable {
	protected String productName;
	protected int cost;
	
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Product Name=" + productName +", Quantity";
	}
}

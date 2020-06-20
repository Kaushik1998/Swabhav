package com.techlab.product;

import java.io.Serializable;

public class Apple extends Product implements Serializable{
	String productName="Apple";
	int cost=10;
	
	public Apple() {
		super.productName=this.productName;
		super.cost=this.cost;
	}
}

package com.techlab.product;

import java.io.Serializable;

public class Mango extends Product implements Serializable {
	String productName="Mango";
	int cost=30;
	
	public Mango() {
		super.productName=this.productName;
		super.cost=this.cost;
	}
}

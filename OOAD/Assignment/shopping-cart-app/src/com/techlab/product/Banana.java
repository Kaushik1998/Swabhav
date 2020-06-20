package com.techlab.product;

import java.io.Serializable;

public class Banana extends Product implements Serializable {
	String productName = "Banana";
	int cost = 5;
	public Banana() {
		super.productName=this.productName;
		super.cost=this.cost;
	}
}

package com.techlab.order;

import java.io.Serializable;

import com.techlab.lineitem.LineItem;
import com.techlab.product.Product;

public class Order implements Serializable{
	private int orderID;
	LineItem lineItem = new LineItem();
	public Order() {
		this.orderID= hashCode();
	}
	
	public void add(Product p) {
		lineItem.add(p);
	}
	
	public void add(Product p,int quantity) {
		lineItem.add(p,quantity);
	}

	@Override
	public String toString() {
		return "OrderID =" + orderID + "\n"+lineItem;
	}
}

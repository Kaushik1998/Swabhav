package com.techlab.order;

import java.util.ArrayList;

import com.techlab.lineitem.LineItem;
import com.techlab.product.Product;

public class Order {
	private int orderID;
	public LineItem cart = new LineItem();
	public Order(ArrayList<Product> productList) {
		for (Product p : productList) {
			cart.addCart(p);
			this.orderID = hashCode();
		}
	}
	
	
	public int getID() {
		return orderID;
	}
	
	@Override
	public String toString() {
		return "Order ID=" + orderID + "\n"+ cart;
	}
	
}

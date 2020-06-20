package com.techlab.lineitem;

import java.util.ArrayList;

import com.techlab.product.Product;

public class LineItem {
	private ArrayList<Product> cart = new ArrayList<Product>();

	private int totalCost;
	
	public void addCart(Product p) {
			cart.add(p);
			totalCost += p.getCost();
	}
	
	public int getCartCost() {
		return totalCost;
	}

	public void updateTotal() {
		for(Product p: cart) {
			totalCost+=p.getCost();
		}
	}
	@Override
	public String toString() {
		return "Cart contains : \n" + cart + "\nCart Cost : " + totalCost + "";
	}
}

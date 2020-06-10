package com.techlab.product;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Product implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final String apple = "Apple", orange = "Orange", banana = "Banana";
	int appleCount = 0, orangeCount = 0, bananaCount = 0;
	int appleCost = 10, orangeCost = 20, bananaCost = 30;
	final int appleID = 1, orangeID = 2, bananaID = 3;
	private Map<String, Integer> cart = new HashMap<String, Integer>();
	private int total = 0;

	public void add(int choice, int unitCount) {
		switch (choice) {
		case appleID:
			appleCount += unitCount;
			total += (unitCount * appleCost);
			cart.put(apple, appleCount);
			break;
		case orangeID:
			orangeCount += unitCount;
			total += (unitCount * orangeCost);
			cart.put(orange, orangeCount);
			break;
		case bananaID:
			bananaCount += unitCount;
			total += (unitCount * bananaCost);
			cart.put(banana, bananaCount);
			break;
		default:

		}
	}

	public String search(String searchData) {
		return String.format("\tUnit : " + searchData + "\tQuantity : " + cart.get(searchData));
	}

	public void deleteFromCart(String deleteData) {
		switch (deleteData) {
		case apple:
			total -= (appleCost * cart.get(deleteData));
			break;
		case orange:
			total -= (orangeCost * cart.get(deleteData));
			break;
		case banana:
			total -= (bananaCost * cart.get(deleteData));
			break;
		default:
			break;
		}
		cart.remove(deleteData);
	}

	public int getTotal() {
		return total;
	}

	public Map<String, Integer> getCart() {
		return cart;
	}

}

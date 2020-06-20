package com.techlab.lineitem;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import com.techlab.product.Product;

public class LineItem implements Serializable {

	private Map<Product, Integer> cart = new HashMap<Product, Integer>();
	private int totalCost;

	public void add(Product p) {
		int initialCartValue = 1;
		if (cart.containsKey(p)) {
			cart.replace(p, cart.get(p) + 1);
		} else {
			cart.put(p, initialCartValue);
		}
		updateTotalCost();
	}

	public void add(Product p, int quantity) {
		boolean flag = true;
		Set<Product> key = cart.keySet();
		f: for (Product l : key) {
			if (l.getClass().equals(p.getClass())) {
				cart.replace(l, cart.get(l) + quantity);
				flag = false;
				break f;
			}
		}
		if (flag) {
			cart.put(p, quantity);
		}
		updateTotalCost();
	}
	
	
	public void remove(Product p , int quantity) {
		this.add(p, -quantity);
	}

	public void updateTotalCost() {
		totalCost = 0;
		Iterator<Entry<Product, Integer>> itr = cart.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Product, Integer> entry = itr.next();
			totalCost += cart.get(entry.getKey()) * entry.getKey().getCost();
		}
	}

	@Override
	public String toString() {
		return "Cart contains : " + cart + "\n" + "Total Cost = " + totalCost;
	}

}

package com.techlab.lineitem;
import java.util.HashMap;
import java.util.Map;
import com.techlab.product.Product;

public class LineItem {
	private Map<Product, Integer> cart = new HashMap<Product, Integer>();
	int appleCount = 0, orangeCount = 0, bananaCount = 0;
	int appleCost = 10, orangeCost = 20, bananaCost = 30;
	private int total = 0;

	public void addToCart(Product p, int unitCount) {
		switch (p.getProduct()) {
		case APPLE:
			appleCount += unitCount;
			total += (unitCount * appleCost);
			cart.put(p, appleCount);
			break;
		case BANANA:
			bananaCount += unitCount;
			total += (unitCount * bananaCost);
			cart.put(p, bananaCount);
			break;
		case ORANGE:
			orangeCount += unitCount;
			total += (unitCount * orangeCost);
			cart.put(p, orangeCount);
			break;
		}
	}
	public Map<Product, Integer> getCart() {
		return cart;
	}
	
	public int getTotal() {
		return total;
	}
	
	@Override
	public String toString() {
		
		return "LineItem [cart=" + cart + ", appleCount=" + appleCount + ", orangeCount=" + orangeCount
				+ ", bananaCount=" + bananaCount + ", total=" + total + "]";
	}
}

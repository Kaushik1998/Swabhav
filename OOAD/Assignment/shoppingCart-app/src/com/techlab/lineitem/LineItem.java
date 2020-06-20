package com.techlab.lineitem;

import java.util.HashMap;
import java.util.Map;

import com.techlab.product.Product;

public class LineItem {
	
	Map<Product,Integer> cartMap = new HashMap<Product, Integer>();
	
	public void addToMap(Product p, int count) {
		cartMap.put(p,(p.getCount()+ count));
	}
}

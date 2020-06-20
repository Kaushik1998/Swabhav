package com.techlab.product;

public class Product {
	public enum product {
		APPLE, ORANGE, BANANA
	};

	product fruit;

	public Product(product product) {
		this.fruit = product;
	}

	/**
	 * @return the fruit
	 */
	public product getProduct() {
		return fruit;
	}

	@Override
	public String toString() {
		return "Product [fruit=" + fruit + "]";
	}
	
}
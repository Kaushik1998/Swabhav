package com.techlab.product;

public class Product {
	public enum menu {
		mobile, laptop, computer, tv
	};

	private final int mobileCost = 10000, laptopCost = 45000, computerCost = 30000, tvCost = 15000;
	private int count;
	private int cost;
	private menu product;

	@Override
	public String toString() {
		return "Product = " + product + ", cost=" + cost + ", count=" + count;
	}

	public Product(menu product, int count) {
		this.product = product;
		this.count = count;
		setCost(product);
	}
	
	public Product(menu product) {
		this.product=product;
		setCost(product);
	}

	private void setCost(menu product) {
		// TODO Auto-generated method stub
		switch (product) {
		case mobile:
			cost = mobileCost * count;
			break;
		case laptop:
			cost = laptopCost * count;
			break;
		case computer:
			cost = computerCost * count;
			break;
		case tv:
			cost = tvCost * count;
			break;
		default:
			System.out.println("Error in setCost");
			break;
		}
	}

	public int getCount() {
		return count;
	}

	public int getCost() {
		return cost;
	}

	public menu getProduct() {
		return product;
	}
	
	public void setCount(int count) {
		this.count=count;
	}

}

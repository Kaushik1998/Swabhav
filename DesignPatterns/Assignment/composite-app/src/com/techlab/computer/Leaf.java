package com.techlab.computer;

public class Leaf implements Component {

	private String name;
	private int price;
	
	public Leaf(String name, int price) {
		this.name = name;
		this.price = price;
	}

	@Override
	public int getPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
	

}

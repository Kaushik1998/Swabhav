package com.techlab.line;

public class LineItem {
	private int id;
	private double unitPrice;
	private int quantity;
	private String name;
	static double total;
	
	public LineItem(){
		
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LineItem(int id, String name, double unitPrice, int quantity) {
		super();
		this.id = id;
		this.unitPrice = unitPrice;
		this.quantity = quantity;
		this.name = name;
		total+=(unitPrice*quantity);
	}
	
	public double calculateTotal() {
		return total;
	}
	
	@Override
	public String toString() {
		return "LineItem [id=" + id + ", unitPrice=" + unitPrice + ", quantity=" + quantity + ", name=" + name + "]";
	}

}

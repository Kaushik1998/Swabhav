package com.techlab.lsp_protected;

public class Rectangle implements IShapable {

	private double length;
	private double breadth;
	
	public Rectangle(double length, double breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.length * this.breadth;
	}

	public double getLength() {
		return length;
	}

	public double getBreadth() {
		return breadth;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public void setBreadth(double breadth) {
		this.breadth = breadth;
	}

}

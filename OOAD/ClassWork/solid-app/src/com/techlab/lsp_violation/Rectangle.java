package com.techlab.lsp_violation;

public class Rectangle {
	protected int length;
	protected int breadth;
	private int area;

	public void calculateArea() {
		this.area = this.length * this.breadth;
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}

	public int getArea() {
		return area;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}

}

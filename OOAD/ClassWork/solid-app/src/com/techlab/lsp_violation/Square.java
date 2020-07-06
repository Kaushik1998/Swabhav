package com.techlab.lsp_violation;

public class Square extends Rectangle {
	private int length = super.length;
	private int breadth = super.breadth;
	
	@Override
	public void setLength(int length) {
		this.length = length;
		this.breadth = length;
	}

	@Override
	public void setBreadth(int breadth) {
		this.length = breadth;
		this.breadth = breadth;
	}

	public int getLength() {
		return length;
	}

	public int getBreadth() {
		return breadth;
	}
		
}

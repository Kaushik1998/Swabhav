package com.techlab.lsp_protected;

public class Square implements IShapable {

	private double side;

	public Square(double side) {
		super();
		this.side = side;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side * side;
	}

}

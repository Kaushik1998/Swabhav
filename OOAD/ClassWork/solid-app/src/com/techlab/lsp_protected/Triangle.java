package com.techlab.lsp_protected;

public class Triangle implements IShapable {
	private double base;
	private double height;

	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return 0.5 * base * height;
	}

	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public void setHeight(double height) {
		this.height = height;
	}
}

package com.techlab.shape;

public class ShapeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShapeFactory sf = new ShapeFactory();
		Shape r = sf.getShape("Rectangle");
		Shape c = sf.getShape("Circle");
		r.draw();
		c.draw();
	}

}

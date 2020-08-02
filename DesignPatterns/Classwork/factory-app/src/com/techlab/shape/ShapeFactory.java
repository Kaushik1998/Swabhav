package com.techlab.shape;

public class ShapeFactory {
	public Shape getShape(String shape) {
		switch (shape) {
		case "Rectangle":
			return new Rectangle();
		case "Square":
			return new Square();
		case "Circle":
			return new Circle();
		default:
			return null;
		}
	}
}

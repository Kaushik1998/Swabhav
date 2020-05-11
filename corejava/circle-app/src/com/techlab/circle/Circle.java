package com.techlab.circle;

public class Circle {
	private float radius= 1f;
	private String color = "Pink";
	private final float PI = 3.14f;

	public float getRadius() {
		return radius;
	}

	public void setRadius(float data) {
		if (data > 0) {
			radius = data;
		}
	}

	public String getColor() {
		return color;
	}

	public void setColor(String data) {
		if (data.equalsIgnoreCase("PINK")) {
			color = "Pink";
		} else if (data.equalsIgnoreCase("Black")) {
			color = "Black";
		} else if (data.equalsIgnoreCase("GraY")) {
			color = "Gray";
		}
	}

	public float calculateArea() {
		return (PI * radius * radius);
	}

	public float getPerimeter() {
		return (2 * PI * radius);
	}
	


}

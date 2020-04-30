class Data {
	private float radius;
	private String color = "Pink";
	final float PI = 3.14f;

	float getRadius() {
		return radius;
	}

	void setRadius(float data) {
		if (data > 0) {
			radius = data;
		}
	}

	String getColor() {
		return color;
	}

	void setColor(String data) {
		color = data;
	}

	float calculateArea() {
		return (PI * radius * radius);
	}

	float calculatePerimeter() {
		return (2 * PI * radius);
	}
}

public class Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

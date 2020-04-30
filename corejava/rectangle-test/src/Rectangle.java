class TestRectangle {
	private float length = 10f;
	private float breadth = 15f;

	float getLength() {
		return length;
	}

	float getBreadth() {
		return breadth;
	}

	void setLength(float num) {
		if (num > 0 && num <= 100) {
			length = num;
		}
		else if (num<0) {
			length = 1;
		}
		else if (num>100) {
			length = 100;
		}
	}

	void setBreadth(float num) {
		if (num > 0 && num <= 100) {
			breadth = num;
		}
		else if (num<0) {
			breadth = 1;
		}
		else if (num>100) {
			breadth = 100;
		}
	}

	float calculateArea(float newLength, float newBreadth) {
		return newLength * newBreadth;
	}
}

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestRectangle tr = new TestRectangle();
		float t = 120f;
		tr.setLength(t);
		tr.setBreadth(t);
		System.out.println(tr.getBreadth());
	}

}

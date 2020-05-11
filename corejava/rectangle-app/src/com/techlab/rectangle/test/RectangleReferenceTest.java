package com.techlab.rectangle.test;
import com.techlab.rectangle.Rectangle;
public class RectangleReferenceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//I did the rectanglereferencetest
		//I cant hear anything
		Rectangle r1 = new Rectangle();
		Rectangle r2;
		r2=r1;
		r2.setLength(20f);
		r2.setBreadth(50f);
		System.out.println(new Rectangle());
		System.out.println(new Rectangle().hashCode());
		System.out.println(r2.hashCode());
		System.out.println(Rectangle.getHashCode(r2));
	}

}

package com.techlab.rectangle.test;
import com.techlab.rectangle.Rectangle;
public class RectangleAnonymousTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle r =new Rectangle();
		System.out.println(r);
		System.out.println(new Rectangle());
		new Rectangle().setBreadth(46f);
		System.out.println(new Rectangle().getBreadth());
		System.out.println(Rectangle.getHashCode(new Rectangle()));
	}

}

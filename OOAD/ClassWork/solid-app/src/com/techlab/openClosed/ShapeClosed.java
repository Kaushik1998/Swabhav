package com.techlab.openClosed;

public class ShapeClosed {
	private static final Object Rectangle = null;
	private static final Object Circle = null;

	public void Area(Object shapes[]) {
		for (Object o : shapes) {
			if(o.getClass().equals(Rectangle)) {
				//Rectangle code
			}
			else if(o.getClass().equals(Circle)) {
				//Circle code
			}
		}
	}
}

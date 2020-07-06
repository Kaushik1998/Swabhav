package com.techlab.lsp_protected.test;

import com.techlab.lsp_protected.Rectangle;
import com.techlab.lsp_protected.Square;
import com.techlab.lsp_protected.Triangle;

public class LSPProtectedTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rectangle = new Rectangle(5, 5);
		Square square = new Square(5);
		Triangle triangle = new Triangle(5,5);
		
		// The fact that we can use calculateArea() in every class implementing IShapable is saying that LSP is protected
		
		System.out.println(rectangle.calculateArea());
		System.out.println(square.calculateArea());
		System.out.println(triangle.calculateArea());

	}

}

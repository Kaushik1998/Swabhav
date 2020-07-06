package com.techlab.lsp_violation.test;

import com.techlab.lsp_violation.Rectangle;
import com.techlab.lsp_violation.Square;

public class LSPViolationTest {
	public static void main(String[] args) {
		
		Rectangle r = new Rectangle();
		r.setBreadth(5);
		r.setLength(10);
		System.out.println(should_not_change_if_height_changes(r));
		
		Square s = new Square();
		s.setLength(10);
		s.setBreadth(10);
		System.out.println(should_not_change_if_height_changes(s));
	}

	static boolean should_not_change_if_height_changes(Rectangle obj) {
		int before = obj.getLength();
		obj.setBreadth(obj.getBreadth() + 10);
		int after = obj.getLength();
		if (before == after) {
			return true;
		}
		return false;
	}
}

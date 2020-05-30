package com.techlab.child;

import com.techlab.parent.Father;
import com.techlab.parent.Mother;

public class Child implements Father,Mother{
	public void show() {
		Father.super.show();
		Mother.super.show();
		System.out.println("I am a child");
	}
}

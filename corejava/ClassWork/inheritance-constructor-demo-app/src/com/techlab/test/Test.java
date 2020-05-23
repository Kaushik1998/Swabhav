package com.techlab.test;

import com.techlab.child.Child;
import com.techlab.parent.Parent;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Parent p=new Parent(50);
		System.out.println(p.getFoo());
		System.out.println(new Child().getFoo());
		System.out.println(new Child(20).getFoo());
	}

}

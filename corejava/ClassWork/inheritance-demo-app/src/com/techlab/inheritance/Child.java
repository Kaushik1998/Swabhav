package com.techlab.inheritance;

public class Child extends Base{

	public Child() {

		// TODO Auto-generated constructor stub
		System.out.println("Inside child");
	}
	
	int foo;
	public Child(int foo) {
		super(foo);
		System.out.println("hi inside child const :"+foo);
	}

}

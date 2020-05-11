package com.techlab.day6.test;
 import com.techlab.day6.refined.*;
public class MissingNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GetMissingNumber c = new GetMissingNumber();
		int test[]= {1,2,3,5};
		c.setInput(test);
		int data[] = c.getMissingNumber();
		System.out.println(data[0]);
	}

}

package com.techlab.day6.test;
import com.techlab.day6.refined.*;
public class SeparateZeroTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SeparateZero s=new SeparateZero();
		int t[]={1,5,0,5,7,0,5,4};
		s.setInput(t);
		int test[]=s.getArray();
		for(int i:test) {
			System.out.println(i);
		}
	}

}

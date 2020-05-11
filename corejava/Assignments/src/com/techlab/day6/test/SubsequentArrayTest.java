package com.techlab.day6.test;
import com.techlab.day6.refined.*;
public class SubsequentArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SubsequentArray s = new SubsequentArray();
		s.setRequiredSum(6+12+8);
		int test[]=s.getArray();
		for(int i:test) {
			System.out.println(i);
		}
	}

}

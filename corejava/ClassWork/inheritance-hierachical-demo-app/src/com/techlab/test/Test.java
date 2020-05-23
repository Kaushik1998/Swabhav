package com.techlab.test;

import com.techlab.boy.Boy;
import com.techlab.infant.Infant;
import com.techlab.kid.Kid;
import com.techlab.man.Man;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Man x;
		x = new Man();
		x.plays();
		x.reads();
		
	}

	static public void atThePark(Man b) {
		System.out.println("At the park");
		b.plays();
	}
}

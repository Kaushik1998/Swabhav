package com.techlab.test;

import com.techlab.set.MySet;
import com.techlab.student.Student;

public class MySetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student kaushik = new Student("Kaushik", 93);
		Student paras = new Student("Paras", 99);
		Student shailesh = new Student("Shailesh",82);
		MySet set = new MySet();
		
		set.updateToSet(kaushik);
		set.updateToSet(shailesh);
		set.updateToSet(paras);
		set.updateToSet(kaushik);
		
		set.removeFromSet(paras);
		
		System.out.println(set);
	}

}

package com.techlab.Person.test;

import com.techlab.Person.Person;

public class PersonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("", "Male", 100f, 2.4f, -58);
		Person p2 = new Person("Kaushik", "Male", 15f, 200.0f);
		p.doEat();
		p.doWorkOut();
		p.doEat();
		printInfo(p);
		printInfo(p2);
	}

	static void printInfo(Person p) {
		System.out.println("Name : " + p.getName());
		System.out.println("Gender : " + p.getGender());
		System.out.println("Height : " + p.getHeight());
		System.out.println("Weight : " + p.getWeight());
		System.out.println("Age : " + p.getAge());
		System.out.println("BMI : "+p.getBMI());
	}

}

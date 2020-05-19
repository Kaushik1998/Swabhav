package com.techlab.student;

public class Student {
	private int id;
	private String name;
	private float cgpa;
	private static int countOfInstances;
	static {
		int countOfInstances = 0;
		System.out.println("We are in static block");
	}

	public Student(int id, String name, float cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		countOfInstances++;
		System.out.println("We are in constructor");
	}
	
	public int getCount() {
		return countOfInstances;
	}
	
	public static int headCount() {
		return countOfInstances;
	}
	
	public int getID() {
		return id;
	}
	
	public float getCGPA() {
		return cgpa;
	}
	
	public String getName() {
		return name;
	}
}

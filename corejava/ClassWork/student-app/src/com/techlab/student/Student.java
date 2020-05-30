package com.techlab.student;

public class Student {
	private int id;
	private String name;
	private float cgpa;

	public enum genders {
		MALE, FEMALE
	};

	public enum branches {
		COMP, IT, ELEX
	};

	private branches branch;
	private genders gender;

	public Student(int id, String name, float cgpa, genders gender, branches branch) {
		this(id, name, cgpa,gender);
		this.branch = branch;
	}

	public Student(int id, String name, float cgpa, genders gender) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
		this.gender = gender;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public float getCGPA() {
		return cgpa;
	}

	public branches getBranch() {
		return branch;
	}
	
	public genders getGender() {
		return gender;
	}

	@Override
	public int hashCode() {
		return id;
	}

	public boolean equals(Object o) {
		Student s = (Student) o;
		if (this.id == s.id && this.name == s.name) {
			return true;
		} else {
			return false;
		}
	}
	
	abstract void data() {
		System.out.println("ddd");
	}
	
	@Override
	public String toString() {
		return String.format("Name : " + name+" \nID : " + id+"\nCGPA : "+cgpa+"\nBranch : "+branch+"\nGender : "+gender);
	}
}

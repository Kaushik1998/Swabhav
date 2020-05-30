package com.techlab.student.test;

import com.techlab.student.Student;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(1, "Kaushik", 10.0f, Student.genders.MALE,Student.branches.COMP);
		Student s2=new Student(1, "Kaushik", 10.0f, Student.genders.MALE,Student.branches.IT);
		System.out.println(s2);
	}

}

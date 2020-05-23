package com.techlab.test;

import java.text.ParseException;

import com.techlab.professor.Professor;
import com.techlab.student.Student;

public class Test {
	public static void main(String[] args) throws ParseException {
		Student s=new Student("Kaushik",93, "Malad", "18/08/1998", "computer Engineering");
		String pClasses[]={"History","Computer","English"};
		Professor p=new Professor("Sonam",19, "Andheri", "15/08/1947", "doctor in computer engineering", pClasses);
		printP(p);
	}
	
	static void printP(Professor p) {
		System.out.println("Name : " + p.getName());
		System.out.println("Qualification : "+ p.getQualification());
		System.out.println("ID : "+ p.getID());
		System.out.println("Salary : "+p.getSalary());
		System.out.println("Birthday : " + p.getDate());
		System.out.println("Address : "+ p.getAddress());
		for(String s:p.getClasses()) {
			System.out.println("Class : "+ s);
		}
	}
	
	static void printS(Student s) {
		System.out.println("Name : "+ s.getName());
		System.out.println("ID : "+s.getID());
		System.out.println("Course: " +s.getCourse());
		System.out.println("Birthday : "+ s.getDate());
		System.out.println("Address : "+ s.getAddress());
	}
}

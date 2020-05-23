package com.techlab.student;

import java.text.ParseException;
import java.util.Date;

import com.techlab.person.Person;

public class Student extends Person{
private String course;


	public Student(String name,int id, String address, String birthDate,String course) throws ParseException {
		super(name,id, address, birthDate);
		// TODO Auto-generated constructor stub
		this.course=course;
	}
	
	public int getID() {
		return super.getID();
	}
	
	public String getCourse() {
		return course;
	}
	
	public Date getDate() {
		return super.getDate();
	}
	
	public String getName() {
		return super.getName();
	}
	

	public String getAddress() {
		return super.getAddress();
	}
}

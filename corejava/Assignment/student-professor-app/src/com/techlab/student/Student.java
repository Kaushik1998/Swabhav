package com.techlab.student;

import java.text.ParseException;
import java.util.Date;

import com.techlab.person.Person;

public class Student extends Person{
private String studentID;
private String course;


	public Student(String name,int id, String address, String birthDate,String course) throws ParseException {
		super(name,id, address, birthDate);
		// TODO Auto-generated constructor stub
		this.studentID=getAbbre(course)+Integer.toString(id);
		this.course=course;
	}
	String getAbbre(String course) {
		if(course.contains("computer")) {
			return "comp";
		}
		else if(course.contains("information")) {
			return "it";
		}
		else if(course.contains("electronic")) {
			return "elex";
		}
		else if(course.contains("electrical")) {
			return "extc";
		}
		else if(course.contains("civil")) {
			return "civil";
		}
		else if(course.contains("automobile")) {
			return "auto";
		}
		return "unspecified";
	}
	
	public String getID() {
		return studentID;
	}
	
	public String getCourse() {
		return course;
	}
	
	public Date getDate() {
		return birthDate;
	}
	
	public String getName() {
		return name;
	}
	

	public String getAddress() {
		return super.getAddress();
	}
}

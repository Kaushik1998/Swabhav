package com.techlab.professor;

import java.text.ParseException;
import java.util.Date;

import com.techlab.person.Person;

public class Professor extends Person {
	private final int BASE_SALARY = 25000;
	private int salary = BASE_SALARY;
	private String professorID;
	private int incrementQualification;
	private String qualification;
	private String classes[];

	public Professor(String name,int id, String address, String birthDate, String qualification, String classes[])
			throws ParseException {
		super(name,id, address, birthDate);
		// TODO Auto-generated constructor stub
		this.professorID = getAbbre(qualification) + id;
		this.classes = classes;
		setSalary(classes);
		this.qualification = qualification;
		this.address = address;
	}

	String getAbbre(String qualification) {
		if (qualification.contains("bachelor")) {
			incrementQualification = 0;
			return "B";

		} else if (qualification.contains("master")) {
			incrementQualification = 10000;
			return "M";

		} else if (qualification.contains("doctor")) {
			incrementQualification = 20000;
			return "D";
		}
		incrementQualification = 0;
		return "?";
	}

	void setSalary(String classes[]) {
		int incrementClasses = classes.length * 1000;
		salary += incrementClasses + incrementQualification;
	}

	public int getSalary() {
		return salary;
	}

	public String getProfessorID() {
		return professorID;
	}

	public Date getDate() {
		return birthDate;
	}

	public String getQualification() {
		return qualification;
	}

	public String[] getClasses() {
		return classes;
	}
	public String getAddress() {
		return super.getAddress();
	}
	
	public String getName() {
		return name;
	}
}

package com.techlab.teacher;

import com.techlab.template.Person;

public class Teacher extends Person {
	private double salary;
	private String[] coursesToTeach;
	private String record;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String[] getCoursesToTeach() {
		return coursesToTeach;
	}

	public void setCoursesToTeach(String[] coursesToTeach) {
		this.coursesToTeach = coursesToTeach;
	}

	public String getRecord() {
		return record;
	}

	public void setRecord(String record) {
		this.record = record;
	}
}

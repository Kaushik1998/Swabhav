package com.techlab.department;

import java.util.ArrayList;

import com.techlab.student.Student;

public class Department {
	// deptID,deptname,listOfStudents[], constructor and getters, toString override
	private int deptID;
	private String deptName;
	private ArrayList<Student> listOfStudents = new ArrayList<Student>();

	/**
	 * @param deptID
	 * @param deptName
	 */
	public Department(int deptID, String deptName) {
		this.deptID = deptID;
		this.deptName = deptName;
	}

	public int getDeptID() {
		return deptID;
	}

	public String getDeptName() {
		return deptName;
	}

	public ArrayList<Student> getListOfStudents() {
		return listOfStudents;
	}

	public void addStudent(Student s) {
		listOfStudents.add(s);
	}

	@Override
	public String toString() {
		StringBuilder studentNames = new StringBuilder();
		for (Student d : listOfStudents) {
			studentNames.append(d.getStudentName());
			studentNames.append("\t");
		}
		return "Department [\tdeptID=" + deptID + "\tdeptName=" + deptName + "\tnumber of students=" + listOfStudents.size()
				+ "\tstudents= " + studentNames + "]";
	}
}

package com.techlab.department;

import java.util.ArrayList;

import com.techlab.student.Student;

public class Department {
	// deptID,deptname,listOfStudents[], constructor and getters, toString override
	private int deptID;
	private String deptName;
	ArrayList<Student> listOfStudents = new ArrayList<Student>();

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

	public void setDeptID(int deptID) {
		this.deptID = deptID;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public ArrayList<Student> getListOfStudents() {
		return listOfStudents;
	}

	public void setListOfStudents(ArrayList<Student> listOfStudents) {
		this.listOfStudents = listOfStudents;
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

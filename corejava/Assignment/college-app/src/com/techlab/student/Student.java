package com.techlab.student;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Student {

	// studentID,studentname,DOB,Address , constructor and getters, toString
	// override
	private int studentID;
	private String studentName;
	private Date birthDate;
	private String address;

	/**
	 * @param studentID
	 * @param studentName
	 * @param address
	 * @throws ParseException
	 */
	public Student(int studentID, String studentName, String birthDate, String address) throws ParseException {
		this.studentID = studentID;
		this.studentName = studentName;
		this.birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(birthDate);
		this.address = address;
	}

	public int getStudentID() {
		return studentID;
	}

	public String getStudentName() {
		return studentName;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public String getAddress() {
		return address;
	}

	public void setStudentID(int studentID) {
		this.studentID = studentID;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [\n\tstudentID=" + studentID + "\tstudentName=" + studentName + "\tbirthDate=" + birthDate
				+ "\taddress=" + address + "\t]\n";
	}

}

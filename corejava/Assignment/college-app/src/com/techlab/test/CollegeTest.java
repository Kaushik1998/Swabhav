package com.techlab.test;

import java.text.ParseException;

import com.techlab.college.College;
import com.techlab.department.Department;
import com.techlab.student.Student;

public class CollegeTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		College nexsales = new College(1, "Nexsales");

		Department java = new Department(11, "Java");
		Department python = new Department(12, "Python");
		Department javascript = new Department(13, "JavaScript");
		Student kaushik = new Student(111, "Kaushik", "18/08/1998", "Malad");
		Student paras = new Student(112, "Paras", "31/12/1998", "Ulhasnagar");
		Student shailesh = new Student(113, "Shailesh", "15/08/1998", "Borivali");
		Student jayant = new Student(114, "Jayant", "26/07/1998", "Solapur");

		javascript.addStudent(kaushik);
		javascript.addStudent(shailesh);
		javascript.addStudent(paras);
		javascript.addStudent(jayant);

		python.addStudent(kaushik);
		python.addStudent(shailesh);

		java.addStudent(paras);
		java.addStudent(jayant);

		nexsales.addDepartment(java);
		nexsales.addDepartment(python);
		nexsales.addDepartment(javascript);

		//System.out.println(nexsales);
		System.out.println(javascript.getListOfStudents());
		//System.out.println(kaushik);
	}

}

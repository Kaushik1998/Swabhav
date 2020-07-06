package com.techlab.analyzer;

import java.io.IOException;

import com.techlab.employee.Employee;

public class Test {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileAnalyzer fa = new FileAnalyzer();
		Employee e= fa.getMaximumSalariedEmployee();
		//System.out.println("Maximum Salary Employee");
		System.out.println(e);
		
		//System.out.println("Employee by designation SALESMAN");
		//System.out.println(fa.getEmployeeByDesignation("'SALESMAN'"));
		
		//System.out.println("Total number of employees as SALESMAN");
		//System.out.println(fa.getTotalEmployeeInDesignation("'SALESMAN'"));
		
		System.out.println(fa.getTotalEmployeeInDepartMent("950"));
		
		
	}

}

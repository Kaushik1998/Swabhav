package com.techlab.parser;


import java.io.BufferedReader;
import java.io.IOException;

import com.techlab.employee.Employee;
import com.techlab.employee.EmployeeList;
import com.techlab.loader.GetFile;


public class FileParser {
	private static GetFile gf;
	private static BufferedReader br;
	private static String line = "";
	private final static String splitComma = ",";

	public FileParser() throws IOException {

	}

	static public void scanFile() throws IOException {
		gf = new GetFile();
		br = new BufferedReader(gf.getFileFromDevice());
		while ((line = br.readLine()) != null) {
			String[] employee = line.split(splitComma);
			addEmployeeToList(employee[0], employee[1], employee[2], employee[3], employee[4], employee[5], employee[6],
					employee[7]);
		}
	}
	
	public static void addEmployeeToList(String empID, String empName, String empDesignation, String empManagerID,
			String dateOfJoining, String empSalary, String commisionNumber, String deptNumber) {

		Employee employee = new Employee(empID, empName, empDesignation, empManagerID, dateOfJoining, empSalary,
				commisionNumber, deptNumber);
		EmployeeList.addEmployeeToList(empID, employee);
	}
}


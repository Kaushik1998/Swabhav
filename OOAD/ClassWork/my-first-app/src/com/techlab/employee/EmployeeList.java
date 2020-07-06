package com.techlab.employee;

import java.util.HashMap;
import java.util.Map;

public class EmployeeList {
	private static Map<String, Employee> employeeList = new HashMap<String, Employee>();

	static public void addEmployeeToList(String id, Employee e) {
		employeeList.put(id, e);
	}

	public static Map<String, Employee> getEmployeeList() {
		return employeeList;
	}
}

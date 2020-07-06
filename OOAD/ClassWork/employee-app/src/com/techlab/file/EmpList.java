package com.techlab.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class EmpList implements IFilePath {
	static private List<Employee> empObj = new ArrayList<Employee>();
	private String line = "";
	private final String splitComma = ",";

	public void createListFromFile() throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			while ((line = br.readLine()) != null) {
				String[] employee = line.split(splitComma);

				empObj.add(new Employee(employee[0], employee[1], employee[2], employee[3], employee[4], employee[5],
						employee[6], employee[7]));
			}
		}
	}

	public List<Employee> getEmpObj() {
		return empObj;
	}

	public void addEmployee(Employee e) {
		empObj.add(e);
	}
}
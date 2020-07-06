package com.techlab.analyzer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.techlab.employee.Employee;
import com.techlab.employee.EmployeeList;
import com.techlab.parser.FileParser;

interface IMaximumSalariedEmployee {
	Employee getMaximumSalariedEmployee();
}

interface IEmployeeInDepartment {
	List<Employee> getEmployeeInDepartment(String department);
}

interface ITotalEmployeeInDepartment {
	int getTotalEmployeeInDepartMent(String department);
}

interface IEmployeeByDesignation {
	List<Employee> getEmployeeByDesignation(String designation);
}

interface ITotalEmployeeInDesignation {
	int getTotalEmployeeInDesignation(String designation);
}

public class FileAnalyzer implements IMaximumSalariedEmployee, IEmployeeInDepartment, IEmployeeByDesignation,
		ITotalEmployeeInDepartment, ITotalEmployeeInDesignation {
	private Map<String, Employee> employeeList;

	public FileAnalyzer() throws IOException {
		FileParser.scanFile();
		employeeList = EmployeeList.getEmployeeList();
	}

	@Override
	public Employee getMaximumSalariedEmployee() {
		// TODO Auto-generated method stub
		int maxSalary = 0;
		Employee maxSalaryEmployee = null;
		for (Map.Entry<String, Employee> emp : employeeList.entrySet()) {
			Employee employee = emp.getValue();
			int employeeSalary = Integer.parseInt(employee.getEmpSalary());
			if (employeeSalary > maxSalary) {
				maxSalary = employeeSalary;
				maxSalaryEmployee = employee;
			}
		}
		return maxSalaryEmployee;
	}

	@Override
	public List<Employee> getEmployeeInDepartment(String department) {
		// TODO Auto-generated method stub
		List<Employee> employeeInDepartment = new ArrayList<Employee>();
		for (Map.Entry<String, Employee> emp : employeeList.entrySet()) {
			Employee e = emp.getValue();
			if (e.getDeptNumber().equals(department)) {
				employeeInDepartment.add(e);
			}
		}
		return employeeInDepartment;
	}

	@Override
	public List<Employee> getEmployeeByDesignation(String designation) {
		// TODO Auto-generated method stub
		List<Employee> employeeWithDesignation = new ArrayList<Employee>();
		for (Map.Entry<String, Employee> emp : employeeList.entrySet()) {
			Employee e = emp.getValue();
			if (e.getEmpDesignation().equals(designation)) {
				employeeWithDesignation.add(e);
			}
		}
		return employeeWithDesignation;
	}

	@Override
	public int getTotalEmployeeInDepartMent(String department) {
		// TODO Auto-generated method stub
		int totalEmployees = getEmployeeInDepartment(department).size();
		return totalEmployees;
	}

	@Override
	public int getTotalEmployeeInDesignation(String designation) {
		// TODO Auto-generated method stub
		int totalEmployeeInDesignation = getEmployeeByDesignation(designation).size();
		return totalEmployeeInDesignation;
	}

}

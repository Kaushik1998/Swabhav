package com.techlab.company;

import com.techlab.employee.Analyst;
import com.techlab.employee.Developer;
import com.techlab.employee.Employee;
import com.techlab.employee.EmployeeType;
import com.techlab.employee.Manager;

public class B2X {
	private static CompanyBranch company = CompanyBranch.B2X;

	public Employee getEmployee(EmployeeType employee) {
		switch (employee) {
		case Manager:
			return new Manager(company);
		case Developer:
			return new Developer(company);
		case Analyst:
			return new Analyst(company);
		default:
			return null;
		}
	}
}

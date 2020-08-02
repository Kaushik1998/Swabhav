package com.techlab.employee;

import com.techlab.company.CompanyBranch;

public class Manager extends Employee {
	private final static EmployeeType designation = EmployeeType.Manager;

	public Manager(CompanyBranch company) {
		super(EmployeeType.Manager, company);
		// TODO Auto-generated constructor stub
	}

}

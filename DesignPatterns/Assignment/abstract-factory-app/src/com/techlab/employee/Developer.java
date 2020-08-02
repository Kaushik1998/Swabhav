package com.techlab.employee;

import com.techlab.company.CompanyBranch;

public class Developer extends Employee {
	private final static EmployeeType designation = EmployeeType.Developer;

	public Developer(CompanyBranch company) {
		super(designation, company);
		// TODO Auto-generated constructor stub
	}

}

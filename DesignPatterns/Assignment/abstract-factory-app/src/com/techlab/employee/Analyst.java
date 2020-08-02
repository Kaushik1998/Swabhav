package com.techlab.employee;

import com.techlab.company.CompanyBranch;

public class Analyst extends Employee {
	private final static EmployeeType designation = EmployeeType.Analyst;

	public Analyst(CompanyBranch company) {
		super(designation, company);
		// TODO Auto-generated constructor stub
	}

}

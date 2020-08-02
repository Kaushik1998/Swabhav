package com.techlab.employee;

import com.techlab.company.CompanyBranch;

public abstract class Employee {
	private EmployeeType designation;
	private CompanyBranch company;

	public Employee(EmployeeType designation, CompanyBranch company) {
		this.designation = designation;
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [designation=" + designation + ", company=" + company + "]";
	}

}

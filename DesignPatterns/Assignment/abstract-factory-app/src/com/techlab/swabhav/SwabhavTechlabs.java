package com.techlab.swabhav;

import com.techlab.company.B2X;
import com.techlab.company.CompanyBranch;
import com.techlab.company.NexSales;
import com.techlab.employee.Employee;
import com.techlab.employee.EmployeeType;

public class SwabhavTechlabs {

	private CompanyBranch company;

	public void setCompany(CompanyBranch company) {
		this.company = company;
	}

	public Employee getEmployee(EmployeeType e) {
		switch (company) {
		case NexSales:
			return new NexSales().getEmployee(e);
		case B2X:
			return new B2X().getEmployee(e);
		default:
			return null;
		}
	}
}

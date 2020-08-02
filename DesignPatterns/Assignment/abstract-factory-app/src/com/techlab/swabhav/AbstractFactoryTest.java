package com.techlab.swabhav;

import com.techlab.company.CompanyBranch;
import com.techlab.employee.EmployeeType;

public class AbstractFactoryTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SwabhavTechlabs s = new SwabhavTechlabs();
		s.setCompany(CompanyBranch.NexSales);
		System.out.println(s.getEmployee(EmployeeType.Analyst));
		System.out.println(s.getEmployee(EmployeeType.Developer));
	}

}

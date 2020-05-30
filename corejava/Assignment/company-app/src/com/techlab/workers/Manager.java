package com.techlab.workers;

import com.techlab.employee.Employee;

public class Manager extends Employee {
	double HRA = ((basicSalary / 100) * 50);
	double TA = ((basicSalary / 100) * 40);
	double DA = ((basicSalary / 100) * 30);
	double bonus = HRA + TA + DA;

	public Manager(int empID, String name) {
		super(empID, name);
		// TODO Auto-generated constructor stub
		grossSalary = calculateSalary();
	}

	@Override
	public double calculateSalary() {
		// TODO Auto-generated method stub
		setBonus(bonus);
		double newSalary = basicSalary + bonus;
		return newSalary;
	}

	public double getHRA() {
		return HRA;
	}

	public double getTA() {
		return TA;
	}

	public double getDA() {
		return DA;
	}

}

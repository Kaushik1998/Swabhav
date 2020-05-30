package com.techlab.workers;

import com.techlab.employee.Employee;

public class Analyst extends Employee {
	private double bonus = ((basicSalary / 100) * 20);

	public double getBonus() {
		return bonus;
	}


	public Analyst(int empID, String name) {
		super(empID, name);
		// TODO Auto-generated constructor stub
		grossSalary = calculateSalary();
	}

	@Override
	public double calculateSalary() {
		setBonus(bonus);
		double newSalary = basicSalary + bonus;
		return newSalary;
	}

}

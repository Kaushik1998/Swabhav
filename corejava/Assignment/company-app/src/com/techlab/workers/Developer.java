package com.techlab.workers;

import com.techlab.employee.Employee;

public class Developer extends Employee {
	
	private double bonus = ((basicSalary / 100) * 30);

	public Developer(int empID, String name) {
		super(empID, name);
		// TODO Auto-generated constructor stub
		grossSalary = calculateSalary();
	}



	public double calculateSalary() {
		setBonus(bonus);
		double newSalary = basicSalary + bonus;
		return newSalary;
	}

	public double getBonus() {
		return bonus;
	}

}

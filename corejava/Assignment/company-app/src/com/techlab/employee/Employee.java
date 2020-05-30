package com.techlab.employee;

abstract public class Employee {
	private int empID;
	private String name;
	protected float basicSalary = 10000;
	protected double grossSalary;
	protected double bonus;
	
	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}

	public Employee(int empID, String name) {
		this.empID = empID;
		this.name = name;
	}

	public double getSalary() {
		return grossSalary;
	}

	public int getEmpID() {
		return empID;
	}

	public String getName() {
		return name;
	}

	public float getBasicSalary() {
		return basicSalary;
	}

	public double getGrossSalary() {
		return grossSalary;
	}

	public abstract double calculateSalary();

}

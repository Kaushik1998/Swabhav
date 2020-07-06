package com.techlab.employee;

public class Employee {
	// Employee id, Employee name, Employee designation, Manager id, Date of joining, Salary, Commission and Department number
	// 7698,'BLAKE','MANAGER',7839,'1-MAY-81',2850,NULL,30
	private String empID;
	private String empName;
	private String empDesignation;
	private String empManagerID;
	private String dateOfJoining;
	private String empSalary;
	private String commisionNumber;
	private String deptNumber;

	public Employee(String empID, String empName, String empDesignation, String empManagerID, String dateOfJoining,
			String empSalary, String commisionNumber, String deptNumber) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.empDesignation = empDesignation;
		this.empManagerID = empManagerID;
		this.dateOfJoining = dateOfJoining;
		this.empSalary = empSalary;
		this.commisionNumber = commisionNumber;
		this.deptNumber = deptNumber;
	}

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", empDesignation=" + empDesignation
				+ ", empManagerID=" + empManagerID + ", dateOfJoining=" + dateOfJoining + ", empSalary=" + empSalary
				+ ", commisionNumber=" + commisionNumber + ", deptNumber=" + deptNumber + "]";
	}
	
	public Employee() {

	}

	public String getEmpName() {
		return empName;
	}

	public String getEmpID() {
		return empID;
	}

	public String getEmpDesignation() {
		return empDesignation;
	}

	public String getDateOfJoining() {
		return dateOfJoining;
	}

	public String getEmpManagerID() {
		return empManagerID;
	}

	public String getEmpSalary() {
		return empSalary;
	}

	public String getCommisionNumber() {
		return commisionNumber;
	}

	public String getDeptNumber() {
		return deptNumber;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public void setEmpID(String empID) {
		this.empID = empID;
	}

	public void setEmpDesignation(String empDesignation) {
		this.empDesignation = empDesignation;
	}

	public void setDateOfJoining(String dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

	public void setEmpManagerID(String empManagerID) {
		this.empManagerID = empManagerID;
	}

	public void setEmpSalary(String empSalary) {
		this.empSalary = empSalary;
	}

	public void setCommisionNumber(String commisionNumber) {
		this.commisionNumber = commisionNumber;
	}

	public void setDeptNumber(String deptNumber) {
		this.deptNumber = deptNumber;
	}

}


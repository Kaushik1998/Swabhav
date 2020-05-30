package com.techlab.test;

import com.techlab.employee.Employee;
import com.techlab.workers.Analyst;
import com.techlab.workers.Developer;
import com.techlab.workers.Manager;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee developer = new Developer(1, "Kaushik");
		Employee analyst = new Analyst(2, "Shailesh");
		Employee manager = new Manager(3, "Sonam");

		System.out.println("-------------Developer-------------");
		printInfo(developer);
		System.out.println("-------------Analyst--------------");
		printInfo(analyst);
		System.out.println("-------------Manager-------------");
		printInfo(manager);
		printManager(manager);
	}

	static void printInfo(Employee e) {
		System.out.println("Name : " + e.getName());
		System.out.println("ID : " + e.getEmpID());
		System.out.println("Basic Salary : " + e.getBasicSalary());
		System.out.println("Bonus : " + e.getBonus());
		System.out.println("Gross Salary : " + e.getGrossSalary());
		System.out.println();
	}

	static void printManager(Employee e) {
		Manager temp = (Manager) e;
		System.out.println("HRA : " + temp.getHRA());
		System.out.println("TA : "+temp.getTA());
		System.out.println("DA : "+temp.getDA());
	}
}

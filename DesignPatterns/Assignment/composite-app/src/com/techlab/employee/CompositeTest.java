package com.techlab.employee;

public class CompositeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee kaushik = new Developer(11, "Kaushik", "Java");
		Employee shailesh = new Developer(12, "Shailesh", "Java");
		Manager sonam = new Manager(1, "Sonam", "Swabhav");
		
		CompanyDirectory swabhav=new CompanyDirectory();
		swabhav.addEmployee(sonam);
		swabhav.addEmployee(kaushik);
		swabhav.addEmployee(shailesh);
		swabhav.showEmployeeDetails();
	}

}

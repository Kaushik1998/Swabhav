package com.techlab.account;

public class AccountTest {
	public static void main(String[] args) {
		Account a =new Account();
		a.setName("Kaushik");
		a.setEmailID("nippanikarkaushik@gmail.com");
		//a.setNumber(877995799);
		a.deposit(600);
		a.credit(100);
	}
	
}

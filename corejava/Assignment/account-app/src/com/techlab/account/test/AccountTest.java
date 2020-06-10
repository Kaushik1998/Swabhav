package com.techlab.account.test;

import com.techlab.account.Account;

public class AccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new Account("Kaushik");
		a.withdraw(556);
		a.withdraw(1000);
		printInfo(a);
		
	}

	static void printInfo(Account a) {
		System.out.println("Accountholder Name : " + a.getName());
		System.out.println("Account number : " + a.getAccount());
		System.out.println("Balance : " + a.getBalance());
	}
}

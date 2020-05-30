package com.techlab.test;

import com.techlab.account.Account;
import com.techlab.account.current.CurrentAccount;
import com.techlab.account.saving.SavingAccount;

public class Test {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account a = new SavingAccount(1, "Kaushik", 500.0);
		a.deposit(100);
		a.withdraw(200);
		a.withdraw(10);
		printInfo(a);

		Account b = new CurrentAccount(2, "Ksn", 1000);
		b.deposit(100);
		b.withdraw(200);
		b.withdraw(1000);
		printInfo(b);
	}

	static void printInfo(Account a) {
		System.out.println("Name : " + a.getName());
		System.out.println("ID :" + a.getID());
		System.out.println("Balance : " + a.getBalance());
	}
}

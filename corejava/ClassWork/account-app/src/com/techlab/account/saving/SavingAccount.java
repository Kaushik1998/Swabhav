package com.techlab.account.saving;

import com.techlab.account.Account;

public class SavingAccount extends Account {

	private int min_balance=500;

	public SavingAccount(int id, String name, double balance) {
		super(id, name, balance);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void withdraw(int money) {
		// TODO Auto-generated method stub
		if(super.balance>min_balance) {
			super.balance-=money;
		}
	}

}

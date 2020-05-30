package com.techlab.account;

abstract public class Account {


	protected int id;
	protected String name;
	protected double balance ;

	public void deposit(double money) {
		balance += money;
	}

	public Account(int id, String name, double balance) {
		this.id = id;
		this.balance = balance;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public double getBalance() {
		return balance;
	}

	public int getID() {
		return id;
	}
	
	abstract public void withdraw(int money);
	
}

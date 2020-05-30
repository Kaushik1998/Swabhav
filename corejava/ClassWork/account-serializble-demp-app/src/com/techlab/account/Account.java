package com.techlab.account;

import java.io.Serializable;

public class Account implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected int id;
	protected String name;
	protected double balance;
	protected int min_balance = 500;
	private int transactions = 0;

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

	public void withdraw(int money) {
		if (balance > min_balance) {
			balance -= money;
			transactions++;
		}
	}

	public void deposit(double money) {
		balance += money;
		transactions++;
	}

	public int getTransactions() {
		return transactions;
	}
	
	public String toString() {
		return String.format("Name : " + getName()+"\nID : "+getID()+"\nBalance : "+getBalance()+"\nTransactions : "+getTransactions()+"\nVersion : "+serialVersionUID);
	}
}

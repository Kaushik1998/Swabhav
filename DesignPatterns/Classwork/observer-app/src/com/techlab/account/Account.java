package com.techlab.account;

import java.util.ArrayList;
import java.util.List;

public class Account {
	private int number;
	private String name;
	private double balance;
	private String emailID;
	private boolean isEmailAdded = false, isNumberAdded = false;
	private List<Listener> listeners = new ArrayList<>();

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
		if (!isNumberAdded) {
			isNumberAdded = true;
			SmsListener sms = new SmsListener();
			sms.setUser(this);
			listeners.add(sms);
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getEmailID() {
		return emailID;
	}

	public void setEmailID(String emailID) {
		this.emailID = emailID;
		if (!isEmailAdded) {
			isEmailAdded = true;
			EmailListener email = new EmailListener();
			email.setUser(this);
			listeners.add(email);
		}
	}

	public void deposit(double amount) {
		balance += amount;
		for (Listener l : listeners) {
			l.update(AccountTransaction.Deposited,amount);
		}
	}

	public void credit(double amount) {
		balance -= amount;
		for (Listener l : listeners) {
			l.update(AccountTransaction.Credited,amount);
		}
	}

	@Override
	public String toString() {
		return name;
	}
	
	

}

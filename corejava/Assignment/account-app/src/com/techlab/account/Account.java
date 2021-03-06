package com.techlab.account;

import java.util.Random;

public class Account {
	private String accNo;
	private String name;
	private final int MINIMUM_BALANCE=500;
	private double balance= MINIMUM_BALANCE;
	
	public Account(String name){
		generateAccount();
		this.name=name;
	}
	
	public void generateAccount() {
		int i =new Random().nextInt(1000);
		accNo=String.valueOf(i);
	}
	
	public String getAccount() {
		return accNo;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return name;
	}
	
	public void deposit(int money) {
		if(money>0) {
			balance+=money;
		}
	}
	
	public void withdraw(int money) {
		if(balance>=MINIMUM_BALANCE) {
			balance-=money;
		}
		
		else {
			throw new LowBalance();
		}
	}
	
	public double getBalance() {
		return balance;
	}
}

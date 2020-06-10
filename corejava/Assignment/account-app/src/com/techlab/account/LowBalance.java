package com.techlab.account;

public class LowBalance extends RuntimeException {
	public LowBalance() {
		super("Balance is Low");
	}
}

package com.techlab.account.current;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CurrentAccountTest {
	
	CurrentAccount ca=new CurrentAccount(1, "Kaushik", 2000);
	@Test
	void testDeposit() {
		double expectedBalance=2000;
		assertEquals(expectedBalance, ca.getBalance());
	}
	
	@Test
	void testWithdraw() {
		int expectedBalance=0;
		ca.withdraw(2000);
		assertEquals(expectedBalance, ca.getBalance());
	}
	
	@Test
	void testConstructor() {
		int expectedID=1;
		String expectedName="Kaushik";
		int expectedBalance=2000;
		assertEquals(expectedID, ca.getID());
		assertEquals(expectedName,ca.getName());
		assertEquals(expectedBalance,ca.getBalance());
	}
}

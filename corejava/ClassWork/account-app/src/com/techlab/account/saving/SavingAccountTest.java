package com.techlab.account.saving;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SavingAccountTest {
	SavingAccount sa = new SavingAccount(1, "Kaushik", 2000);
	
	@Test
	void testDeposit() {
		double expectedBalance=2000;
		assertEquals(expectedBalance, sa.getBalance());
	}
	
	@Test
	void testWithdraw() {
		int expectedBalance=0;
		sa.withdraw(2000);
		assertEquals(expectedBalance, sa.getBalance());
	}
	
	@Test
	void testConstructor() {
		int expectedID=1;
		String expectedName="Kaushik";
		int expectedBalance=2000;
		assertEquals(expectedID, sa.getID());
		assertEquals(expectedName,sa.getName());
		assertEquals(expectedBalance,sa.getBalance());
	}

}

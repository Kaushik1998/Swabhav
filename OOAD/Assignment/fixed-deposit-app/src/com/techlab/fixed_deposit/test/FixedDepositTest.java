package com.techlab.fixed_deposit.test;

import com.techlab.fixed_deposit.Diwali;
import com.techlab.fixed_deposit.FixedDeposit;

public class FixedDepositTest {
	public static void main(String[] args) {
		FixedDeposit fd=new FixedDeposit(1, "Kaushik", 1000, 6, new Diwali());
		System.out.println(fd.getAmount());
	}
}

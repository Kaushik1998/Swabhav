package com.techlab.fixed_deposit.test;

import com.techlab.fixed_deposit.FixedDeposit;
import com.techlab.fixed_deposit.FixedDeposit.FestivalType;

public class FixedDepositTest {

	public static void main(String[] args) {
		FixedDeposit fd = new FixedDeposit(1, "KAushik", 100.0, 3, FestivalType.HOLI);
		System.out.println(fd.getAmount());
	}
}

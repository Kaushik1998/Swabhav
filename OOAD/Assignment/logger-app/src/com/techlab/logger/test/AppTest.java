package com.techlab.logger.test;

import com.techlab.logger.ILogType;
import com.techlab.logger.TaxCalculation;

public class AppTest {

	public static void main(String[] args) {

		TaxCalculation txc = new TaxCalculation(ILogType.xmllog);

		System.out.println(txc.calculate(10, 2));
		System.out.println(txc.calculate(0, 0));

	}

}

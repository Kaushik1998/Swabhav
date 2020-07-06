package com.techlab.src_violation.test;

import com.techlab.src_violation.Invoice;

public class InvoiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice invoice= new Invoice(1, "Kaushik", 100.0, 10.0);
		invoice.printToConsole(invoice);
	}
}

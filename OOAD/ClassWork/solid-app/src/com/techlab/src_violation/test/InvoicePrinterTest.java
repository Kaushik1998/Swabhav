package com.techlab.src_violation.test;

import com.techlab.src_violation.Invoice;
import com.techlab.src_violation.InvoicePrinter;

public class InvoicePrinterTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Invoice invoice= new Invoice(1, "Printer", 1800.0, 10.0);
		InvoicePrinter printer=new InvoicePrinter(invoice);
		printer.printToConsole(invoice);
	}

}

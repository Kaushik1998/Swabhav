package com.techlab.src_violation;

public class InvoicePrinter {
	Invoice invoice;

	public InvoicePrinter(Invoice invoice) {
		this.invoice = invoice;
	}
	
	public void printToConsole(Invoice invoice) {
		invoice.printToConsole(invoice);
	}
}

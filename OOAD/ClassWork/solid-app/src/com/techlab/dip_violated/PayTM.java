package com.techlab.dip_violated;

public class PayTM {

	private String user;

	public PayTM(String user) {
		this.user = user;
	}

	public void makePayment() {
		System.out.println( this.user+" has made a payment");
	}
}

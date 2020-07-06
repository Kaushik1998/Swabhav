package com.techlab.dip_violated;

public class PhonePe {
	String user;

	public PhonePe(String user) {
		this.user = user;
	}

	public void makePayment(int money) {
		System.out.println(this.user + " has made a payment of " + money);
	}
}

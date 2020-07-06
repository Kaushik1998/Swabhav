package com.techlab.dip_violated;

public class Store {
	
	String user;
	PayTM paytm;
	public Store(String user) {
		paytm=new PayTM(user);
	}
	
	public void makePayment() {
		paytm.makePayment();
	}
}

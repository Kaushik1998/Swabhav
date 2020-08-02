package com.techlab.automobile;

public class AutoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AutoMobileFactory am = AutoMobileFactory.getInstance();
		IAutoMobile audi = am.make(AutoType.AUDI);
		audi.start();
		audi.stop();
	}

}

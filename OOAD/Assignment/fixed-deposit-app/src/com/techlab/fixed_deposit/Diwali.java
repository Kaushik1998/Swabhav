package com.techlab.fixed_deposit;

public class Diwali implements IFestivalRate {

	private final double DIWALI_RATE = (15D / 100);

	@Override
	public double getRate() {
		// TODO Auto-generated method stub
		return DIWALI_RATE;
	}

}

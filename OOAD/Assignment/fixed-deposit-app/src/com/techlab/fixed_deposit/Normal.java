package com.techlab.fixed_deposit;

public class Normal implements IFestivalRate {
	private final double NORMAL_RATE = 5D / 100;

	@Override
	public double getRate() {
		// TODO Auto-generated method stub
		return NORMAL_RATE;
	}
}

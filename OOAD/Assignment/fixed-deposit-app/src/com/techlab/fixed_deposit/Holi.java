package com.techlab.fixed_deposit;

public class Holi implements IFestivalRate{
	private final double HOLI_RATE = 10D / 100;

	@Override
	public double getRate() {
		// TODO Auto-generated method stub
		return HOLI_RATE;
	}
}

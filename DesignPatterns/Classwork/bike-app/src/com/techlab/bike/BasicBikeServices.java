package com.techlab.bike;

public class BasicBikeServices implements IBikeServices {

	private int cost = 300;

	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Bike Services is done";
	}

	@Override
	public int getCost() {
		// TODO Auto-generated method stub
		return cost;
	}

}

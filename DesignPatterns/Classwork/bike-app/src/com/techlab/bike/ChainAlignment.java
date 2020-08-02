package com.techlab.bike;

public class ChainAlignment extends BikeServices {

	private int cost= 100;
	
	public ChainAlignment(IBikeServices ib) {
		super(ib);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDescription() {
		return super.getDescription()+ "\nChain Services is done..!";
	}
	
	@Override
	public int getCost() {
		return super.getCost()+cost;
	}

}

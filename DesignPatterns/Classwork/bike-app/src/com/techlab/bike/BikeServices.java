package com.techlab.bike;

public abstract class BikeServices implements IBikeServices {
	protected IBikeServices ib;

	public BikeServices(IBikeServices ib) {
		super();
		this.ib = ib;
	}

	public String getDescription() {
		return ib.getDescription();
	}

	public int getCost() {
		return ib.getCost();
	}
}

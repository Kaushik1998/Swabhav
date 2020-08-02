package com.techlab.bike;

public class BikeTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IBikeServices ib=new ChainAlignment(new BasicBikeServices());
		
		System.out.println(ib.getDescription());
		System.out.println(ib.getCost());
	}

}

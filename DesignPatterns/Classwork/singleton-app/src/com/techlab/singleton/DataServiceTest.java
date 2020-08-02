package com.techlab.singleton;

public class DataServiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataService s1 = DataService.getInstance();
		DataService s2 = DataService.getInstance();
		//DataService s3 = new DataService(); //error aata he 
		System.out.println(s1 == s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.processData());
		System.out.println(s2.processData());
	}

}

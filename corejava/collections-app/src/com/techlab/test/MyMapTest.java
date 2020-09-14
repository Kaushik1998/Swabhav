package com.techlab.test;

import com.techlab.map.MyMap;

public class MyMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyMap map = new MyMap();
		
		map.updateToMap(93, "Kaushik");
		map.updateToMap(99, "Paras");
		
		map.removeFromMap(99);
		
		System.out.println(map);
	}

}

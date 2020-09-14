package com.techlab.map;

import java.util.HashMap;
import java.util.Map;

public class MyMap {
	private Map<Integer, String> map;

	public MyMap() {
		super();
		// TODO Auto-generated constructor stub
		map = new HashMap<Integer, String>();
	}

	public Map<Integer, String> getMap() {
		return map;
	}
	
	public void updateToMap(int rollNo,String name) {
		map.put(rollNo, name);
	}
	
	public void removeFromMap(int rollNo) {
		if(map.containsKey(rollNo)) {
			map.remove(rollNo);
		}
	}

	@Override
	public String toString() {
		return "MyMap [map=" + map + "]";
	}

}

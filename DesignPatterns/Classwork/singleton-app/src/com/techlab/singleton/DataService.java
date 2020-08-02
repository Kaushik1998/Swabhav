package com.techlab.singleton;

public class DataService {
	private static DataService bucket;

	private DataService() {

	}

	public static DataService getInstance() {
		if (bucket == null) {
			bucket = new DataService();
		}
		return bucket;
	}

	public String processData() {
		return bucket + " is processed";
	}
}

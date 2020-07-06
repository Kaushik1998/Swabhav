package com.techlab.file;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class EmpMap implements IFilePath {
	private static Map<String, Employee> empMap = new HashMap<String, Employee>();
	private static String line = "";
	private final static String splitComma = ",";
	
	public static void createListFromFile() throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			while ((line = br.readLine()) != null) {
				String[] employee = line.split(splitComma);
				empMap.put(employee[0], new Employee(employee[0], employee[1], employee[2], employee[3], employee[4],
						employee[5], employee[6], employee[7]));
			}
		}
	}
}

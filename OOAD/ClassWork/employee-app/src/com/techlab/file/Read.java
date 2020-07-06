package com.techlab.file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Read {
	public static void main(String[] args) {
		List<String[]> empList = new ArrayList<String[]>();
		String path = "D:\\Swabhav\\OOAD\\ClassWork\\employee-app\\emp.txt";
		String line = "";
		String splitComma = ",";
		try {
			BufferedReader br = new BufferedReader(new FileReader(path));
			while ((line = br.readLine()) != null) // returns a Boolean value
			{
				String[] employee = line.split(splitComma); // use comma as separator
				empList.add(employee);
			}

			/*
			 * for (String[] s: empList) { for (String data : s) {
			 * System.out.print(data+"*"); } }
			 */
			for (String s : empList.get(0)) {
				System.out.print(s + "*");
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
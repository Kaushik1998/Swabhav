package com.techlab.fileio.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class CheckContent2 {
	String getFlag(String data) {
		String flag[] = data.split(" - ");
		return flag[1];
	}

}

public class ReadFileTest2 {

	public static void main(String[] args) {
		final String iParameter = "-i", eParameter = "-e", wParameter = "-w";
		final String iFlag = "INFO", eFlag = "ERROR", wFlag = "WARNING";
		CheckContent2 ck = new CheckContent2();
		BufferedReader reader;
		try {
			List<String> displayData = new ArrayList<String>();
			reader = new BufferedReader(new FileReader("C:\\Users\\kush\\Downloads\\db_app.log"));
			String line = reader.readLine();

			switch (args[]) {
			case iParameter:
				while (line != null) {
					if (ck.getFlag(line).equals(iFlag)) {
						displayData.add(line);
					}
					line = reader.readLine();
				}
				break;

			case eParameter:
				while (line != null) {
					if (ck.getFlag(line).equals(eFlag)) {
						displayData.add(line);
					}
					line = reader.readLine();
				}
				break;

			case wParameter:
				while (line != null) {
					if (ck.getFlag(line).equals(wFlag)) {
						displayData.add(line);
					}
					line = reader.readLine();
				}
				break;

			default:
				while (line != null) {
					// read next line
					displayData.add(line);
					line = reader.readLine();
				}
			}

			/*
			 * else if (args[0].contentEquals(iParameter)) { while (line != null) { // read
			 * next line if (ck.getFlag(line).equals(iFlag)) { displayData.add(line); } line
			 * = reader.readLine(); } }
			 */

			for (String num : displayData) {
				System.out.println(num);
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
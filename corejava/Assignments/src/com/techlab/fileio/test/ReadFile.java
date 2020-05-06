package com.techlab.fileio.test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

class CheckContent {
	String getFlag(String data) {
		String flag[] = data.split(" - ");
		return flag[1];
		// to get INFO ,ERROR , Warning flag 
		//No its PArt of checkcontent
		// i was going for modular approach
		//OK
		//Absolute 
		//Yes he will have error
		//FileNotFound
		//OK
		//I couldnt do the Case 2nd 
	}

}

public class ReadFile {

	public static void main(String[] args) {
		final String iParameter = "-i", eParameter = "-e", wParameter = "-w";
		final String iFlag = "INFO", eFlag = "ERROR", wFlag = "WARNING";
		CheckContent ck = new CheckContent();
		BufferedReader reader;
		try {
			List<String> displayData = new ArrayList<String>();
			reader = new BufferedReader(new FileReader("C:\\Users\\kush\\Downloads\\db_app.log"));
			String line = reader.readLine();
			if (args.length == 0) {
				while (line != null) {
					// read next line
					displayData.add(line);
					line = reader.readLine();
				}
			} else {
				switch (args[0]) {
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
					System.out.println("ERROR OCCURED");
					break;
				}
			}

			for (String num : displayData) {
				System.out.println(num);
			}

			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
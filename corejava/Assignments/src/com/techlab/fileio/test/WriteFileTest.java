package com.techlab.fileio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    try {
	        File myObj = new File("C:\\Users\\kush\\Downloads\\db_app2.log");
	        FileWriter myWriter = new FileWriter("D:\\Users\\kush\\Downloads\\students.csv");
	        for (int i = 0; i < 10; i++) {
	    		myWriter.write("something");
	    	}
	      } catch (IOException e) {
	        System.out.println("An error occurred.");
	        e.printStackTrace();
	      }
	}
//Yes
}

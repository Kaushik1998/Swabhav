package com.techlab.fileio.test;

import java.io.*;

public class WriteFile {
  public static void main(String[] args) {
    try {
      File myObj = new File("C:\\Users\\kush\\Downloads\\db_app2.log");
      FileWriter myWriter = new FileWriter("D:\\Users\\kush\\Downloads\\students.csv");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
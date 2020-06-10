package com.techlab.exception.test;

import java.util.Scanner;

import com.techlab.exception.CheckedException;
import com.techlab.exception.UncheckedException;

public class CheckedUncheckedTest {

	public static void main(String[] args) throws CheckedException {
		// TODO Auto-generated method stub
		System.out.println("\t1.Checked Exception \t2.Unchecked Exception");
		Scanner scanner = new Scanner(System.in);
		int choice = scanner.nextInt();
		switch(choice) {
		case 1:
			throw new CheckedException();
		case 2:
			throw new UncheckedException();
		}
	}

}

package com.techlab.account.test;
import java.text.ParseException;
import java.util.Date;

import com.techlab.account.*;
public class AccountTest {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Account ArrayOfObjects[]=new Account[3];
		ArrayOfObjects[0]=new Account("SBI0012","Kaushik",1000,"08/18/1994");
		ArrayOfObjects[1]=new Account("SBI0133","Karan",10200,"07/12/1998");
		ArrayOfObjects[2]=new Account("SBI0583","Kaustubh",1820,"05/01/1997");
		Account richestMan = null;
		double temp=ArrayOfObjects[0].getBalance();
		for(Account data:ArrayOfObjects) {
			if(data.getBalance()>temp) {
				richestMan=data;
			}
		}
		System.out.println("------Richest Man------");
		printInfo(richestMan);
		
		Account youngest=ArrayOfObjects[0];
		for(Account data:ArrayOfObjects) {
			if(data.getBirth().compareTo(youngest.getBirth())>0) {
				youngest=data;
			}
		}
		System.out.println("------Youngest Man------");
		printInfo(youngest);
	}
	
	static void printInfo(Account a) {
		System.out.println("Name : "+a.getName());
		System.out.println("Account Number : "+a.getAccNo());
		System.out.println("Balance : "+a.getBalance());
		System.out.println("BirthDate : "+a.getBirth());
		System.out.println("Creation Date : "+a.getCreated());
		System.out.println("-------------------------------------------");

	}

}

package com.techlab.account;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.*;

public class Account {
	
	private static String accNo;
	static {
		accNo= "SBI1001";
	}
	private String name;
	private double balance;
	private final LocalDate creationDate = LocalDate.now();
	private Date birthDate;
	
	public Account(String accNo,String name,double balance, String date) throws ParseException {
		Account.accNo=accNo;
		this.name=name;
		this.balance=balance;
		setDate(date);
	}
	
/*	public void setDate(String date) {
		SimpleDateFormat df = new SimpleDateFormat("MM/dd/yyyy");
		Date testDate = null;

		try{
		    testDate = df.parse(date);
		} catch (ParseException e){ System.out.println("invalid format");}
		 
 		if (!df.format(testDate).equals(date)){
		    System.out.println("invalid date!!");
		} else {
		    System.out.println("valid date");
		}

		this.birthDate=testDate;
	}
*/
	
	public void setDate(String date) throws ParseException {
		   String sDate1=date;  
		   this.birthDate=new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);  
		    
	}
	
	public String getName() {
		return name;
	}
	
	public String getAccNo() {
		return accNo;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public LocalDate getCreated() {
		return creationDate;
	}
	
	public Date getBirth() {
		return birthDate;
	}
	
}


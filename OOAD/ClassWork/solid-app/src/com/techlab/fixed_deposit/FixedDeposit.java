package com.techlab.fixed_deposit;

public class FixedDeposit {
	private int accNo;
	private String accName;
	private double amount;
	private double principle;
	private int years;
	
	public enum FestivalType {
		NORMAL, DIWALI, HOLI
	}

	private double annualInterest;
	public FestivalType festivalType;

	public FixedDeposit(int accNo, String accName, double principle, int years, FestivalType festivalType) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.principle = principle;
		this.years = years;
		this.festivalType = festivalType;
		this.annualInterest=setAnnualInterestRate();
		this.amount+=calculateSimpleInterest();

	}
	
	private double setAnnualInterestRate() {
		// TODO Auto-generated method stub
		switch (this.festivalType) {
		case HOLI:
			return (10);
		case DIWALI:
			return (15);
		case NORMAL:
			return (5);
		default:
			return (1);
		}
	}
	
	public double calculateSimpleInterest() {
		return (principle * (1 + (annualInterest/100) * years));
	}
	
	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getAmount() {
		return amount;
	}

	public double getPrinciple() {
		return principle;
	}

	public int getYears() {
		return years;
	}

}

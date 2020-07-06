package com.techlab.fixed_deposit;

public class FixedDeposit {
	private int accNo;
	private String accName;
	private double principle;
	private double amount;
	private int years;
	IFestivalRate festival;

	public FixedDeposit(int accNo, String accName, double principle, int years, IFestivalRate festival) {
		super();
		this.accNo = accNo;
		this.accName = accName;
		this.principle = principle;
		this.years = years;
		this.festival = festival;
		amount += this.principle + calculateSimpleInterest();
	}
	
	public double calculateSimpleInterest() {
		return (this.principle * festival.getRate() * this.years);
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccName() {
		return accName;
	}

	public double getPrinciple() {
		return principle;
	}

	public double getAmount() {
		return amount;
	}

	public int getYears() {
		return years;
	}

	public IFestivalRate getFestival() {
		return festival;
	}
}

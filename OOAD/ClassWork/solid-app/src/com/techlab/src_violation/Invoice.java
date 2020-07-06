package com.techlab.src_violation;

public class Invoice {
	private int no;
	private String name;
	private double amount;
	private double discountPercentage;
	private float GST ;
	
	public int getNo() {
		return no;
	}

	public String getName() {
		return name;
	}

	public double getAmount() {
		return amount;
	}

	public double getDiscountPercentage() {
		return discountPercentage;
	}

	public float getGST() {
		return GST;
	}

	public Invoice(int no, String name, double amount, double discountPercentage) {
		super();
		this.no = no;
		this.name = name;
		this.amount = amount;
		this.discountPercentage = discountPercentage;
		this.GST=calculateGST();
	}

	public float calculateGST() {
		// TODO Auto-generated method stub
		return (float) (18*(amount/100));
	}
	
	public double calculateDiscount() {
		return amount*(discountPercentage/100);
	}
	
	public double calculateTotalCost() {
		return (amount+calculateGST()-calculateDiscount());
	}
	
	public void printToConsole(Invoice invoice) {
		System.out.println("Number : " +invoice.getNo());
		System.out.println("Amount : " + invoice.getAmount());
		System.out.println("Discount Percentage : " +invoice.getDiscountPercentage());
		System.out.println("GST : " + invoice.getGST());
		System.out.println("Total : " + invoice.calculateTotalCost());
	}
	
}

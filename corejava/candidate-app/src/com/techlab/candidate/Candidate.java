package com.techlab.candidate;

public class Candidate {

	private int id = 1;
	private String name = "Kaushik";
	private int age = 21;
	private String creditPoint = "A";
	private int creditScore;
	Candidate local;

	public Candidate(int id, String name, int age, String creditPoint) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.creditPoint = creditPoint;
		setCreditScore(creditPoint);
	}

	public void setID(int data) {
		id = data;
	}

	public void setName(String data) {
		name = data;
	}

	public void setAge(int data) {
		age = data;
	}

	public void setCredit(String data) {
		creditPoint = data;
		setCreditScore(data);
	}

	void setCreditScore(String data) {
		if (data.contentEquals("A")) {
			creditScore = 100;
		} else if (data.contentEquals("B")) {
			creditScore = 80;
		}else if (data.contentEquals("C")) {
			creditScore = 60;
		}else if (data.contentEquals("D")) {
			creditScore = 40;
		}
		
	}

	int getCreditScore() {
		return creditScore;
	}

	public int getID() {
		return id;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getCredit() {
		return creditPoint;
	}

	public void whoIsOlder(Candidate c) {
		if (c.age > local.age) {
			local = c;
		}
	}

	public void whoIsBetter(Candidate c) {
		if (c.creditScore > local.creditScore) {
			local = c;
		}
	}

	public void setLocal(Candidate c) {
		this.local = c;
	}

	public Candidate getLocal() {
		return local;
	}

}

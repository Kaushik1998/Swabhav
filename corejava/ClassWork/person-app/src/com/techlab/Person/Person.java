package com.techlab.Person;

import java.lang.Math;

public class Person {
	private String name;
	private String gender;
	private float height;
	private float weight;
	private int age;
	private int DEFAULT_AGE=25;
	
	private final String NORMAL = "Normal";
	private final String OBESE = "Obese";
	private final String UNDERWEIGHT = "Underweight";
	private final String OVERWEIGHT = "Overweight";
	private String weightStatus;

	public Person(String name, String gender, float height, float weight) {
		setName(name);
		setGender(gender);
		setHeight(height);
		setWeight(weight);
		age = DEFAULT_AGE;
	}

	public Person(String name, String gender, float height, float weight, int age) {
		this(name, gender, height, weight);
		setAge(age);
	}

	public String getName() {
		return name;
	}

	public String getGender() {
		return gender;
	}

	public float getHeight() {
		return height;
	}

	public float getWeight() {
		return weight;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = Math.abs(age);
	}

	public void setName(String name) {
		if (name.isEmpty() || name.contentEquals("null")) {
			this.name = "unspecified";
		} else {
			this.name = name;
		}
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void doWorkOut() {
		float weightLoss = (weight / 100) * 20;
		weight -= weightLoss;
	}

	public void doEat() {
		float weightGain = (weight / 100) * 5;
		weight += weightGain;
	}
	
	public String getBMI() {
		float numerator = getWeight();
		float denominator = getHeight()*getHeight();
		float bmi = numerator/denominator;
		if(bmi<18.5) {
			weightStatus=UNDERWEIGHT;
		}
		else if(bmi<25) {
			weightStatus=NORMAL;
		}
		else if(bmi<30) {
			weightStatus=OVERWEIGHT;
		}
		else if(bmi>30) {
			weightStatus=OBESE;
		}
		return weightStatus;
	}

}

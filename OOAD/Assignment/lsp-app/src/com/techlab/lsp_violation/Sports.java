package com.techlab.lsp_violation;

public class Sports implements Athlete {

	private String name;
	private String sport;
	private String gender;

	public String getName() {
		return name;
	}

	public String getSport() {
		return sport;
	}

	public String getGender() {
		return gender;
	}

	public Sports(String name, String sport, String gender) {
		super();
		this.name = name;
		this.sport = sport;
		this.gender = gender;
	}

	@Override
	public void compete() {
		// TODO Auto-generated method stub
		System.out.println(this.name + " is competing");
	}

	@Override
	public void swim() {
		// TODO Auto-generated method stub
		if (this.sport.equals("swimmer")) {
			System.out.println(this.name + " is swimming");
		} else {
			return;
		}
	}

	@Override
	public void highJump() {
		// TODO Auto-generated method stub
		if (this.sport.equals("high jumper")) {
			System.out.println(this.name + " has jumped high ");
		} else {
			return;
		}
	}

	@Override
	public void longJump() {
		// TODO Auto-generated method stub
		if (this.sport.equals("long jump")) {
			System.out.println(this.name + " has jumped long");
		} else {
			return;
		}
	}

}

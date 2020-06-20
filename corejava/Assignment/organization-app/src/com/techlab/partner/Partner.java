package com.techlab.partner;

import java.util.ArrayList;

import com.techlab.talent.Talent;

public class Partner {
	private int partnerID;
	private String partnerName;
	private double companyTurnOver;
	private int employeeStrength;
	private ArrayList<Talent> talentList = new ArrayList<Talent>();

	/**
	 * @param partnerID
	 * @param partnerName
	 */
	public Partner(int partnerID, String partnerName) {
		this.partnerID = partnerID;
		this.partnerName = partnerName;
	}
	
	@Override
	public String toString() {
		StringBuilder talentNames = new StringBuilder();
		for (Talent t : talentList) {
			talentNames.append(t.getTalentName());
			talentNames.append("\t");
		}
		return "Partner [partnerID=" + partnerID + ", partnerName=" + partnerName + ", talents= " + talentNames
				+ ", companyTurnOver=" + companyTurnOver + ", employeeStrength=" + employeeStrength + "]";
	}

	public int getPartnerID() {
		return partnerID;
	}

	public String getPartnerName() {
		return partnerName;
	}

	public double getCompanyTurnOver() {
		return companyTurnOver;
	}

	public int getEmployeeStrength() {
		return employeeStrength;
	}

	public ArrayList<Talent> getTalentList() {
		return talentList;
	}

	public void setCompanyTurnOver(double companyTurnOver) {
		this.companyTurnOver = companyTurnOver;
	}

	public void updateTalentList() {
		employeeStrength = talentList.size();
	}

	public void addTalent(Talent t) {
		talentList.add(t);
		updateTalentList();
		t.setTalentPartner(getPartnerName());
	}
}

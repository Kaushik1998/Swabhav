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

	public void setPartnerID(int partnerID) {
		this.partnerID = partnerID;
	}

	public void setPartnerName(String partnerName) {
		this.partnerName = partnerName;
	}

	public void setCompanyTurnOver(double companyTurnOver) {
		this.companyTurnOver = companyTurnOver;
	}

	public void setEmployeeStrength(int employeeStrength) {
		this.employeeStrength = employeeStrength;
	}

	public void setTalentList(ArrayList<Talent> talentList) {
		this.talentList = talentList;
	}
	
	public void updateTalentList() {
		employeeStrength=talentList.size();
	}
	
	public void addTalent(Talent t) {
		talentList.add(t);
		updateTalentList();
		t.setTalentPartner(getPartnerName());
	}

	@Override
	public String toString() {
		return "Partner [partnerID=" + partnerID + ", partnerName=" + partnerName + ", companyTurnOver="
				+ companyTurnOver + ", employeeStrength=" + employeeStrength + "]";
	}
}

package com.techlab.organization;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.techlab.partner.Partner;
import com.techlab.talent.Talent;

public class Organization {
	private int organizationID;
	private String organizationName;
	private Date registeredDate;
	private ArrayList<Talent> talentList = new ArrayList<Talent>();
	private ArrayList<Partner> partnerList = new ArrayList<Partner>();

	/**
	 * @param id
	 * @param name
	 * @param register
	 * @throws ParseException
	 */
	public Organization(int id, String name, String register) throws ParseException {
		this.organizationID = id;
		this.organizationName = name;
		this.registeredDate = new SimpleDateFormat("dd/MM/yyyy").parse(register);
	}

	@Override
	public String toString() {
		StringBuilder talentNames = new StringBuilder();
		for (Talent t : talentList) {
			talentNames.append(t.getTalentName());
			talentNames.append("\t");
		}
		StringBuilder partnerNames = new StringBuilder();
		for (Partner t : partnerList) {
			partnerNames.append(t.getPartnerName());
			partnerNames.append("\t");
		}

		return "Organization [id=" + organizationID + ", name=" + organizationName + ", register=" + registeredDate
				+ ", talents= " + talentNames + ", partners= " + partnerNames + "]";
	}

	public int getId() {
		return organizationID;
	}

	public String getName() {
		return organizationName;
	}

	public ArrayList<Partner> getPartner() {
		return partnerList;
	}

	public Date getRegister() {
		return registeredDate;
	}

	public void setRegister(Date register) {
		this.registeredDate = register;
	}

	public void setId(int id) {
		this.organizationID = id;
	}

	public void setName(String name) {
		this.organizationName = name;
	}

	public void setPartner(ArrayList<Partner> partner) {
		this.partnerList = partner;
	}

	public void addTalent(Talent t) {
		talentList.add(t);
	}

	public void addPartner(Partner p) {
		partnerList.add(p);
	}

	public int getPartnerCount() {
		return partnerList.size();
	}
}

package com.techlab.talent;

public class Talent {
	private int talentId;
	private String talentName;
	private String talentPartner;

	/**
	 * @param talentId
	 * @param talentName
	 */
	public Talent(int talentId, String talentName) {
		this.talentId = talentId;
		this.talentName = talentName;
	}

	@Override
	public String toString() {
		return "Talent [\\ttalentId=" + talentId + ",\\ttalentName=" + talentName + ",\\ttalentPartner=" + talentPartner
				+ "\\t]";
	}

	public int getTalentId() {
		return talentId;
	}

	public String getTalentName() {
		return talentName;
	}

	public String getTalentPartner() {
		return talentPartner;
	}

	public void setTalentPartner(String talentPartner) {
		this.talentPartner = talentPartner;
	}
}

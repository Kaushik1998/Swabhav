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

	public int getTalenrId() {
		return talentId;
	}

	public String getTalentName() {
		return talentName;
	}

	public String getTalentPartner() {
		return talentPartner;
	}

	public void setTalenrId(int talenrId) {
		this.talentId = talenrId;
	}

	public void setTalentName(String talentName) {
		this.talentName = talentName;
	}

	public void setTalentPartner(String talentPartner) {
		this.talentPartner = talentPartner;
	}
}

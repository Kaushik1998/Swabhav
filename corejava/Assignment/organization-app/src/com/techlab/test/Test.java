package com.techlab.test;


import java.text.ParseException;
import com.techlab.organization.Organization;
import com.techlab.partner.Partner;
import com.techlab.talent.Talent;

public class Test {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		Organization swabhav =new Organization(8, "Swabhav", "15/05/1998");
		Partner nexsales=new Partner(1, "Nexsales");
		nexsales.setCompanyTurnOver(100000);
		Talent kaushik=new Talent(93, "Kaushik");
		Talent paras=new Talent(95, "Paras");

		swabhav.addPartner(nexsales);
		
		swabhav.addTalent(kaushik);
		swabhav.addTalent(paras);
		nexsales.addTalent(kaushik);
		
		System.out.println(swabhav);
		System.out.println(nexsales);
	}

}

package com.techlab.demo;

class SplitIt{
	String data[];
	String url;
	
	public String getCompany(String url) {
		this.url=url;
		data=url.split("\\@");
		String temp = data[1];
		String data2[]=temp.split("\\?");
		if (data2[0].length()==0) {
			return "Null";
		}
		else {
			return data2[0];
		}
	}
	
	public String getOrigin(String url) {
		this.url=url;
		data=url.split("\\.");
		if (data[1].length()==0) {
			return "Null";
		}
		else {
			return data[1];
		}
	}
	
	public String getTraining(String url) {
		this.url=url;
		data=url.split("\\=");
		if (url.indexOf("=")==url.length()-1) {
			return "Null";
		}
		else {
			return data[1];
		}
	}
}

public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = " www.techlab.com@swabhavtechlabs?training=Java";
		SplitIt s =new SplitIt();
		System.out.println(s.getCompany(url));
		System.out.println(s.getOrigin(url));
		System.out.println(s.getTraining(url));
	}

}

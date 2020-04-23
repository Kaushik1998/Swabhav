package com.techlab.game;

class SplitTest{
	String url;
	String data[];
	String getDomain(String url) {
		this.url=url;
		data=url.split("\\.");
		if (data[1].length()==0)
		{
		return "NULL";
		}
		else
		{
		return data[1];
		}
	}
	
	String getDeveloper(String url) {
		this.url=url;
		data=url.split("\\=");
		if (url.indexOf("=")==url.length()-1)
		{
		return "NULL";
		}
		else
		{
		return data[1];
		}
	}	
}


class SubstringTest{
	String url;
	String domain;
	String developer;
	
	String getDomain(String url){
		this.url=url;

		int startIndex = url.indexOf("www.")+4;
        int endIndex = url.indexOf(".com");
        domain = url.substring(startIndex,endIndex);
        if(domain.length()==0)
        {
        	return "NULL";
        }
        else
        {
        	return domain;
        }
	}
	
	String getDeveloper(String url){
		this.url=url;
		int startIndex = url.indexOf("=")+1;
        int endIndex = url.length();
        developer = url.substring(startIndex,endIndex);
        if(developer.length()==0)
        {
        	return "NULL";
        }
        else
        {
        	return developer;
        }
	}
}
class Url{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		*/ 
		String url = "https://www.google.com?developer=";
		String domain[];
		domain=url.split("\\.");	
		System.out.println("SplitTest");
		System.out.println("----------------------------------------------");
		SplitTest spl=new SplitTest();
		System.out.println("Domain is " + spl.getDomain(url));
		System.out.println("----------------------------------------------");		
		System.out.println("Developer is " + spl.getDeveloper(url));
		System.out.println("----------------------------------------------");	
		System.out.println("SubstringTest");
		SubstringTest sbt = new SubstringTest();
		System.out.println("----------------------------------------------");
		System.out.println("Domain is " + sbt.getDomain(url));
		System.out.println("----------------------------------------------");		
		System.out.println("Developer is " + sbt.getDeveloper(url));
		
	}

}

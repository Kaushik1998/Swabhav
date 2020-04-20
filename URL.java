class SplitTest{
	String url;
	String domain[];
	String getDomain(String url) {
		this.url=url;
		domain=url.split("\\.");
		if (domain[1].length()==0)
		{
		return "NULL";
		}
		else
		{
		return domain[1];
		}
	}
	
	String getDeveloper(String url) {
		this.url=url;
		domain=url.split("\\=");
		if (domain[1].length()==0)
		{
		return "NULL";
		}
		else
		{
		return domain[1];
		}
	}	
}


class SubstringTest{
	String url;
	String domain[];
	
	String getDomain(String url){
		this.url=url;
		int startIndex = url.indexOf("www.")+4;
        int endIndex = url.indexOf(".com");
        return url.substring(startIndex,endIndex);
	}
	
	String getDeveloper(String url){
		this.url=url;
		int startIndex = url.indexOf("=")+1;
        int endIndex = url.length();
        return url.substring(startIndex,endIndex);
	}
}
class Url{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://www.swabhavtechlabs.com?developer=Kaushik";
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
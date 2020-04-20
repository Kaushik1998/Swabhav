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
}

class Url{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url = "https://www..com?developer=Kaushik";
		String domain[];
		domain=url.split("\\.");	
		System.out.println("----------------------------------------------");
		SplitTest spl=new SplitTest();
		System.out.println("Domain is " + spl.getDomain(url));
		

	}

}
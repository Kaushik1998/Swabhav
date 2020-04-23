class Overloaded{
    public void println(boolean data) {
        System.out.println(data);
    }
 public void println(char data) {
        System.out.println( data);
    }

public void println(int data) {
    System.out.println(data);
}

public void println(long data) {
    System.out.println(data);
}

public void println(float data) {
    System.out.println(data);
}

public void println(double data) {
    System.out.println(data);
}

public void println(char data[]) {
    System.out.println(data);
}

public void println(String data) {
    System.out.println(data);
}
}

public class PrintOverload {
    public static void main(String arf[]) {
        boolean a = true;
        char b = 'b' ;
		int c = 123; 
		long d = 456 ;
		float e =3.14f ;
		double f = 65.55; 
		char g[] = {'k','a','u','s','h','i','k'} ; 
        String h = "Kaushik Nippanikar" ;
        
        Overloaded o = new Overloaded();
        o.println(a);
        o.println(b);
        o.println(c);
        o.println(d);
        o.println(e);
        o.println(f);
        o.println(g);
        o.println(h);

    }
}
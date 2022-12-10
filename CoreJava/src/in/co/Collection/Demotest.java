package in.co.Collection;

public class Demotest {
public static void main(String[] args) {
	Demo d = new Demo("RJ", "Kartik",123);
	Demo d1 = new Demo("Rj","Raunak",345);
	
	String first = d.firstname();
	System.out.println(first);
	
	String first1 = d1.firstname();
	System.out.println(first1);
	
	String second = d.lastname();
	System.out.println(second);
	
	String second1 = d1.lastname();
	System.out.println(second1);
}
}

package in.co.Stringpractice;

public class swap2 {
public static void main(String[] args) {
	int a =30, b=40;
	System.out.println("Value of a before swapping:"+a);
	System.out.println("Value of b before swapping"+b);
	
	a=a+b;
	b=a-b;
	a=a-b;
	System.out.println("Value of a after swapping:"+a);
	System.out.println("Value of b after swapping:"+b);
}
}

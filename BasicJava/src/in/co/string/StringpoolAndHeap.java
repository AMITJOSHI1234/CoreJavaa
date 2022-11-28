package in.co.string;

public class StringpoolAndHeap {
public static void main(String[] args) {
	// String pool
	System.out.println("String pool");
	
	String s1 = "Ram";
	String s2 = "Ram";
	
	boolean result1 = (s1==s2);//refer
	System.out.println(result1);
	
	boolean result2 = (s1.equals(s2));
	System.out.println(result2);
	
	System.out.println("-------------------------------------------");
	
	System.out.println("String heap memory");
	
	String s3 = new String("Ram");
	String s4 = new String("Ram");
	
	boolean result3 = (s3==s4);
	System.out.println(result3);
	
	boolean result4 = (s3.equals(s4));
	System.out.println(result4);
}
}

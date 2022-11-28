package in.co.string;

public class StringLiteralPool {
public static void main(String[] args) {
	String s1 = "Ram";
	String s2 = "Ram";
	
	boolean result = (s1==s2);
	System.out.println(result);
	
	boolean result1 = (s1.equals(s2));
	System.out.println(result1);
}
}

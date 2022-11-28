package in.co.string;

public class Stringheap {
public static void main(String[] args) {
	String s1 = new String("Ram");
	String s2 = new String("Ram");
	
	boolean result1 = (s1==s2);
	System.out.println(result1);
	
	boolean result2 = (s1.equals(s2));
	System.out.println(result2);
}
}

package in.co.Stringpractice;

public class task1 {
public static void main(String[] args) {
	String s1 = "amit";
	char s2[]=new char[s1.length()];
	for(int i=3;i>=0;i--) {
		s2[i] =s1.charAt(i);
		System.out.print(s2[i]);
	}	
	System.out.println();
	
	String s3 ="amit joshi";
	
//	String s4 = s3.substring(5);
//	System.out.println(s4);
	
//	for(int i =s4.length()-1;i>=0;i--) {
//		System.out.print(s4.charAt(i));
//	}
	
	for(int i = s3.length()-1;i>=0;i--) {
		System.out.print(s3.charAt(i));
	}	
}
}

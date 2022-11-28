package in.co.JavaPractice;

public class StringToInteger1 {
public static void main(String[] args) {
	String s1 = "He got 70 marks in exam";
	
	//int num  = Integer.parseInt(s1, 6);
	//System.out.println(num);
	
	String s3 = s1.substring(7, 9);
	
	String s2 = "70";
	int num1 = Integer.parseInt(s2);
	System.out.println(num1);
	
	int num2 = Integer.parseInt(s3);
	System.out.println(num2);
	
	double num3 = (double)num2; //typecasting
	System.out.println(num3);
}
}

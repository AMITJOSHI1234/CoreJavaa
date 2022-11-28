package in.co.JavaBasics;

public class TypeCasting {
public static void main(String[] args) {
	// explicit
 double a = 22.22;
 int b = (int)a;
 System.out.println(b);
 
 //IncrementDecrement
 
 int a1 = 10;
 int b1 = 20;
 System.out.println("Before increment:"+a1);
 System.out.println("After increment:"+(++a1));//pre increment
 
 System.out.println("Before increment:"+b1);
 System.out.println(b1++); // post increment
 System.out.println("After increment:"+b1);
 
 int i=0;
 System.out.println(i++ + i++ + i++ + i++ + i++);
 
 int i1=0;
 System.out.println(++i1 + i1++ + ++i1);
 
 //ternary operator
 
 int num1=10;
 int num2=20;
 
 int c = (num1>num2)?num1:num2;
 System.out.println(c);
 
 //if else and logical operator
 
 int Studentmarks = 25;
 
 if(Studentmarks>=75 && Studentmarks<=100) {
	 System.out.println("Grade A");
 }else if(Studentmarks>=55 && Studentmarks<75) {
	 System.out.println("Grade B");
 } else if(Studentmarks>=35 && Studentmarks<55) {
	 System.out.println("Grade C");
 }else if(Studentmarks>20 && Studentmarks<35) {
	 System.out.println("Grade D(Fail)");
 }else {
	 System.out.println("Call your Father!!!");
 }
}
}


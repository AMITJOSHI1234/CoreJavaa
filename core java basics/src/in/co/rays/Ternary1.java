package in.co.rays;

public class Ternary1 {
 public static void main(String args[]) {
	 int age =20;
//	 if(age>=18) {
//		 System.out.println("Eligible for vote!!!");
//	 } else {
//		 System.out.println("Not eligible for vote!!!!");
//	 }
	 
	 int vote = (age>=18)?age:0;
	 
	 System.out.println("You are eligible for vote.Your age is:"+vote);
 }
}

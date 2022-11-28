package in.co.Polymorphism;

public class ChildOverriding extends ParentOverriding {
 public void sum() {
	 int a =20;
	 int b=30;
	 
	 int sum = a+b;
	 System.out.println("Sum of two numbers is:"+sum);
	 
	 super.sum();
 }
}

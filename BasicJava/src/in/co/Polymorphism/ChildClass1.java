package in.co.Polymorphism;

public class ChildClass1 extends ParentClass1 {
public void sum() {
	int a = 30;
	int b = 40;
	
	int sum = a+b;
	System.out.println("Sum of two numbers:"+sum);
	
	super.sum();
}
}

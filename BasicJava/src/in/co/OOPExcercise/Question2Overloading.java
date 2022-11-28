package in.co.OOPExcercise;

public class Question2Overloading {
public static void main(String[] args) {
	Question2Overloading o =new Question2Overloading();
	o.sum();
	o.sum(30);
	o.sum(50, 50);
}

public void sum() {
	int a =10;
	int b =20;
	
	System.out.println("Sum of two numbers is:"+(a+b));
}

public void sum(int a) {
	int b =20;
	int c = a+b;
	System.out.println("Sum of 2 numbers is:"+c);
}

public void sum(int a , int b) {
	int c =a+b;
	System.out.println("Sum of two numbers is:"+c);
}
}

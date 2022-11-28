package in.co.rays;

public class increment {
 public static void main(String args[])
 {
	 int a = 10;
	 //pre increment
	 System.out.println("Before pre increment :"+a);
	 System.out.println("After pre increment:"+(++a));
	 
	 //post increment
	 int b=10;
	 System.out.println("Before post increment:"+b);
	 System.out.println("After post increment:"+b++);
	 System.out.println("Value of b:"+b);
 }
}

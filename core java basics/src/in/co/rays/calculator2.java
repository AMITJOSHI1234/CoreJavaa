package in.co.rays;

public class calculator2 {
 public static void main(String args[]) {
	 char op = '-';
	 double a = 50;
	 double b = 30;
	 
	 switch(op) {
	 case '+': {
		 double c = a+b;
		 System.out.println("Addition :"+c);
		 break;
	 }
	 
	 case '-': {
		 if(a>b) {
			 double c =a-b;
			 System.out.println("Subtraction:"+c);
		 } else {
			 double c = b-a;
			 System.out.println("Subtraction:"+c);
		 }
		 break;
		 }
	 
	 case '*' : {
		 double c = a*b;
		 System.out.println("Multiplication:"+c);
		 break;
	 }
	 
	 case '/':{
		 if(a>b) {
		 double c = a/b;
		 System.out.println("Division:"+c);
	 } else {
		 double c = b/a;
		 System.out.println("Division:"+c); 
	 }
		 break;
	 }
	 default:{
		 System.out.println("Invalid choice");
	 }
	 }
 }
}

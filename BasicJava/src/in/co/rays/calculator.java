package in.co.rays;

public class calculator {
   public static void main(String args[]) {
	   int a = 50;
	   int b = 30;
	   char op = '/';
	   if(op == '+') {
		   int c = a+b;
		   System.out.println("Addition:"+c);
	   } else if(op == '-') {
		   if(a>b) {
			   double c = a-b;
			   System.out.println("Subtraction:"+c);
		   } else {
			   int c = b-a;
			   System.out.println("Subtraction:"+c);
		   }
	   } else if(op =='*') {
		   int c = a*b;
		   System.out.println("Multiplication:"+c);
	   } else if(op == '/') {
		   if(a>b) {
			   float c = a/b;
			   System.out.println("Division:"+c);
		   } else {
			   float c = b/a;
			   System.out.println("Division:"+c);
		   }
	   } else {
		   System.out.println("Error!!!");
	   }
   }
}

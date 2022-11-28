package in.co.rays;

public class Conditional {
   public static void main(String args[]) {
	   int a=1;
	   System.out.println("Value of a:"+a);
		if(a>10) {
			System.out.println("Pre increment:"+(++a));
		}
				else if(a==10) {
			System.out.println("Pre decrement:"+(--a));
		}
				else {
					System.out.println("System working ok!!!!");
				}
   }
}

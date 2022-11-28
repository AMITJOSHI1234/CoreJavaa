package in.co.ExceptionalHandeling;

public class basicQustion2 {
public static void main(String[] args) {
	int a = 10;
	int b =20;
	int c  = 30;
	
	try {
	if(a<b && a<c) {
		System.out.println("a is smaller");
	}else if(b<c){
		System.out.println("b is smaller");
	}else {
		System.out.println("C is smaller");
	}
	}
	catch (Exception e) {
		// TODO: handle exception
		System.out.println("Your program has an exception");
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
}
}

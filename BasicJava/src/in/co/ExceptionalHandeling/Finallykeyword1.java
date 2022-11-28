package in.co.ExceptionalHandeling;

public class Finallykeyword1 {
public static void main(String[] args) {
	int a = 10;
	int b = 0;
	
	try {
		int div = a/b;
		System.out.println(div);
	} catch (Exception e) {
		System.out.println("Exception handeled");
		System.exit(0);
	}
	
	finally {
		System.out.println("Hello world");
	}
}
}

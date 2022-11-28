package in.co.ExceptionalHandeling;

public class basicQuestion7 {
public static void main(String[] args) {
	int sum = 0;
	try {
		for(int i = 101 ; i<=200 ; i++) {
			if(i % 7 ==0) {
				sum = sum+ i;
			}
		}
		System.out.println(sum);
	}catch (Exception e) {
		// TODO: handle exception
		System.out.println("Your program has Exception");
	}
	
	finally {
		System.out.println("OK!!");
	}
}
}

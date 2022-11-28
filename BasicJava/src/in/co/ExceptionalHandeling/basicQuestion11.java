package in.co.ExceptionalHandeling;

public class basicQuestion11 {
public static void main(String[] args) {
	int num = 14;
	int c =num/2;
	int count =0;
	try {
		for(int i =2;i<c ; i++) {
			if(num%i==0) {
				count++;
			}
		}
			if(count == 0) {
				System.out.println("number is prime");
			}else {
				System.out.println("Number is not prime");
			}
	} catch (Exception e) {
		// TODO: handle exception
	}
}
}

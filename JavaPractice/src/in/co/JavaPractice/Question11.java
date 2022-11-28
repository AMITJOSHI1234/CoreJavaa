package in.co.JavaPractice;

public class Question11 {
public static void main(String[] args) {
	prime p =new prime();
	p.pri(8);
}
}

class prime {
	public void pri(int num) {
		int c = num/2;
		int count =0;
		for(int i=2;i<c;i++) {
			if(num%i == 0) {
				count++;
			}
		}
			
			if(count == 0) {
				System.out.println("Number is  prime");
			}else {
				System.out.println("Number is not prime");
				
			}
		}
}

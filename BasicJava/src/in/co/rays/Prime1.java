package in.co.rays;

public class Prime1 {
public static void main(String[] args) {
	int num = 25, count = 0 ,m;
	m=num/2;
	for(int i=2;i<=m;i++) {
		if(num%i==0) {
			count++;
			break;
		} else {
	}
}
	if(count == 0) {
		System.out.println("Number is prime");
	} else
		System.out.println("Number is not prime");
	
}
}

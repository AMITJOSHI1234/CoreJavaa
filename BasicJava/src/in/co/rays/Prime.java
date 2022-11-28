package in.co.rays;

public class Prime {
public static void main(String[] args) {
	int num=25,count=0;
	int m=0;
	m=num/2;
	
	for(int i=2 ; i<=m ; i++) {
		if(num%i==0)
		{
	       count++;
	       break;
		} else {
			
		}
	}
	if(count==0) {
		System.out.println("Num is prime");
	} else {
		System.out.println("Number is not  prime");
	}
}
}

package in.co.rays;

public class Question14 {
public static void main(String[] args) {
	int sum=0,sum1=0;
	double average = 0,average1=0,average2=0;
	for(int i=1 ; i<=10 ; i++)
	{
		if(i%2!=0) {
			sum=sum+i;
			average = sum/10;
		} else {
		   sum1 = sum1+i;
		   average1 = sum1/10;
		}
		
	}
	
	System.out.println("Average of N odd numbers is:"+average);
	System.out.println("Average of N even numbers is:"+average1);
	average2 = (average1 + average)/10;
	System.out.println("Total Average:"+average2);
}
}

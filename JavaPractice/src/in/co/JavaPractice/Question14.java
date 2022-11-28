package in.co.JavaPractice;

public class Question14 {
public static void main(String[] args) {
average.aj();
}
}

class average{
	public static void aj() {
		double ev =0.0;
		double od =0.0;
		int sum1=0;
		int sum2 =0;
		for(int i =1;i<=100;i++) {
			if(i%2==0) {
				sum1 =sum1+i;
				ev = sum1/50;
			}else {
				od = i/50;
				sum2 = sum2+i;
				od = sum2/50;
			}
		}
		
		System.out.println("Average of even number:"+ev);
		System.out.println("Average of odd number:"+od);
		
		double average = (ev + od)/2;
		System.out.println("Average:"+average);
	}
}

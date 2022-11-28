package in.co.rays;
public class minor1 {
	public static void main(String[] args) {
		int check =0 ;
		
		for(int i =100; i<=200; i++)
		{
			while(i!=0) {
				int digit = i%10;
				check = digit * digit *digit + check;
				i=i/10;
			}
			
		}
		System.out.println(check);
	}

}

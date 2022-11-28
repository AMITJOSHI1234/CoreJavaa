package in.co.ExceptionalHandeling;

public class basicQuestion16 {
public static void main(String[] args) {
	int arr[] = {2,1,9,10,3};
	int second = 0;
	
	try {
		for(int i =0 ; i<arr.length ; i++) {
			for(int j=0 ; j<=i ; j++) {
				if(arr[i]<arr[j]) {
					int c = arr[i];
					arr[i] = arr[j];
					arr[j] = c;
				}
			}
		}
		
		for(int i =0 ;i<arr.length ; i++) {
			System.out.println(arr[i]);
		   second = arr[arr.length -2];
		}
		System.out.println(second);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}

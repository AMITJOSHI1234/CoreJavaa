package in.co.ExceptionalHandeling;

public class BasicQuestion15 {
public static void main(String[] args) {
	int arr[] = {1,2,3,9,5};
	int max = arr[0];
	
	try {
		for(int i =0 ; i<=arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Max element in array is:"+max);
	} catch (Exception e) {
		System.out.println("Your program have exception");
		System.out.println(e.getMessage());
	}
}
}

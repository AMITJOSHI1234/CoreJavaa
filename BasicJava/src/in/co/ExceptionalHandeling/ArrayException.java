package in.co.ExceptionalHandeling;

public class ArrayException {
public static void main(String[] args) {
	int arr[] = {1,2,3,4};
	
	try {
		for(int i =0 ;i<=arr.length;i++) {
			System.out.println(arr[i]);
		}
	}catch (Exception e) {
		System.out.println("Array out of bound");
		e.printStackTrace();
		System.out.println(e.getMessage());
	}
}
}

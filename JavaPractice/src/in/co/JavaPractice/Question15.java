package in.co.JavaPractice;

public class Question15 {
public static void main(String[] args) {
	MaxArray.arr();
}
}

class MaxArray {
	public static void arr() {
		int arr[] = {10,12,5,9,4};
		int max = arr[0];
		
		for(int i =0 ;i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		System.out.println("Maximum element in array is:"+max);
	}
}

package in.co.Arrays;

public class LargestnumInArray {
public static void main(String[] args) {
	int arr[] = {10,5,200,250,150};
	int max = arr[0];
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max = arr[i];
		}
	}
	  System.out.println("Largest number in array is:"+max);
}
}

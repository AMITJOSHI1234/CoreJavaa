package in.co.Arrays;

public class SecondLargestelement {
public static void main(String[] args) {
	int arr1[] = {1,5,9,11,2,14};
	int max = arr1[0];
	int secondmax = arr1[0];
	
	for(int i =0;i<arr1.length;i++) {
		if(arr1[i]>max) {
			max = arr1[i];
		}
		 	if(max>secondmax && arr1[i]!=max) {
			secondmax = arr1[i];
	}
	}
	System.out.println("Max:"+max);
	System.out.println("SecondMax:"+secondmax);
}
}

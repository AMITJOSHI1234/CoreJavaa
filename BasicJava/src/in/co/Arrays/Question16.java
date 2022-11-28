package in.co.Arrays;

public class Question16 {
public static void main(String[] args) {
	int arr1[]= {1,2,4,3};
	int arr2[]= {1,2,4};
	
	for(int i=0 ; i<arr1.length;i++) {
		int count =0;	
		for(int j=0;j<arr2.length;j++) {
			if(arr1[i]==arr2[j]) {
				count++;
			}
		}
		if(count ==0) {
			System.out.println("Missing element is:"+arr1[i]);
		}
	}
	
}
}

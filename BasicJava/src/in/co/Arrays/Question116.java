package in.co.Arrays;

public class Question116 {
 public static void main(String[] args) {
	int arr1[] = {5,6,7,50};
	int arr2[] = {5,6,7};
	
	for(int i =0;i<arr1.length;i++) {
		boolean pass = true;
		for(int j=0;j<arr2.length;j++) {
			if(arr1[i]==arr2[j]) {
				pass = false;
			}
		}
		
		if(pass) {
			System.out.println(arr1[i]);
		}
	}
 }
}
	
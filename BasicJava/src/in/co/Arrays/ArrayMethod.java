package in.co.Arrays;

public class ArrayMethod {
public static void main(String[] args) {
	int arr[] = {1,2,3,4};
	
	arr(arr);
}

public static void arr(int arr1[]) {
  for(int i : arr1) {
	  System.out.println(i);
  }
}
}

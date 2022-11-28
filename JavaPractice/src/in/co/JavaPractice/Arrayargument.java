package in.co.JavaPractice;

public class Arrayargument {
public static void main(String[] args) {
	int arr [] = {1,2,3,4,5};
	Arrayargument ar = new Arrayargument();
	ar.arr1(arr);
	
}

public void arr1(int[] arr) {
for(int i=0 ; i<arr.length;i++) {
	System.out.println(arr[i]);
}
}
}

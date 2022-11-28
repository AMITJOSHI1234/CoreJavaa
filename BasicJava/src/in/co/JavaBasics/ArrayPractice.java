package in.co.JavaBasics;

public class ArrayPractice {
public static void main(String[] args) {
	int arr[] = {10,20,30,40};
	int sum=0;
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
		sum = sum+arr[i];
	}
	System.out.println("Sum of array is:"+sum);
	
	//2d array
	int arr1[][] = {{1,2} , {3,4}};
	
	for(int i =0;i<arr1.length;i++) {
		for(int j=0;j<arr1.length;j++) {
			System.out.print(" "+arr1[i][j]);
		}
		System.out.println();
	}
	
	//Array copy
	
	char CopyFrom [] = {'S','u','n','r','a','y','s'};
	char CopyTo[] = new char[4];
	
	System.arraycopy(CopyFrom, 3, CopyTo, 0, 4);
	for(char c : CopyTo) {
		System.out.println(c);
	}
	
} 
}

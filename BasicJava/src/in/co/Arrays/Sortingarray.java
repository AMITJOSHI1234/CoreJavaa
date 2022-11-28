package in.co.Arrays;

public class Sortingarray {
public static void main(String[] args) {
	int arr1[] = {1,5,3,4,2};
	int secondMax=0;
	
    for(int i=0;i<arr1.length;i++)
    {
    	for(int j=i+1;j<arr1.length;j++) {
    		if(arr1[j]<arr1[i]) {
    			int c = arr1[i];
    			 arr1[i] = arr1[j];
    			 arr1[j] = c;
    		}
    	}
    }
    for(int i=0;i<arr1.length;i++) {
    	System.out.println(arr1[i]);
    	secondMax = arr1[3];
    }
    System.out.println("2 largest element is:"+secondMax);
}
}

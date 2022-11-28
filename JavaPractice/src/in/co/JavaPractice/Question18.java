package in.co.JavaPractice;

public class Question18 {
public static void main(String[] args) {
	int arr [] = {1,2,3,4};
	int num =5;
	int position=0;
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==num) {
			position =i;
			break;
		}else {
			position = -1;
		}
	}
	System.out.println("Position of element is:"+position);
}
}

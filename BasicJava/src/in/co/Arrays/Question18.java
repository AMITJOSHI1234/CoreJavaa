package in.co.Arrays;

public class Question18 {
 public static void main(String[] args) {
	int arr []= {10,9,8,7,6,1};
	int element =1;
	int position = 0;
	for(int i=0;i<arr.length;i++) {
		if(arr[i] == element) {
			position = i;
			break;
		} else {
			position = -1;
		}
	}
	System.out.println("Position of element is:"+position);
}
}

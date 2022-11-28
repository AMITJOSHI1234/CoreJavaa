package in.co.ExceptionalHandeling;

public class basicQuestion18 {
public static void main(String[] args) {
	int arr[] = {1,2,3,4,5};
	int num = 5;
	int position=0;
	try {
		for(int i =0 ;i<arr.length;i++) {
			if(arr[i] == num) {
				position = i;
				break;
			}else {
				position = -1;
			}
		}
		System.out.println("Position of element is:"+position);
	} catch (Exception e) {
		System.out.println(e.getMessage());
	}
}
}

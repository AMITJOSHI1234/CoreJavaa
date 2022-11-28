package in.co.Inheritance;

public class ChildClass1 extends ParentClass1 {
public void arr2() {
	int arr[] = {1,2,3,4,5};
	int num=4;
	int position = 0;
	
	for(int i =0 ; i<arr.length;i++) {
		if(arr[i] == num) {
			position = i;
			break;
		}else {
			position = -1;
		}
	}
	System.out.println("Position of element in array is:"+position);
}
}

package in.co.SetterGetterAndConstructor;

public class ConstructorQuestion15 {
public int getArr() {
	int arr[] = {2,5,8,9,20,4};
	int max = arr[0];
	
	for(int i=0;i<arr.length;i++) {
		if(arr[i]>max) {
			max = arr[i];
		}
	}
	
	return max;
}

public ConstructorQuestion15() {
	super();
}
}

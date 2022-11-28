package in.co.SetterGetterAndConstructor;

public class ConstructorQuestion18 {
private int num;

public int getnum() {
	int arr[] = {1,2,3,4,5};
	int position=0;
	
	for(int i =0 ; i<arr.length;i++) {
		if(arr[i]==num) {
			position =i;
			break;
		}else {
			position = -1;
		}
	}
	
	return position;
	
}

public ConstructorQuestion18(int num) {
	this.num = num;
}
}

package in.co.SetterGetterAndConstructor;

public class ConstructorQuestion17 {
public void getarr() {
	int start[] = {1,2,3,4,5,6};
	int end[] = {1,2,3};
	
	for(int i = 0 ;i<start.length;i++) {
		int count = 0;
		for(int j =0 ;j<end.length;j++) {
			if(start[i]==end[j]) {
				count++;
			}
		}
		
		if(count == 0) {
			System.out.println("Missing element is:"+start[i]);
		}
	}
}

public ConstructorQuestion17() {
	super();
}
}

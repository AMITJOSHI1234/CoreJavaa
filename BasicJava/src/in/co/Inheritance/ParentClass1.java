package in.co.Inheritance;

public class ParentClass1 {
public void arr1() {
	int a1[] = {1,2,3,4};
	int a2 [] = {1,2,3};
	
	for(int i = 0 ; i<a1.length ; i++) {
		int count = 0;
		for(int j=0;j<a2.length;j++) {
			if(a1[i] == a2[j]) {
				count++;
			}
		}
		
		if(count==0) {
			System.out.println(a1[i]);
		}
	}
}
}

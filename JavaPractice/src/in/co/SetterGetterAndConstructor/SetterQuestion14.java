package in.co.SetterGetterAndConstructor;

public class SetterQuestion14 {
private int average;

public void setaverage(int num) {
	this.average = num;
}

public int getaverage1() {
	int evsum =0;
	int odsum =0;
	for(int i =1; i<50 ; i++) {
		if(i%2==0) {
			evsum= evsum+i;
		} else {
			odsum = odsum+i;
		}
	}
	
	this.average = (evsum + odsum)/50;
	return average;
}
}

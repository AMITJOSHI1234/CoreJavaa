package in.co.Collection;

import java.util.Comparator;

public class Question2Comparator implements Comparator<Question2Salary> {

	@Override
	public int compare(Question2Salary o1, Question2Salary o2) {
		if(o1.salary > o2.salary) {
			return 1;
		} else if(o1.salary == o2.salary) {
			return 0;
		}else {
			return -1;
		}
	}

	

}

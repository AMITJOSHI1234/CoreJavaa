package in.co.Collection;

import java.util.Comparator;

public class OrderByMarks implements Comparator<Marksheet2> {

	@Override
	public int compare(Marksheet2 o1, Marksheet2 o2) {
		if(o1.marks > o2.marks) {
			return 1;
		}else if(o1.marks == o2.marks) {
			return 0;
		}else {
			return -1;
		}
	}

}

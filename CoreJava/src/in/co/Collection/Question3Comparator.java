package in.co.Collection;

import java.util.Comparator;

public class Question3Comparator implements Comparator<Question3Employee> {

	@Override
	public int compare(Question3Employee o1, Question3Employee o2) {
	if(o1.firstname.equals(o2.firstname)) {
       return o1.lastname.compareTo(o2.lastname);
	} else if(o1.lastname.equals(o2.lastname)) {
		return o1.firstname.compareTo(o2.firstname);
	} else {
		return o1.firstname.compareTo(o2.firstname);
	}
	}

}

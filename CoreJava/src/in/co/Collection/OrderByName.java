package in.co.Collection;

import java.util.Comparator;

public class OrderByName implements Comparator<Marksheet1> {

	public int compare(Marksheet1 o1, Marksheet1 o2) {
		// TODO Auto-generated method stub
	   return o1.name.compareTo(o2.name);
	}

}

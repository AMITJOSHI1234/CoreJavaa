package in.co.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Question3 {
public static void main(String[] args) {
	ArrayList arr = new ArrayList();
	
	Question3Employee q1 = new Question3Employee("Rahul", "Jain");
	Question3Employee q2 = new Question3Employee("Amit", "Joshi");
	Question3Employee q3 = new Question3Employee("Zakir", "jain");
	Question3Employee q4 = new Question3Employee("Mohit", "sharma");
	
	arr.add(q1);
	arr.add(q2);
	arr.add(q3);
	arr.add(q4);
	
	System.out.println("-------Before Sorting--------");
	
	Iterator it = arr.iterator();
	
	while(it.hasNext()) {
		Object ob = it.next();
		System.out.println(ob);
	}
	
	System.out.println("-------After Sorting--------");
	
	Question3Comparator question = new Question3Comparator();
	
	Collections.sort(arr,question);
	
	for(Object ob : arr) {
		System.out.println(ob);
	}
}
}

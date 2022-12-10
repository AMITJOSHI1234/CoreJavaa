package in.co.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ResultMain3 {
public static void main(String[] args) {
	ArrayList hash = new ArrayList<>();
	
	OrderByMarks ord = new OrderByMarks();
	Marksheet2 m1 = new Marksheet2("101", "AJ", 92);
	Marksheet2 m2 = new Marksheet2("102", "PJ", 95);
	Marksheet2 m3 = new Marksheet2("103", "MJ", 90);
	
	hash.add(m1);
	hash.add(m2);
	hash.add(m3);
	
	System.out.println("-----After Sorting----");
	
	Collections.sort(hash,ord);
	
	for(Object o : hash) {
		System.out.println(o);
	}
	
}
}

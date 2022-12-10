package in.co.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class ResultMain2 {
public static void main(String[] args) {
	ArrayList<Marksheet1> arr = new ArrayList<Marksheet1>();
	
	arr.add(new Marksheet1("101", "Zakir", 75));
	arr.add(new Marksheet1("102", "Jai", 72));
	arr.add(new Marksheet1("103", "Amit", 85));
	
	OrderByName ord = new OrderByName();
	
	System.out.println("----After Sorting-----");
	
	Collections.sort(arr , ord);
	
	for(Object obj : arr) {
		System.out.println(obj);
	}
}
}

package in.co.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Sorting1{
public static void main(String[] args) {
	ArrayList arr = new ArrayList();
	
	arr.add(10);
	arr.add(2);
	arr.add(9);
	arr.add(15);
	arr.add(12);
	
	Iterator it = arr.iterator();
	
	while(it.hasNext()) {
		Object o = it.next();
		System.out.println(o);
	}
	
	System.out.println("----After Sorting elements------");
	
	Collections.sort(arr);
	
	for(Object o : arr) {
		System.out.println(o);
	}
}
}

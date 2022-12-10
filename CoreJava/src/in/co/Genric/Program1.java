package in.co.Genric;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Program1 {
public static void main(String[] args) {
	ArrayList<String> arr = new ArrayList<String>();
	
	arr.add("Zakir");
	arr.add("Raj");
	arr.add("Samar");
	arr.add("Vikas");
	arr.add("Amit");
	
	Iterator<String> it = arr.iterator();
	
	while (it.hasNext()) {
		String string = (String) it.next();
		System.out.println(string);
	}
	
	System.out.println("-------After Sorting ----------");
	
	Collections.sort(arr);
	
	for(String s : arr) {
		System.out.println(s);
	}
	
}
}

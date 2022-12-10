package in.co.Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Resultmain {
public static void main(String[] args) {
	ArrayList marksheet = new ArrayList();
	
	MarksSheet m1 = new MarksSheet("104", "Amit", 85);
	MarksSheet m2 = new MarksSheet("102", "Ram", 98);
	MarksSheet m3 = new MarksSheet("101", "Sham", 99);
	
	marksheet.add(m1);
	marksheet.add(m2);
	marksheet.add(m3);
	
	System.out.println("----After Sorting -------");
	
	Collections.sort(marksheet);
	
	for(Object o : marksheet) {
		System.out.println(o);
	}
}
}

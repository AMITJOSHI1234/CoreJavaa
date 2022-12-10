package in.co.Collection;

import java.util.ArrayList;
import java.util.Collections;

public class Question2 {
public static void main(String[] args) {
	ArrayList arr = new ArrayList();
	
	Question2Salary q1 = new Question2Salary(15000);
	Question2Salary q2 = new Question2Salary(5000);
	Question2Salary q3 = new Question2Salary(20000);
	Question2Salary q4 = new Question2Salary(2000);
	
	arr.add(q1);
	arr.add(q2);
	arr.add(q3);
	arr.add(q4);
	
	System.out.println("----Before Sorting-----");
	
	for(Object ob1 : arr) {
		System.out.println(ob1);
	}
	
	Question2Comparator question = new Question2Comparator();
	
	Collections.sort(arr , question);
	
	System.out.println("----After sorting------");
	
	for(Object ob : arr) {
		System.out.println(ob);
	}
}
}

package in.co.Collection;

public class Marksheet1 implements Comparable<Marksheet1> {
public String rollno;
public String name;
public int marks;

public Marksheet1(String rollno , String name , int marks) {
	this.rollno = rollno;
	this.name = name;
	this.marks = marks;
}

public String toString() {
	return "Markssheet [rollNo = " + rollno + "name = "+name + "marks = "+ marks +"]";
}

@Override
public int compareTo(Marksheet1 o) {
	return 0;
}

}

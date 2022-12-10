package in.co.Collection;

public class Marksheet2 implements Comparable<Marksheet2> {
public String Rollno;
public String name;
public int marks;

public Marksheet2(String rollno , String name , int num) {
	this.Rollno = rollno;
	this.name = name;
	this.marks = num;
}

public String toString() {
	return "Markssheet [rollNo = " + Rollno + "name = "+name + "marks = "+ marks +"]";
}

@Override
public int compareTo(Marksheet2 o) {
	// TODO Auto-generated method stub
	return 0;
}
}

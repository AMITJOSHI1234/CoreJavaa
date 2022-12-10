package in.co.Collection;

public class MarksSheet implements Comparable<MarksSheet> {
public String rollno;
public String name;
public int marks;

public MarksSheet(String rollno , String name , int marks) {
	this.rollno = rollno;
	this.name = name;
	this.marks = marks;
}

@Override
public int compareTo(MarksSheet o) {
	// TODO Auto-generated method stub
	return this.rollno.compareTo(o.rollno);
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Markssheet [rollNo = " + rollno + "name = "+name + "marks = "+ marks +"]";
}

}

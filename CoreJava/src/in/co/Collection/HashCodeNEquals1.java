package in.co.Collection;

public class HashCodeNEquals1 implements Comparable<HashCodeNEquals1> {
public String rollno;
public String name;
public int marks;

public HashCodeNEquals1(String rollno , String name , int marks) {
	this.rollno = rollno;
	this.name = name;
	this.marks = marks;
}

public boolean equals(Object o) {
	if(o == null) {
		return false;
	}
	if(!(o instanceof HashCodeNEquals1)) {
		return false;
	}
	
	HashCodeNEquals1 other = (HashCodeNEquals1)o;
	
	return this.rollno.equals(other.rollno);
}

public int hashCode() {
	return rollno.hashCode();
}

public String toString() {
	return rollno +" " + name + " " + marks;
}

public int compareTo(HashCodeNEquals1 o) {
	return rollno.compareTo(o.rollno);
}
}

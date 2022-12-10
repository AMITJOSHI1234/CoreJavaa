package in.co.Collection;

public class HashCode1 implements Comparable <HashCode1>  {
public String rollno;
public String name;
public int marks;

public HashCode1(String rollno , String name , int marks) {
	this.rollno = rollno;
	this.name = name;
	this.marks = marks;
}

public int hashCode() {
	return name.hashCode();
}

public boolean equals(Object o) {
	HashCode1 hash = (HashCode1) o;
	return this.name.equals(hash.name);
}

@Override
public int compareTo(HashCode1 o) {
	// TODO Auto-generated method stub
	return name.compareTo(o.name); 
}

@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}


 
}

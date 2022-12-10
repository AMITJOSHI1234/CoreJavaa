package in.co.Collection;

public class HashCode2 implements Comparable<HashCode2> {
public String rollno;
public String name;
public int marks;

public HashCode2(String rollno , String name , int marks) {
	this.rollno = rollno;
	this.name = name;
	this.marks = marks;
}

public int HashCode() {
	return name.hashCode();
}

public boolean equals(Object o) {
	if(o == null) {
		return false;
	}
	if(!(o instanceof HashCode2))
		return false;
	
	HashCode2 hash = (HashCode2) o;
	return this.name.equals(hash.name);
}

@Override
public int compareTo(HashCode2 o) {
	// TODO Auto-generated method stub
	return name.compareTo(o.name);
}
}

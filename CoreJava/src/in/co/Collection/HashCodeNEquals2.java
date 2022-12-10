package in.co.Collection;

public class HashCodeNEquals2 implements Comparable<HashCodeNEquals2> {
public String rollno;
public String name;
public int marks;

public HashCodeNEquals2(String rollno , String name , int marks) {
	this.rollno = rollno;
	this.name = name;
	this.marks = marks;
}

public boolean equals(Object o) {
	if(o == null)
     return false;
	
	if(!(o instanceof HashCodeNEquals2))
		return false;
	
	HashCodeNEquals2 object = (HashCodeNEquals2) o;
	return this.rollno.equals(object.rollno);
}

public int hashCode() {
	return rollno.hashCode();
}

	@Override
public String toString() {
	// TODO Auto-generated method stub
	return super.toString();
}

	//@Override
	public int compareTo(HashCodeNEquals2 o) {
		// TODO Auto-generated method stub
		return rollno.compareTo(o.rollno);
	}

}

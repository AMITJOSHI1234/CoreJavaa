package in.co.Collection;

public class Question3Employee implements Comparable<Question3Employee> {
public String firstname;
public String lastname;

public Question3Employee(String firstname , String lastname) {
	this.firstname = firstname;
	this.lastname = lastname;
}



@Override
public String toString() {
	// TODO Auto-generated method stub
	return "Employee[Firstname = " + firstname +" " +"lastname = " + lastname  + "]";
}

@Override
public int compareTo(Question3Employee o) {
	return 0;
}

}

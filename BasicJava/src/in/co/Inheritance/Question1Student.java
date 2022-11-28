package in.co.Inheritance;

public class Question1Student extends Question1Person {

	public Question1Student(String name, String address, String dob) {
		super(name, address, dob);
		// TODO Auto-generated constructor stub
	}
	
private String rollno;
private int marks;

public void setroll(String roll) {
	this.rollno = roll;
}

public String getroll() {
	return rollno;
}

public void setmarks(int marks) {
	this.marks = marks;
}

public int getmarks() {
	return marks;
}

}

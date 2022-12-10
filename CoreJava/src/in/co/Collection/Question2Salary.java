package in.co.Collection;

public class Question2Salary implements Comparable<Question2Salary> {
public int salary;
	
	public Question2Salary(int salary) {
		this.salary = salary;
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Salary[Salary  = " + salary +" ]";
	}


	@Override
	public int compareTo(Question2Salary o) {
		
		return 0;
	}

}

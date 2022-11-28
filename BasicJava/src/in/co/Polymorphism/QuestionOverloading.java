package in.co.Polymorphism;

public class QuestionOverloading {
public static void main(String[] args) {
	QuestionOverloading q = new QuestionOverloading();
	q.add();
	q.add(50);
	q.add(20, 20);
}

public void add() {
	int a =10;
	int b=20;
	
	int sum = a+b;
	System.out.println("Addition is:"+sum);
}

public void add(int a) {
	int b=20;
	
	int sum = a+b;
	System.out.println("Addition is:"+sum);
}

public void add(int a , int b) {
	int sum = a+b;
	System.out.println("Addition is:"+sum);
}
}

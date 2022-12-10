package in.co.Threads;

public class PriorityThread1main {
public static void main(String[] args) {
	ProrityThread1 pr = new ProrityThread1("hello");
	ProrityThread1 pr1 = new ProrityThread1("Java");
	
	pr.setPriority(7);
	pr1.setPriority(5);
	
	pr.start();
	pr1.start();
}
}

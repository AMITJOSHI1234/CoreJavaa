package in.co.Threads;

public class Prioritythread1main1 {
public static void main(String[] args) {
	PriorityThread1 pr = new PriorityThread1("Hello");
	PriorityThread1 pr1 = new PriorityThread1("Java");
	PriorityThread1 pr2 = new PriorityThread1("World");
	
	pr.setPriority(10);
	pr1.setPriority(6);
	pr2.setPriority(2);
	
	pr.start();
	pr1.start();
	pr2.start();
}
}

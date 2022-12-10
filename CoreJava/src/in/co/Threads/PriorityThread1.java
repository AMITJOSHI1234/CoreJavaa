package in.co.Threads;

public class PriorityThread1 extends Thread {
public PriorityThread1(String name) {
	super(name);
}

public void run() {
	for(int i =1 ; i< 5 ;i++) {
		System.out.println(getName() + " " + getPriority());
	}
}
}

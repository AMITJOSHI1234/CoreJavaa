package in.co.Threads;

public class ProrityThread1 extends Thread {
 public ProrityThread1(String name) {
	 super(name);
 }
 
 public void run() {
	 for(int i =1 ; i<=5 ; i++) {
		 System.out.println(getName() + " " + getPriority());
	 }
 }
}

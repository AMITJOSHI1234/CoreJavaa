package in.co.Threads;

public class HelloThread1 extends Thread {
public String name =null;

public HelloThread1(String name) {
	this.name = name;
}

public void run() {
	for(int i=1 ; i<=5 ; i++) {
		System.out.println(i +" " + name);
	}
}
}

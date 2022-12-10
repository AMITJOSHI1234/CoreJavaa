package in.co.Threads;

public class HelloThresd extends Thread {
String name = null;

public HelloThresd(String n) {
	name = n;
}

public void run() {
	for(int i=1;i<=5 ;i++) {
		System.out.println(i + " " + name);
	}
}
}

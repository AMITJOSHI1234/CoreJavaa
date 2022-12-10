package in.co.Threads;

public class HelloNoThread1 {
String name = null;

public HelloNoThread1(String n) {
	this.name = n;
}

public void run() {
	for(int i=1 ; i<=5 ; i++) {
		System.out.println(i + " " + name);
	}
}
}

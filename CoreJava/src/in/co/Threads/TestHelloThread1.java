package in.co.Threads;

public class TestHelloThread1 {
public static void main(String[] args) {
	HelloThread1 h1 = new HelloThread1("Amit");
	HelloThread1 h2 = new HelloThread1("Joshi");
	
	h1.start();
	h2.start();
}
}

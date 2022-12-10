package in.co.Threads;

public class TestHelloThread {
public static void main(String[] args) {
	HelloThresd h1 = new HelloThresd("Amit");
	HelloThresd h2 = new HelloThresd("Joshi");
	
	h1.start();
	
	h2.start();
}
}

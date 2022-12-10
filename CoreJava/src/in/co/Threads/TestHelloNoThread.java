package in.co.Threads;

public class TestHelloNoThread {
public static void main(String[] args) {
	HelloNoThread h1 = new HelloNoThread("Ram");
	HelloNoThread h2 = new HelloNoThread("Shayam");
	
	h1.run();
	h2.run();
}
}

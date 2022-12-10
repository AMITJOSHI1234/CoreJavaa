package in.co.Threads;

public class TestHelloNoThread1 {
public static void main(String[] args) {
	HelloNoThread1 t1 = new HelloNoThread1("Raj");
	HelloNoThread1 t2 = new HelloNoThread1("Vikas");
	
	t1.run();
	t2.run();
}
}

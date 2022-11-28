package in.co.Interfaces;

public class calci implements Calculator {

	@Override
	public void add() {
		// TODO Auto-generated method stub
		int c = a+b;
		System.out.println("Addition is:"+c);
	}

	@Override
	public void sub() {
		int c = b-a;
		System.out.println("Subtraction:"+c);
		
	}

	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		int c =a*b;
		System.out.println("Multiplication is:"+c);
	}

	@Override
	public void divide() {
		// TODO Auto-generated method stub
		int c = b/a;
		System.out.println("Divide is:"+c);
		
	}

}

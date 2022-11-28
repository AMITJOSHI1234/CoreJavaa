package in.co.SetterGetterAndConstructor;

public class TestQuestion2 {
public static void main(String[] args) {
	ConstructorQusetion2 con = new ConstructorQusetion2(10, 20, 30);
	
	int min = con.get();
	System.out.println("Smallest number is:"+min);
}
}

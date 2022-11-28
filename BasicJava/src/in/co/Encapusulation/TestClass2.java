package in.co.Encapusulation;

public class TestClass2 {
public static void main(String[] args) {
	Encapsulation2 en = new Encapsulation2();
	en.setadd(40, 50);
	en.setsub(30, 40);
	
	int add = en.getadd();
	System.out.println("Add:"+add);
	
	int sub = en.getsub();
	System.out.println("Sub:"+sub);
}
}

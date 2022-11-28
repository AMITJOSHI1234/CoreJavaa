package in.co.Constructor1;

public class TestTask3 {
public static void main(String[] args) {
	ConstructorTask3 c =new ConstructorTask3("BloodRed", 450, 6, "BMW");
	
	String colour = c.getcolour();
	System.out.println("Colour of my Car:"+colour);
	
	int speed = c.getspeed();
	System.out.println("Speed of my car:"+speed);
	
	int gear = c.getgear();
	System.out.println("My car have "+gear+" gears");
	
	String make = c.getmake();
	System.out.println("My car brand is:"+make);
}
}

package in.co.Encapusulation;

public class TestTask2 {
public static void main(String[] args) {
	encapsulationTask3 en =new encapsulationTask3();
	en.setcolour("BloodRed");
	en.setgear(5);
	en.setmake("B.M.W");
	en.setspeed(100);
	
	String colour = en.getcolour();
	System.out.println("Colour of my car:"+colour);
	
	int gear = en.getgear();
	System.out.println("I am at "+gear +" gear.");
	
	String make = en.getmake();
	System.out.println("Brand of my car is:"+make);
	
	int speed = en.getspeed();
	System.out.println("Speed of my car is:"+speed);
}
}

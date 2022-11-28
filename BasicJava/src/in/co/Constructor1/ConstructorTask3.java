package in.co.Constructor1;

public class ConstructorTask3 {
private String Colour;
private int Speed;
private int gear;
private String make;

public String getcolour() {
	return Colour;
}

public int getspeed() {
	return Speed;
}

public int getgear() {
	return gear;
}

public String getmake() {
	return make;
}

public ConstructorTask3(String colour, int speed , int gear, String make) {
	this.Colour = colour;
	this.gear = gear;
	this.Speed = speed;
	this.make = make;
}
}

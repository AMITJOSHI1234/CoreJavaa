package in.co.Inheritance;

public class Circle extends Rectangle {
	private double radius;
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double CircleArea() {
		double area = 3.14 *radius *radius;
		return area;
	}

}

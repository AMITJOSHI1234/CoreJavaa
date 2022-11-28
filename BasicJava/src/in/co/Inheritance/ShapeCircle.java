package in.co.Inheritance;

public class ShapeCircle extends Shape {
private double radius;

public double getRadius() {
	return radius;
}

public ShapeCircle(double radius) {
	this.radius = radius;
}

public double area() {
	double area = 3.14 * radius * radius;
	return area;
}
}

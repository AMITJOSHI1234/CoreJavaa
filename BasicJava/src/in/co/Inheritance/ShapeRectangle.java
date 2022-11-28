package in.co.Inheritance;

public class ShapeRectangle extends Shape {
private double length;
private double width;

public double getLength() {
	return length;
}

public double getWidth() {
	return width;
}

public ShapeRectangle(double length , double width) {
	this.length = length;
	this.width = width;
}

public double area() {
	double area = length * width;
	return area;
}
}

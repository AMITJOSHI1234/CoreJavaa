package in.co.OOPExcercise;

public class Question1Circle extends Question1Shape {
private double radius;

public void setRadius(double radius) {
	this.radius = radius;
}

public double getRadius() {
	return radius;
}

public double Circlearea() {
	double area = 3.14 * radius * radius;
	return area;
}
}

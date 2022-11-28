package in.co.JavaPractice;

public class Circle extends Shape {
private double radius;
public void setRadius(double radius) {
	this.radius = radius;
}

public void area() {
	double area = 3.14 * radius *radius;
	System.out.println(area);
}
}

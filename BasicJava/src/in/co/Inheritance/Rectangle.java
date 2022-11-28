package in.co.Inheritance;

public class Rectangle extends Trangle {
private double height;
private double width;

public void setHeight(double height) {
	this.height = height;
}

public double getHeight() {
	return height;
}

public void setWidth(double width) {
	this.width = width;
}

public double getWidth() {
	return width;
}
public double Recarea() {
	double area = height * width;
	return area;
}
}

package in.co.OOPExcercise;

public class Question1Rectangle {
private double length;
private double width;

public void setLength(double length) {
	this.length = length;
}

public double getLength() {
	return length;
}

public void setWidth(double width) {
	this.width = width;
}

public double getwidth() {
	return width;
}

public double Rectanglearea() {
	double area = length * width;
	System.out.println(area);
	return area;
}
}

package in.co.Inheritance;

public class Trangle extends ShapeInherit {
private double length;
private double height;

public void setLength(double length) {
	this.length = length;
}

public double getLength() {
	return length;
}

public void setheight(double height) {
	this.height = height;
}

public double getheight() {
	return height;
}
public double areaTrangle()
{
	double area = 0.5*length*height;
	return area;
}

}
